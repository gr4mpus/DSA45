import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int row = scn.nextInt();
    int col = scn.nextInt();
    int arr[][] = new int[row][col];
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            arr[i][j] = scn.nextInt();
        }
    }

    boolean flag = true;

    for(int i=0; i<col; i++){
        if(flag){
            for(int j=0; j<row; j++){
                System.out.println(arr[j][i]);
            }
            flag = false;
        }else{
            for(int j=row-1; j>-1; j--){
                System.out.println(arr[j][i]);
            }
            flag = true;
        }
    }

    
 }

}
