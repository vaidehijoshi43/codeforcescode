package ATeam;

import java.util.*;
import java.lang.*;

public class ATeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cntinner = 0;
		while(n-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a + b + c >= 2) {
				cntinner++;
			}
		}
		System.out.println(cntinner);
		sc.close();
	}

}
