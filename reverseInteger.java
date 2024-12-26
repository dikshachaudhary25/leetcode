class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int num = x;
        
        if(num<0){
            x*=-1;
        }
        
        while(x>0){
            int digit = x % 10;

            
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; 
            }

            reverse = (reverse * 10) + digit; 
            x /= 10;
        }
        if(num<0){
            reverse*=-1;
        }
  
        return reverse;
    }
}

