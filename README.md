# DiscreteLogarithmFinder

Given three integers a, b and m. Find an integer k such that ak ≡b (mod m), where a and m are relatively prime. Here a Naive approach of running a loop from 0 to m to cover all possible values of k is possible but it is time consuming. So, what we are going to do is to split the problem in two parts of  each and solve them individually and then find the collision. 
We can write 'k' as
k = i∙n - j with n = ⌈√m  ⌉ and 0 ≤ i < n and 0 ≤ j<n.

Therefore, we have:
⇒ a i∙n-j = b (mod m)
⇒ a i∙n = a j ∙ b (mod m)

Therefore, in order to solve, we precompute ai∙n for different values of 'i'. Then fix 'b' and tries values of 'j'. In RHS of the congruence relation above. It tests to see if congruence is satisfied for any value of 'j', using precomputed values of LHS.
