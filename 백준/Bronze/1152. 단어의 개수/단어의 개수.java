import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        // 1. 문장 앞뒤 공백 자르기, 공백 단위 스플릿, 공백만 1개인경우 0 출력, 아닌 경우 배열 길이 출력
        String[] word = line.trim().split(" ");   
        
        if (word[0].isEmpty()==true){
            System.out.print(0);
        }
            
        else {
            System.out.println(word.length);
        }             
    }        
}