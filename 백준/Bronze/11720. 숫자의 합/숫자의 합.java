import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 처음 입력받는 숫자만큼 for를 돌려서 누적시킨다
        int leng = s.nextInt();
        String num = s.next();
        int hap = 0;

        for (int i=0;i<leng;i++){
            int now = Character.getNumericValue(num.charAt(i));
            hap+=now;
        }
        System.out.print(hap);
        
    }
}