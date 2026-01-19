package basicCalculus;

public class summ {
    
    // Shared static scanner for all classes
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    public static int add (int a, int b){
        return a + b;
    }

    public void displayresult(int summ) {
        System.out.println("The sum is: " + summ);
    }

    public static void askUserForSumm() {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        int result = add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
