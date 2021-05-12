import java.util.Scanner;

public class WordFrequencies {
   public static void main(String[] args) {
      // This is a comment to commit something new :)
      Scanner scnr = new Scanner(System.in);
      int x = scnr.nextInt();
      String [] words = new String[x];

      for (int i = 0;  i < words.length; i++) {
         words[i] = scnr.next();
      }

      int wordCount;
      for (int i = 0; i < words.length; i++) {
         wordCount = 0;
         
         for (int j = 0; j < words.length; j++) {
            if (words[i].equals(words[j])) {
               ++wordCount;
            }
         }

         System.out.println(words[i] + " - " + wordCount);
      }
   }
}