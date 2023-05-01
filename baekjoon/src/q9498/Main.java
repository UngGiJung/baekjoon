package q9498;

import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		int score = sc.nextInt();
		sc.close();
		
//		//if else 문 풀이법			
//		if (90 <= score && score <= 100){
//			System.out.println("A");
//		} else if 
//			(80 <= score && score < 90) {
//			System.out.println("B");
//		} else if 
//			 (70 <= score && score < 80) {
//			System.out.println("C");
//		} else if 
//			 (60 <= score && score < 70) {
//			System.out.println("D");
//		} else if 
//			 (00 <= score && score < 60) {
//			System.out.println("F");
//		}
		
	 //switch 문 풀이법
		
		int x = score / 10;
		switch (x) {
		case 10:
		case 9:
				System.out.println("A");
				break;
		case 8:
				System.out.println("B");
			    break;
		case 7:
				System.out.println("C");
				break;
		case 6:
				System.out.println("D");
				 break;
		default:
				System.out.println("F");
					
		}
			
	}
	
}
