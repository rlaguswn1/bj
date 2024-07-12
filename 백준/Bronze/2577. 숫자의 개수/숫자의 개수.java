import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int abc=a*b*c;

        // abc를 string으로 변환, charAt을 통해 인덱스로 접근해서 switch로 확인해 배열 내 숫자를 +1 해준다.
        //int+""와 같이 int 뒤에 공백을 붙이면 string으로 변환이 된다.
        String s_abc=abc+"";

        // 0~9 갯수 저장할 배열      
        int[] arr={0,0,0,0,0,0,0,0,0,0};

        for (int i=0;i<s_abc.length();i++){
            char t = s_abc.charAt(i);
            switch (Character.getNumericValue(t)) {
                case 0: arr[0]++; break;
                case 1: arr[1]++; break;
                case 2: arr[2]++; break;
                case 3: arr[3]++; break;
                case 4: arr[4]++; break;
                case 5: arr[5]++; break;
                case 6: arr[6]++; break;
                case 7: arr[7]++; break;
                case 8: arr[8]++; break;
                case 9: arr[9]++; break;
                default: System.out.println("안걸림"); 
            }
        
        }

        //갯수 센 배열 출력
        for (int k=0;k<10;k++){
            System.out.println(arr[k]);
        }

    }        
}