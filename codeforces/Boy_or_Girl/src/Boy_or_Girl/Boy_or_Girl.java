package Boy_or_Girl;

import java.lang.*;
import java.util.*;

public class Boy_or_Girl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		
		HashSet<Character> distinctChars = new HashSet<>();
        
        // Add each character of the string to the HashSet
        for(char ch : str1.toCharArray()) {
            distinctChars.add(ch);
        }
        
        // Check the number of distinct characters
        if(distinctChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

	}

}
