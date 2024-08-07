
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you consider choosing an Operating System that suits your budget and love or fear for technology!!!");
        System.out.println("");

        System.out.println("Choosing an Operting System");
        System.out.println("");

        System.out.println("Do you fear technology?");
        String yesNo = input.next();

        if (yesNo.equals("yes")){
            System.out.println("Is your daddy rich");

            System.out.println("");
            String Is_your_daddy_rich = input.next();

            if (Is_your_daddy_rich.equals("yes")){
                System.out.println("Then the best choice is Apple operating system");
            }
            else if (Is_your_daddy_rich.equals("no")){
                System.out.println("Then the best choice is Chrome operating system");
            }
        }
        else if (yesNo.equals("no")) {
            System.out.println("Do you care about freedom/Privacy");

            System.out.println("");
            String Do_you_care_about_freedom_or_Privacy = input.next();
            if (Do_you_care_about_freedom_or_Privacy.equals("no")){
                System.out.println("Then the best choice is Windows operating System");
            }
            else if(Do_you_care_about_freedom_or_Privacy.equals("yes")){
                System.out.println("Do you have a life");
                System.out.println("");
                String Do_you_have_a_life = input.next();
                if (Do_you_have_a_life.equals("yes")){
                    System.out.println("Then the Best choice is either a UBUNTU or a DEBIAN or a FEDORA operating System");
                }
                else if(Do_you_have_a_life.equals("no")){
                    System.out.println("Then the best operating system is either ARCH LINUX or a KALI LINUX or a LINUS operating system");
                }
            }
        }



    }
}