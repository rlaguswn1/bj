import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();

        String first = word.substring(0,4);
        String last = word.substring(4,8);

        String a = "asdf";
        String f = "fdsa";
        String j = "jkl;";
        String semi = ";lkj";

        /*
        4글자씩 끊어서 비교

        처음 4자리가 
        1. asdf
          1) jkl; - 계단
          2) ;klj - 밖안
          3) 기타 - molu
        
        2. fdsa
        3. jkl;
        4. ;lkj
        
        */

        switch (first) {
            case "asdf":
                if (last.equals(j)){
                    System.out.println("stairs");
                } else if (last.equals(semi)) {
                    System.out.println("out-in");
                } else {
                    System.out.println("molu");
                }
                break;
                
            case "fdsa":
                if (last.equals(j)){
                    System.out.println("in-out");
                } else {
                    System.out.println("molu");
                }
                break;

            case "jkl;":
                if (last.equals(f)){
                    System.out.println("in-out");
                } else {
                    System.out.println("molu");
                }
                break;

            case ";lkj":
                if (last.equals(a)){
                    System.out.println("out-in");
                } else if (last.equals(f)){
                    System.out.println("reverse");
                } else {
                    System.out.println("molu");
                }
                break;                

            default: System.out.println("molu");

            
        }
            
    }
}