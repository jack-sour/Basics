import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] userinput = new int[10];

        for(int i =0; i<10;i++){
            System.out.println("Enter your inputs" + (i + 1) + ":");
            userinput[i] = input.nextInt();
        }
        input.close();

        System.out.println("You entered: ");
        for(int i=0; i< 10;i++){
            System.out.println(userinput[i]);
        }
    }
}