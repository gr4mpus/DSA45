Try 1

// class Solution {
//     int getMinDiff(int[] arr, int n, int k) {
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         int minIndex = 0;
//         int minValue;
        
//         for(int i=0; i<n ;i++){
//             if(arr[i] < min){
//                 min = arr[i];
//                 minIndex = i;
//             }
//         }
        
//         minValue = arr[minIndex]+k;
        
        
//         for(int i=0; i<n; i++){
//             if(arr[i] != minIndex){
//                 if(arr[i]-k < min){
//                     arr[i] = arr[i]+k;
//                 }else{
//                     arr[i] = arr[i]-k;
//                 }
                
//                 if(arr[i]>max){
//                     max = arr[i];
//                 }
//             }
//         }
        
//         // System.out.println(minValue+" : "+max);
//         return max-minValue;
//         // 7 11 8 9 12 7 5 8 7 6
        
//     }
// }
