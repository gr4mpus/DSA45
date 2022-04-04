import java.io.*;
import java.util.*;

public class Main{
    
public static int[][] takeInput(Scanner scn, int row, int col){
    int arr[][] = new int[row][col];
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            arr[i][j] = scn.nextInt();
        }
    }
    
    return arr;
}

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    // matrix 1
    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int arr1[][] = takeInput(scn, n1,m1);

// matrix 2
    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int arr2[][] = takeInput(scn, n2,m2);
    
    // valid matrix multiplication check
    if(m1 != n2){
        System.out.println("Invalid input");
        return;
    }
    
    // in case if matrix is asked
    // int res[][] = new int[n1][m2];

    for(int row=0; row<n1; row++){
        for(int col=0; col<m2; col++){
            int sum = 0;
            for(int k=0; k<m1; k++){
                sum = sum + (arr1[row][k]*arr2[k][col]);
            }
            
            // in case if matrix is asked
            // res[row][col] = sum;
            System.out.print(sum+" ");
        }
        
        System.out.println("");
    }
    
    
 }
 
}
