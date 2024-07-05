import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        StringTokenizer t = new StringTokenizer(line);		
		System.out.print(t.countTokens());            
    }        
}