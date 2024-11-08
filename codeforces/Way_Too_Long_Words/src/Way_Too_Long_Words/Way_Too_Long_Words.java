package Way_Too_Long_Words;

import java.util.*;
import java.lang.*;

public class Way_Too_Long_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0) {
			String s = sc.next();
			int size = s.length();
			if(size > 10) {
				System.out.printf("%c%d%c%n", s.charAt(0), size - 2, s.charAt(size - 1));
//				System.out.print(size - 2);
//				System.out.println(s.charAt(size - 1));
			}else {
				System.out.println(s);
			}
		}
		sc.close();
		

	}

}
