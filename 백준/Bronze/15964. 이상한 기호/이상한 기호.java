import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = new Long(s.nextLong());
        long b = new Long(s.nextLong());

        System.out.print((a+b)*(a-b));
    }
}
