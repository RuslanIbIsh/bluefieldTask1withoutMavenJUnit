import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter multiplicand * multiplier");
        String enteredNumbers = scanner.nextLine();

        int enteredApproach = 1;

        Calculator calculator = new Calculator(enteredNumbers, enteredApproach);
        String result = calculator.multiplication();
        System.out.println(result);


    }
}
