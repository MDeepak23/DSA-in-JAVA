// 3370
/*
3370. Smallest Number With All Set Bits

You are given a positive number n.

Return the smallest number x greater than or equal to n, such that the binary representation of x contains only set bits

Example 1:

Input: n = 5

Output: 7

Explanation:

The binary representation of 7 is "111".
*/
class Small_setBits {
    public int smallestNumber(int n) {
        int x=1;
        while(x<n){
            x = x*2+1;
        }
        return x;
    }
   
}
