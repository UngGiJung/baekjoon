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
