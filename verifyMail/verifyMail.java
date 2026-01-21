package verifyMail;

import java.util.ArrayList;
import basicCalculus.summ;

public class verifyMail {

    public static boolean containsAt(String input){
        String testMail = input;
        ArrayList<String> extensions = new ArrayList<>();
        extensions.addAll(java.util.Arrays.asList(".com", ".net", ".org", ".edu", ".gov", ".fr"));

        if (testMail.contains("@") && extensions.stream().anyMatch(testMail::endsWith)) {
            return true;
        } else {
            System.out.println("The input is not a valid email.");
            return false;
        }
    }

    public static void askUserForMail(){
        System.out.print("Enter your email: ");
        String userEmail = summ.scanner.nextLine();
        containsAt(userEmail);
    }
    
}
