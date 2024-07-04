import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int size = n*m;

        int[] array1=new int[size];

        for (int i=0;i<size;i++){
            int x = s.nextInt();
            array1[i]=x;
        }        

        for (int j=0;j<size;j++){
            int x = s.nextInt();
            array1[j]=array1[j]+x;               
        }

        int ln = m-1;
        
        for (int k = 0; k<size;k++){
            System.out.printf("%d ", array1[k]);
            
            if (k==(m-1)){
                System.out.printf("%n");
                ln+=m;
            }
            else if (k==ln){
                System.out.printf("%n");
                ln+=m;
            }
        }
        
       
   }
}