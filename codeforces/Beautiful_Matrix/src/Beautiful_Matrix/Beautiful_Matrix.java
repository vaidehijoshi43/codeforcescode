package Beautiful_Matrix;

import java.util.*;
import java.lang.*;

public class Beautiful_Matrix {
	
	public static int solution(int[][] arr) {
		int x = 0;
		int y = 0;
		for(int i = 0 ; i < 5;i++) {
			for(int j = 0 ; j < 5;j++) {
				if(arr[i][j] == 1) {
					
					  x = i;  // row index of 1
	                  y = j;  // column index of 1
				}
			}
			
		}
		return Math.abs(x - 2) + Math.abs(y - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		for(int i = 0; i < 5;i++) {
			for(int j = 0 ; j < 5;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int ans = solution(arr);
		System.out.println(ans);

	}

}
