import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        askUserForSumm();
        scanner.nextLine();
        askUserForMail();
    }

    public static int add (int a, int b){
        return a + b;
    }

    int summ = add(5, 10);

    // Create a single Scanner instance to be used throughout the class
    static java.util.Scanner scanner = new java.util.Scanner(System.in);


    public void displayresult() {
        System.out.println("The sum is: " + summ);
    }

    public static void askUserForSumm() {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int result = add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }

    public static void verifyMail(String input){
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
        String userEmail = scanner.nextLine();
        verifyMail(userEmail);
    }

}
