import java.util.*;
import java.lang.*;
import java.io.*;

//나중에 이어서
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int f = s.nextInt();
        int g = s.nextInt();
        int h = s.nextInt();

        int[] arr = {a,b,c,d,e,f,g,h};

/*
1. 처음이 1
다음 자리가 +1이 아니면 바로 mixed 출력
다음 자리가 +1이면 넘어가기

다 체크하고나면 ascending 출력 >> 이걸 어떻게?

마지막까지 쭉 체크

2. 처음이 8
다음이 7이 아니면 mixed

3. 처음이 2~7
- mixed
*/

        if (a==1){
            for (int i=0; i < arr.length; i++) {
                if (arr[i]==i+1){
                    if (i==7) {
                    System.out.println("ascending");
                    } else {
                        continue;
                    }                    
                } else if (arr[i]!=i+1){
                    System.out.println("mixed");
                    break;
                }

                
                
            }
            
        } else if (a==8) {
            for (int j=0; j<arr.length; j++) {
                if (arr[j]==8-j){
                    if (j==7) {
                    System.out.println("descending");
                    } else {
                        continue;
                    }                    
                } else if (arr[j]!=8-j){
                    System.out.println("mixed");
                    break;
                }
            }
        } else {
            System.out.println("mixed");
        }


    }        
}