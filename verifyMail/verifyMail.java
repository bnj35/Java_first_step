package verifyMail;

import java.util.ArrayList;
import basicCalculus.summ;

public class verifyMail {

    public static void containsAt(String input){
        String testMail = input;
        ArrayList<String> extensions = new ArrayList<>();
        extensions.addAll(java.util.Arrays.asList(".com", ".net", ".org", ".edu", ".gov", ".fr"));

        if (testMail.contains("@") && extensions.stream().anyMatch(testMail::endsWith)) {
            System.out.println("The input is a valid email.");
        } else {
            System.out.println("The input is not a valid email.");
        }
    }

    public static void askUserForMail(){
        System.out.print("Enter your email: ");
        String userEmail = summ.scanner.nextLine();
        containsAt(userEmail);
    }
    
}
