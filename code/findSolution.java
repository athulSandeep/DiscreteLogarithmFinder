class findSolution {
    static String discreteLogarithm(int a, int b, int m) {
    	String ni="doesn't exist";
        int n = (int) (Math.sqrt (m) + 1);
        int an = 1;
        for (int i = 0; i < n; ++i)
        	an = (an * a) % m;
        int[] value=new int[m];
        for (int i = 1, cur = an; i <= n; ++i) {
            if (value[ cur ] == 0)
            	value[ cur ] = i;
            cur = (cur * an) % m;
        }
        for (int i = 0, cur = b; i <= n; ++i) {  
            if (value[cur] > 0) {
                int ans = value[cur] * n - i;
                if (ans < m)
                    return String.valueOf(ans);
            }
            cur = (cur * a) % m;
        }
        return ni;
    }
}