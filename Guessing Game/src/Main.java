import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner input =  new Scanner (System.in);
    //Guessing Game//
    System.out.println("Let's play a lottery Guessing Game");
    System.out.println("Enter any number between 1 to 90");
    int number = input.nextInt();

    if (number < 0)
    {System.out.println("Try again");
    }
    else if (number > 40 && number < 60){
        System.out.println("Your Guess is right, You are a Genius");
    }
    else {
        System.out.println("Game over");
    }

}
}