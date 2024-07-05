import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //처음 입력받는만큼 for를 돌린다. 처음 입력은 for 밖에서 받고, 이후 입력은 안에서 받는다.
        // 문자열 반복 출력은 문자열 길이만큼 반복되어야한다.

        int count = s.nextInt();

        for (int i=0;i<count;i++){
            // 문자열 반복수, 문자열 입력
            int a = s.nextInt();
            String b = s.next();
            String[] word = b.split("",b.length());

            // 처음 입력한만큼 반복 출력
            for (int j=0;j<word.length;j++){                
                System.out.print(word[j].repeat(a));
            }

            // 줄바꿈
            System.out.println("");
        }
            
    }
        
}