//Yusef Awad
// Oct 29

import java.util.*;

public class Hailstone {
  public static void main(String[] args) {
      int num = 0;
    Scanner in = new Scanner (System.in);
      System.out.println("Input a whole number from 1 through 200 for the Hailstone problem: ");
      num = in.nextInt();
    int rounds = 0;

     for(int i = 200; i>=1; i--){
     
   while(num != 1){
      if(num%2 == 0){
          num /= 2;
          System.out.println(num);
          rounds++;

      }
      else{
          num *= 3;
          num++;
          System.out.println(num);
          rounds++;

        }

     }
    
    }
    System.out.println("It took " + rounds + " iterations to solve");

}

}
