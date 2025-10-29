//Yusef
//October 27th
//loops practice

import java.util.*;

public class example1 {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("There is a random number, try guessing it.");
        
        int random = (int)(Math.random()*100 +1);
        int attempts = 0;
        int guess = input.nextInt();

        
        while (guess != random){
            if (guess < random){
                System.out.println("Too low");
            }
            else if(guess > random) {
                System.out.println("Too high");
            }
              guess = input.nextInt();
            attempts++;
        }

        if(guess == random){
      System.out.println("You got it");
           System.out.println("It took you " + attempts + " tries");
           if(attempts <= 7){
            System.out.println("7 or less tries is impressive, you used a good strategy");
           }
        }

    }




    public static int countFactors(int num) {
        int count = 0;
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;
        }
        return count;
    }

    
        public static boolean isPrime(int num) {
        return countFactors(num) == 2;
    }

public static int countPrimes(int n) {
    int count = 0;
    int i = 2;

    while (i <= n) {
        if (isPrime(i) == true) {
            count++;
        }
        i++;
    }

    return count;
}

}