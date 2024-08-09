import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        /*
        분모는 그대로 출력
        분자는 b에서 빼서 출력
        */
        System.out.printf("%d %d",b-a, b);

        
    }
}