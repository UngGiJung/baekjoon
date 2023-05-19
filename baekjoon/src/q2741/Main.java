package q2741;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int b = sc.nextInt();
		int a [] = new int[b];
	
		
		//1. for
		for (int i = 0; i <= a.length-1; i++ ) {
			a[i] = i+1;
			System.out.println(a[i]);
		}
		System.out.println("--------------");
		
		// 2. while
		int j = 1;
		while (j <= b) {
			System.out.println(j);
			j++;
		}
		System.out.println("--------------");
		
		// 3. do ~ while
		int k = 1;
		do {
			System.out.println(k);
			k++;
		}while(k <= b);
		
		
		sc.close();
	}
}
