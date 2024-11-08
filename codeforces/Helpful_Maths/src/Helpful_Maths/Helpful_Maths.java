package Helpful_Maths;

import java.util.*;
import java.lang.*;

public class Helpful_Maths {
	
	public static String solutionsolv(String str) {
		if(str.length() == 1) {
			return str;
		}
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int cntadd = 0;
		for(int i = 0 ; i <str.length();i++) {
			if(str.charAt(i) == '1') {
				cnt1++;
			}else if(str.charAt(i) == '2') {
				cnt2++;
			}else if(str.charAt(i) == '+') {
				cntadd++;
			}else {
				cnt3++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= cnt1;i++) {
			sb.append("1+");
		}for(int i = 1; i <= cnt2;i++) {
			sb.append("2+");
		}for(int i = 1; i <= cnt3;i++) {
			sb.append("3+");
		}
		StringBuilder sb1 = new StringBuilder();
		for(int i = 0 ; i < sb.length() - 1;i++) {
			sb1.append(sb.charAt(i));
		}
		return sb1.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		String ans = solutionsolv(str1);
		System.out.print(ans);
	}

}
