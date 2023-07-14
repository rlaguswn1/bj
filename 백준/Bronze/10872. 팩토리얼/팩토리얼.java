import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int hap = n;
        
        //0입력시 그냥 1 출력
        if (n==0){
            System.out.println(1);
        }
        
        else{
            /*
            i는 n-1부터 시작
            hap >> n*(n-1) > n*(n-2) ....
            */
            for(int i=1;i<=n-1;i++){
			hap=hap*(n-i);					
		    }
		
		System.out.println(hap);
            
        }

		s.close();
	}
}