package q별찍기3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		for ( int i = 0; i < x; i++) {
			for(int j = x; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
