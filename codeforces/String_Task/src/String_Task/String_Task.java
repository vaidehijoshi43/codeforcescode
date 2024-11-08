package String_Task;

import java.util.*;
import java.lang.*;


public class String_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		String str2 = str1.toLowerCase();
		
		StringBuilder sb1 = new StringBuilder();
		for(int i = 0 ; i < str2.length();i++) {
			if(str2.charAt(i) != 'a' && str2.charAt(i) != 'e' && str2.charAt(i) != 'i'  && str2.charAt(i) != 'o' 
					&& str2.charAt(i) != 'u' && str2.charAt(i) != 'y') {
				sb1.append(".").append(str2.charAt(i));
		}
		
				
			
		}
		System.out.println(sb1.toString());

	}

}
