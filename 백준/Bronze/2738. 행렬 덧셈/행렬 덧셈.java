import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 크기 입력받기
        int n = s.nextInt();
        int m = s.nextInt();

        // 행렬 총 크기
        int size = n*m;

        // 행렬1 배열 선언, 입력받기
        int[] array1=new int[size];

        for (int i=0;i<size;i++){
            int x = s.nextInt();
            array1[i]=x;
        }        

        // 행렬1과 동일한 개수의 숫자를 입력받고, 행렬1의 요소와 합산
        for (int j=0;j<size;j++){
            int x = s.nextInt();
            array1[j]=array1[j]+x;               
        }

        // 합산한 행렬을 쭉 출력하는데, ln을 만날때마다 줄바꿈
        int ln = m-1;
        
        for (int k = 0; k<size;k++){
            System.out.printf("%d ", array1[k]);
            
            if (k==ln){
                System.out.printf("%n");
                ln+=m;
            }
        }
        
       
   }
}