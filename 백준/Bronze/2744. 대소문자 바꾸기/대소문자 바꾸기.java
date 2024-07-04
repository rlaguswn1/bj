import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String c = s.next();

        String[] arr = c.split("",c.length());        
        
        for (int i=0;i<arr.length;i++){
            if (Character.isUpperCase(arr[i].charAt(0))){
                arr[i]=arr[i].toLowerCase();
            }
            else if (Character.isLowerCase(arr[i].charAt(0))){
                arr[i]=arr[i].toUpperCase();
            }
            
        System.out.printf(arr[i]);
        }     
   }
}