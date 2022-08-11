import java.util.Scanner;

public class SecreteNumber {

    public static void main(String[] args) {
        System.out.println("Guess what is my secrete number?");
        System.out.println("Please remember only type in *NUMBER*!");
        Scanner reader = new Scanner(System.in);
        int guess = reader.nextInt();
        if(guess == 77){
            System.out.println("OMG you did it!");
        } else if (guess <50 || guess > 100) {
            System.out.println("Bad one, you are far from it");
        }

    }
}
