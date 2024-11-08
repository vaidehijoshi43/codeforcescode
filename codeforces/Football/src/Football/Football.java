package Football;

import java.util.Scanner;

public class Football {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        // Variables to count consecutive 0's and 1's
        int count = 1;
        
        // Loop through the string
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
                if (count == 7) {
                    System.out.println("YES");
                    return;
                }
            } else {
                count = 1;  // Reset the counter when the streak breaks
            }
        }
        
        // If no dangerous situation is found
        System.out.println("NO");
    }
}
