import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int max = Integer.MIN_VALUE;
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        int num = scn.nextInt();
        if(num>max){
            max = num;
        }
        arr[i] = num;
    }

    for(int i=max; i>0; i--){
        for(int j=0; j<n; j++){
            if(arr[j]>= i){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println("");
    }
 }

}
