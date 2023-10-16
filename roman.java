// 2.Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

import java.util.*;
import java.io.*;
import java.lang.Math;
public class Main {
   public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);  
       String inputRoman=sc.nextLine(); 
      Main obj = new Main();
      System.out.println("The Integer value of given Roman number is: "+obj.romanToInt(inputRoman));
   } 
   int NumValue(char rom) {
      if (rom=='I'||rom=='i')
         return 1;
      if (rom=='V'||rom=='v')
         return 5;
      if (rom=='X'||rom=='x')
         return 10;
      if (rom=='L'||rom=='l')
         return 50;
      if (rom=='C'||rom=='c')
         return 100;
      if (rom=='D'||rom=='d')
         return 500;
      if (rom=='M'||rom=='m')
         return 1000;
      return -1;
   }
   int romanToInt(String str) {
      int sum=0;
      for (int i=0; i<str.length(); i++) {
         int s1=NumValue(str.charAt(i));
         if (i+1<str.length()) {
           int s2=NumValue(str.charAt(i+1));
           if (s1>=s2) {
              sum=sum+s1;
           }
           else{
              sum=sum-s1;
           }
        }
        else {
           sum=sum+s1;
        } 
     }  
     return sum;
   }
}
