package q별찍기5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		for (int i = 0; i < x; i++) {
			for (int j = x - 2; i <= j; j--) {
				System.out.print(" ");
			}
			for (int a = 0; 2*i >= a ; a++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}