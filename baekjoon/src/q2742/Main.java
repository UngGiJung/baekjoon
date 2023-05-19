package q2742;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		
		//1. for
		for(int i = N; i >= 1; i--) {
			System.out.println(i);	
		}
		System.out.println("--------------");
		
		// 2. while
		int j = N;
		while (j > 0) {
			System.out.println(j);
			j--;
		}
		System.out.println("--------------");

		// 3. do ~ while
		int k = N;
		do {
			System.out.println(k);
			k--;
		} while (k > 0);
	}
}

