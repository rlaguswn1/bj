import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//입력값이 길어서 long으로 해야함
		long n = s.nextLong();
		long m = s.nextLong();

		//절대값
		System.out.println(Math.abs(n-m));
		s.close();
	}
}