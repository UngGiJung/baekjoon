package q10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
	 		 int a [] = new int[5];
	 		 int ag = 0;
	 		 
	 		 
		 for (int i = 0; i <a.length; i++) {
			 a[i] = sc.nextInt();
			 sc.close();
			 
			 if(a[i] < 40) {
				 a[i] = 40;
			 }
			 ag += a[i];
		 }
		 System.out.println(ag/a.length);
	}
}
