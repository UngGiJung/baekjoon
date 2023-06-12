package q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		for (int i = 0; i < N; i++) {
//			String cmd = sc.next();
//			int a = sc.nextInt();
//			sc.close();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st stk;
		try {
			String line = br.readLine();
			int cnt = Integer.parseInt(line);
			stk = new st(cnt);
			for (int i = 0; i < cnt; i++) {
				line = br.readLine();
			StringTokenizer q = new StringTokenizer(line);
			String cmd = q.nextToken(); 
//			System.out.println(cmd);
			
			if (cmd.equals("push")) {
				String cmd2 = q.nextToken();
				int p = Integer.parseInt(cmd2);
				stk.push(p);
			} else if (cmd.equals("pop")) {
				stk.pop();
			} else if (cmd.equals("top")) {
				stk.top();
			} else if (cmd.equals("size")) {
				stk.size();
			} else if (cmd.equals("empty")) {
				stk.empty();
			}
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


// java에서 제공되는 '스택' 클래스 활용하여 풀기

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Stack;
//import java.util.StringTokenizer;
//
//public class Main {
//	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Stack<Integer> stk = new Stack<Integer>();
////		SJStack stk;
//		try {
//			String line = br.readLine();
//			int cnt = Integer.parseInt(line);
////			stk = new SJStack(cnt);
//			for (int i = 0; i < cnt; i++) {
//				line = br.readLine();
//				StringTokenizer st = new StringTokenizer(line);
//				String cmd = st.nextToken();
////				System.out.println(cmd);
//
//				if (cmd.equals("push")) {
//					String cmd2 = st.nextToken();
////					System.out.println(cmd2);
//					int p = Integer.parseInt(cmd2);
//					stk.push(p);
//				} else if (cmd.equals("pop")) {
//					if (stk.size() > 0) {
//						System.out.println(stk.pop());
//					} else {
//						System.out.println("-1");
//					}
//				} else if (cmd.equals("top")) {
////					stk.top();
//					System.out.println(stk.peek());
//				} else if (cmd.equals("size")) {
//					System.out.println(stk.size());
//				} else if (cmd.equals("empty")) {
//					if (stk.empty()) {
//						System.out.println("1");
//					} else {
//						System.out.println("0");
//					}
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}