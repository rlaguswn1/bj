import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String word = s.next();

        System.out.println(word.substring(a-5,a));
                            
    }
}