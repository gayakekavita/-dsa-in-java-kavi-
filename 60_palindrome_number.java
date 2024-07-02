class Solution {
    public boolean isPalindrome(int x) {

        int sum=0;
        int num=x;
        while(x>0)
        {
            int digit= x%10;
            x=x/10;
            sum=sum*10+ digit;
        }
        if(sum==num)
        {
            return true ;
        }
        else
        {
            return false;
        }
    
        
    }
}
