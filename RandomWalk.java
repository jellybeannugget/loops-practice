//Yusef Awad
// Oct 29th

public class RandomWalk {
    public static void main(String[] args) {
    double person = 3.5;
    int bridge = 7;
    int number = (int)(Math.random()*2);
    System.out.println(number);
    int attempts = 0;
    int trials = 50;
    int totalAttempts = 0;
for (int i = 0; i<trials; i++){
person = 3.5;
attempts = 0;
    while(person < bridge && person >= 0){
        if(number == 1){
            person++;
        }
        else{
            person--;
        }
        attempts++;
        number = (int)(Math.random()*2);
    }

    totalAttempts += attempts;
}

double average = (double)totalAttempts/trials;
System.out.println("Average amount of attempts to fall: " + average);

    }

}
