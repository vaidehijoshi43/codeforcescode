package Theatre_Square;

import java.util.*;
import java.lang.*;

public class Theatre_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
        
        long n = s.nextLong();
        long m = s.nextLong();
        long a = s.nextLong();
        
        long numFlagstonesN = (n + a - 1) / a; 
        System.out.println(numFlagstonesN);
        long numFlagstonesM = (m + a - 1) / a; 
        System.out.println(numFlagstonesM);
        
        long totalFlagstones = numFlagstonesN * numFlagstonesM;
        
       
        System.out.println(totalFlagstones);

	}

}
