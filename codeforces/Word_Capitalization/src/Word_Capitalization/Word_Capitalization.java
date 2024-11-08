package Word_Capitalization;

import java.util.*;
import java.lang.*;

public class Word_Capitalization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		
		String str1 = sb.toString();
		str1 = str1.toUpperCase();
		for(int i = 1;i < str.length();i++) {
			str1 = str1 + str.charAt(i);
		}
		System.out.println(str1);
	}

}
