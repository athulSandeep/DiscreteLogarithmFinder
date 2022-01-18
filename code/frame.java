import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class frame extends JFrame implements ActionListener { 
	Container container=getContentPane();
    JLabel a=new JLabel("a");
    JLabel b=new JLabel("b");
    JLabel m=new JLabel("m");
    JNumberTextField aTextField=new JNumberTextField();
    JNumberTextField bTextField=new JNumberTextField();
    JNumberTextField mTextField=new JNumberTextField();
    JButton findButton=new JButton("FIND");
    JButton resetButton=new JButton("RESET");
    
    frame() {
    	addActionEvent();
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
    }
    public void setLayoutManager() {
    	container.setLayout(null);
    }
    
    public void setLocationAndSize() {
    	a.setBounds(100,50,100,30);
    	b.setBounds(100,100,100,30);
    	m.setBounds(100,150,100,30);
    	aTextField.setBounds(150,50,150,30);
    	bTextField.setBounds(150,100,150,30);
    	mTextField.setBounds(150,150,150,30);
    	findButton.setBounds(100,300,100,30);
    	resetButton.setBounds(200,300,100,30);
    }
    
    public void addComponentsToContainer() {
    	container.add(a);
    	container.add(b);
    	container.add(m);
    	container.add(aTextField);
    	container.add(bTextField);
    	container.add(mTextField);
       	container.add(findButton);
       	container.add(resetButton);
    }
    public void addActionEvent() {
    	findButton.addActionListener(this);
    	resetButton.addActionListener(this);
       	}
   
    @Override
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == findButton) {
    		String ta1,tb1,tm1;
    		int a1,b1,m1;
    		ta1 = aTextField.getText();
    		tb1 = bTextField.getText();
    		tm1 = mTextField.getText();
    		a1=Integer.parseInt(ta1); 
    		b1=Integer.parseInt(tb1);
    		m1=Integer.parseInt(tm1); 
    		JOptionPane.showMessageDialog(null,"vaule of k= "+findSolution.discreteLogarithm(a1, b1, m1),"Answer",JOptionPane.INFORMATION_MESSAGE);
    	}
    	
    	if (e.getSource() == resetButton) {
    		aTextField.setText("");
    		bTextField.setText("");
    		mTextField.setText("");
    	}
    }
} 