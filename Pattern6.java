import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rowCount = scn.nextInt();
        int rowHalf = rowCount/2;
        int count = rowCount+2;
        int start = (count+1)/2;
        int left = start;
        int right = start;

        for(int i=1; i<= rowHalf; i++){
            for(int j=1; j<= count; j++){
                if(j>=left && j<=right){
                    System.out.print("\t");
                }else{
                    System.out.print("*"+"\t");
                }
            }

            left--;
            right++;
            System.out.println("");
        }

        for(int i=1; i<= rowHalf+1; i++){
            for(int j=1; j<= count; j++){
                if(j>=left && j<=right){
                    System.out.print("\t");
                }else{
                    System.out.print("*"+"\t");
                }
            }
            
            left++;
            right--;
            System.out.println("");
        }

    }
}
