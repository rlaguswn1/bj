import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 몇번 입력받을건지
        int cnt = s.nextInt();        
        
        for (int i=0;i<cnt;i++){

            int h = s.nextInt();
            int w = s.nextInt();
            int n = s.nextInt();

            // 처음 2자리는 first, 마지막 2자리는 last
            int first = 0;
            int last = 0;

            /*
            게시판으로 따지면 총 w페이지의 게시판에서 n번째 게시글은 몇페이지 몇번째인지 찾는 것과 같음. h는 페이지당 최대 게시글 수
            >> n/h했을때 남는게 없다면 n번째 글은 해당 페이지 가장 마지막 글(꼭대기층)이므로 first=h
            >> n/h했을때 남는게 있다면 n번째 글은 나머지+1 (자기자신)
            */
                if(n%h==0){
                    last=n/h;
                    first = h;
                }
                else {
                    last=n/h+1;
                    first=n%h;
                }
                System.out.printf("%d",first);
                System.out.printf("%02d %n",last);
        }
        
    }
}