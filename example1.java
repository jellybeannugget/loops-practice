//Yusef
//October 27th
//loops practice


public class example1 {
    
    
    public static void main(String[] args) {
        System.out.println(countFactors(24)); 
        System.out.println(isPrime(27));      
        System.out.println(isPrime(47));  
        System.out.println(countPrimes(47));      
    
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

    public static int countPrimes(int n){
        int count = 0;
        for(int i = 2; i<=n; i++){
            if(isPrime(i) == true){
                count++;
            }
        }
        return count;
    }

}