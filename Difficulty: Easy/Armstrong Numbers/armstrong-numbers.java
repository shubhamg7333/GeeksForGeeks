class Solution {
    static boolean armstrongNumber(int n) {
      
     int original = n;
     int sum = 0;
     while (n!=0){
         int remainder = n%10;
         sum = sum + (int)Math.pow(remainder , 3);
         n = n/10;
     }
     return original == sum;
        
    }
}