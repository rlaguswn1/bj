import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigDecimal a = new BigDecimal(s.next());
        BigDecimal b = new BigDecimal(s.next());

        BigDecimal sumab = a.add(b);
        BigDecimal subab = a.subtract(b);
        System.out.print(sumab.multiply(subab));
    }
}