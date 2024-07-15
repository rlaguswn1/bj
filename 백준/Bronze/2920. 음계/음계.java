import java.util.*;
import java.lang.*;
import java.io.*;

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

마지막까지 쭉 체크

2. 처음이 8
다음이 7이 아니면 mixed
다음 자리가 바로 아래 숫자면 넘어가기

마지막까지 쭉 체크

3. 처음이 2~7 - else
- mixed

1,2는 if에서 이미 arr[0]을 확인하고 넘어온 셈이니 arr[1]부터 체크
*/

        if (a==1){
            for (int i=1; i < arr.length; i++) {
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
            for (int j=1; j<arr.length; j++) {
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
