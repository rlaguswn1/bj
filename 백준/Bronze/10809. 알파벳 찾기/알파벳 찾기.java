import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();

        /*
        아스키코드 이용 a=97, z=122
        baekjoon이면 b가 몇번째인지 출력
        배열을 -1로 채워놓고 업데이트
        필요한거 >> 이 글자가 단어 내에서 몇번째 글자인지 (for i), a~z로 나열했을때 몇번째인지 >> 배열       
        
        처음 등장하는 위치를 출력 >> 중복제거 필요?
        set >> 순서가 없으므로 나중에 갖다쓰기 힘듦
        만약에 지금 넣으려는 자리가 -1이 아니면 체크가 되었었다는 의미이기 때문에 처음 등장하는 문자가 아니지 않을까?
        */        
        
        int[] num = new int[26];

        // -1 넣기
        for (int i=0;i<num.length;i++) {
            num[i]=-1;
        }

        for(int i = 0; i<word.length(); i++){
            //이 글자의 아스키코드
            int test = (int)word.charAt(i);

            /*
            a~z까지중에 몇번째?
            지금 자리가 -1 외의 숫자일 경우 건너뛰고
            그렇지 않다면 업데이트
            */
            if (num[test-97]!=-1){
                continue;
            } else {
                num[test-97]=i; 
            }
                                     
        }

        //출력
        for (int i=0;i<num.length;i++) {
            System.out.printf("%d ", num[i]);
            
        }
        
    }
}