public class test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        askUserInput();
    }

    public static int add (int a, int b){
        return a + b;
    }

    int summ = add(5, 10);


    public void displayresult() {
        System.out.println("The sum is: " + summ);
    }

    public static void askUserInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int result = add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        scanner.close();
    }
}
