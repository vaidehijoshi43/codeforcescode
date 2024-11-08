package ABit;

import java.util.*;
import java.lang.*;
public class ABit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		while(n-- > 0) {
			String s = sc.next();
			
			if(s.equals("++X")) ++i;
			else if(s.equals("X++") ) i++;
			else if(s.equals("--X")) --i;
			else i--;
			
			
				
			
			
		}
		System.out.print(i);

	}

}
