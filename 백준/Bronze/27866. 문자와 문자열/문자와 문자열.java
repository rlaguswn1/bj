import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int num = s.nextInt();
        String[] arr = word.split("",word.length());

        System.out.print(arr[num-1]);
    }
}