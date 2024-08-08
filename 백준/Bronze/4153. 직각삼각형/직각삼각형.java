import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        /*
        피타고라스
        숫자 3개중에 가장 큰거 고르기 >> 고르기만 하면 3개 중에 그걸 제외해주는걸 또 해야되니까 그냥 맨 끝으로 밀기
        나머지 2개 제곱해서 더한게 큰거랑 같으면 right
        아니면 wrong
        000이면 끝 >> 0인지를 먼저 체크
        */


            // 3개 입력받기
            Scanner s = new Scanner(System.in);
        
            // 여러줄 받아야하니 while
            while (true) {        
            double a = s.nextDouble();
            double b = s.nextDouble();
            double c = s.nextDouble();
    
            // 0 체크
            if (a==0&&b==0&&c==0){
                break;
                }
            
            double[] arr = new double[]{a,b,c};
            
            // 큰거 고르기
            double tmp = 0;
            for(int i = 0 ; i<=1; i++){
                if (arr[i]>arr[i+1]){
                   tmp=arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1]=tmp; 
                } else {continue;}
            }
       
            // 계산
            if ((Math.pow(arr[0],2)+Math.pow(arr[1],2))==Math.pow(arr[2],2)){
                System.out.println("right");
                } else { System.out.println("wrong");}
            }

        }
    }