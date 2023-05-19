package q3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b [] = new int[10];
		int d [] = new int[10];
		int count = 0;
		int count1 = 0;
		
		for (int i = 0; i<=b.length-1; i++) {
			b[i] = sc.nextInt();
			sc.close();
//			System.out.print(b[i]+" ");
			d[i] = b[i]%42;
			if (d[i] != b.length-1) {
				count++;		
			} 
			else {
				count1++;				
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}
}
