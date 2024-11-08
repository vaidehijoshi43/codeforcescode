package Next_Round;

import java.util.*;
import java.lang.*;

public class Next_Round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int z = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n;i++) {
			arr[i] = s.nextInt();
		}
		
		int val = arr[z-1];
		int advancingParticipants = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= val && arr[i] > 0) {
            	System.out.println(arr[i]);
                advancingParticipants++;
                System.out.println();
                System.out.println(advancingParticipants);
                
            }
        }
        
        System.out.println(advancingParticipants);
		

	}

}
