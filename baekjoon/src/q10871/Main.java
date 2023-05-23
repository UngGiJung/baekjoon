package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int A [] = new int[N];
		int X = sc.nextInt();
		int E = 0;
		
		
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();

//			System.out.print(A[i] + " ");
			
			if (1 <= N && 10000 >= N && 1 <= X && 10000 >= X) {
				if (A[i] < X) {
					E = A[i];
					System.out.print(E+" ");
				}	
			}
		}
		sc.close();
	}
}
