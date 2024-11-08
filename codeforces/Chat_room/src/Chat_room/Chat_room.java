package Chat_room;

import java.lang.*;
import java.util.*;

public class Chat_room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		String str1 = sc1.next();
		
		String str2 = "hello";
		int target = 0;
		
		for(int i = 0 ; i < str1.length();i++) {
			if(str1.charAt(i) == str2.charAt(target)) {
				target++;
			}
			if(target == str2.length()) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		
		

	}

}
