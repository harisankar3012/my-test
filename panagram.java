// 3.Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        String st=sc.nextLine(); 
       
        boolean isPangram = isPangram(st);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    
    public static boolean isPangram(String s) {
        s = s.toLowerCase(); 
        boolean[] letters = new boolean[26]; 
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                letters[ch - 'a'] = true; 
            }
        }
        
        for (boolean ch : letters) {
            if (!ch) {
                return false; 
            }
        }
        return true; 
    }
}
