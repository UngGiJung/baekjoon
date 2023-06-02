package q3046;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// R2 = (s*2)-R1

		int R1 = sc.nextInt();
		int S = sc.nextInt();
		int R2 = 0;

		R2 = (S * 2) - R1;

		
		sc.close();
		System.out.println(R2);
	}
}
