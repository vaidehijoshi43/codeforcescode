package Watermelones;

import java.util.*;
import java.lang.*;

public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		if(val % 2 == 0 && val > 2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();

	}

}
