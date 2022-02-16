class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        long max = arr[0];
        long currMax = arr[0];
        for(int i=1; i<n ; i++ ){
            if(currMax+arr[i] > arr[i]){
                currMax+= arr[i];
            }else{
                currMax = arr[i];
            }
            
            if(currMax > max){
                    max = currMax;
            }
        }
        
