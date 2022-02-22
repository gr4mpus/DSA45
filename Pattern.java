import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        int start = (count/2)+1;
        int left = start;
        int right = start;

        for(int i=1; i<start; i++){
            for(int j=1; j<=count; j++){
                if(j>=left && j<= right){
                    System.out.print("*"+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            left= left-1;
            right = right+1;
            System.out.println("");
        }

        for(int i=1; i<=start; i++){
            for(int j=1; j<=count; j++){
                if(j>=left && j<= right){
                    System.out.print("*"+"\t");
                }else{
                    System.out.print("\t");
                }
            }

            left= left+1;
            right = right-1;
            System.out.println("");
        }
    }
}
