class Solution {
    public int getSecondLargest(int[] arr) {
        
         int largest = arr[0];
         int second = -1;
         int n = arr.length;
         for(int i = 0; i<n; i++){
             if(arr[i] > largest){
                 second = largest;
                 largest = arr[i];
             }
             else if(arr[i]!=largest && arr[i]>second){
                 second = arr[i];
             }
         }
        return second;
     }
 }
 
 
 