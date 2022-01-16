class Solution
{
    public static void sort012(int a[], int n)
    {
        int counter = 0;
        
        for(int i=0; i<n; i++){
            if(a[i]== 0){
                int tmp = a[counter];
                a[counter] = a[i];
                a[i] = tmp;
                counter++;
            }
        }
        
        for(int i=counter; i<n; i++){
            if(a[i] == 1){
                int tmp = a[counter];
                a[counter]= a[i];
                a[i] = tmp;
                counter++;
            }
        }
        
    }
    
}
