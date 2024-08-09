import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        /*
        입력형태
        
        참가자수
        티셔츠 사이즈별 수
        티셔츠 묶음당 몇장, 펜 묶음당 몇개

        출력형태
        티셔츠 몇 묶음
        펜 몇묶음 펜 몇개

        ------------------------

        티: 각 사이즈 t로 나눠서 몫만 남기기 (몫이 0이면 +1, 나머지가 0이 아니면 +1)
        펜: 참가자수 p로 나눠서 몫, 나머지 출력
        
        */

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        // double s = sc.nextDouble();
        // double m = sc.nextDouble();
        // double l = sc.nextDouble();
        // double xl = sc.nextDouble();
        // double xxl = sc.nextDouble();
        // double xxxl = sc.nextDouble();
        // double t = sc.nextDouble();
        int s = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int xl = sc.nextInt();
        int xxl = sc.nextInt();
        int xxxl = sc.nextInt();
        int t = sc.nextInt();
        double p = sc.nextDouble();

        int[] arr = new int[]{s,m,l,xl,xxl,xxxl};

        // 티
        int shirt = 0;
        for (int i=0;i<=5;i++){
            
            // 인원이 0이면 패스
            if (arr[i]==0){
                continue;
            }
            
            // 몫이 0이면 +1
            else if (arr[i]/t==0){
                shirt+=1;
            }

            // 아니면 몫을 넣는데 나머지가 0이 아니면 또 +1
            else {
                shirt+=arr[i]/t;
                if (arr[i]%t!=0){
                    shirt+=1;
                }
            }
        }

        int pen_g=(int)(n/p);
        int pen=(int)(n%p);

        System.out.println(shirt);
        System.out.printf("%d %d", pen_g, pen);
    }
}