import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        int c = s.nextInt();

        int ia = Integer.parseInt(a);
        int ib = Integer.parseInt(b);

        System.out.println(ia+ib-c);
        System.out.println(Integer.parseInt(a+b)-c);
    }
}