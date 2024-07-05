import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        for (int i=0;i<5;i++){
            int a = s.nextInt();
            int apow = a*a;
            hap+=apow;
        }
        System.out.print(hap%10);
    }
}