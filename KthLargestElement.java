class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        // Using nested for loop
        // int size = arr.length;
        // for(int i=l; i<size-1; i++){
        //     for(int j = i+1; j<size; j++){
        //         if(arr[i]>arr[j]){
        //             int tmp = arr[j];
        //             arr[j] = arr[i];
        //             arr[i] = tmp;
        //         }
        //     }
            
        //     if((i+1)==k){
        //         return arr[i];
        //     }
        // }
        
        // return arr[size-1];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int i=0;i<arr.length;i++){
           pq.add(arr[i]);
       }
       
       for(int i=0;i<k-1;i++){
           pq.poll();
       }
       return pq.peek();
        
    }
    
    
}
