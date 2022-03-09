import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
        int num = scn.nextInt();
        if(num>max){
            max = num;
        }
        
        if(num<min){
            min = num;
        }
    }
    
    System.out.println(max-min);
 }

}
