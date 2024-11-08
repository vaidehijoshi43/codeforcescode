package Petya_and_Strings;

import java.util.*;
import java.lang.*;

public class Petya_and_Strings {
	
	public static int conversion(String a1,String b2) {
		for(int i = 0 ; i < a1.length();i++) {
			if(a1.charAt(i) != b2.charAt(i)) {
				if(a1.charAt(i) - 'a' > b2.charAt(i) - 'a') {
					return 1;
				}
				else if(a1.charAt(i) - 'a' < b2.charAt(i) - 'a') {
					return -1;
				}
				
			}
			
			
		}
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a1 = sc.next();
		String b1 = sc.next();
		String a2 = a1.toLowerCase();
		String b2 = b1.toLowerCase();
		int ans = conversion(a2,b2);
		System.out.println(ans);
		

	}

}
