package Lucky_Division;

import java.util.*;
import java.lang.*;

public class Lucky_Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
		boolean flag = false;
		for(int cnt : luckyNumbers) {
			if(n % cnt == 0) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		

	}

}
