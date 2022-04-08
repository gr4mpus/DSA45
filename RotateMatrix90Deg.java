import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int array[][] = new int[n][n];
        
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                array[row][col] = scn.nextInt();
            }
        }
        
        display(exchangeHorizontally(transpose(array)));
        
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] transpose(int[][] array){
        int len = array.length;
        for(int row=0; row<len; row++){
            for(int col=0; col<row; col++){
                int temp = array[row][col];
                array[row][col] = array[col][row];
                array[col][row] = temp;
            }
        }
        
        return array;
    }
    
    public static int[][] exchangeHorizontally(int[][] array){
        int len = array.length;
        int mid = len/2;
        if(array.length%2 == 0){
            mid--;
        }
        
        for(int row=0; row<len; row++){
            for(int col=0; col<=mid; col++){
                int temp = array[row][col];
                array[row][col] = array[row][len-1-col];
                array[row][len-1-col] = temp;
            }
        }
        
        return array;
    }

}
