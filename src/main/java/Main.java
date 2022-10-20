import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String command = myScanner.next();
        Calculator calculator = new Calculator();
        int int1;
        int int2;
        System.out.println("Enter command:");
        while(!command.equals("end")) {
            if (command.equals("add")) {
                int1 = myScanner.nextInt();
                int2 = myScanner.nextInt();
                System.out.println(calculator.add(int1, int2));
            } else if (command.equals("subtract")) {
                int1 = myScanner.nextInt();
                int2 = myScanner.nextInt();
                System.out.println(calculator.subtract(int1, int2));
            } else if (command.equals("multiply")) {
                int1 = myScanner.nextInt();
                int2 = myScanner.nextInt();
                System.out.println(calculator.multiply(int1, int2));
            } else if (command.equals("divide")) {
                int1 = myScanner.nextInt();
                int2 = myScanner.nextInt();
                System.out.println(calculator.divide(int1, int2));
            } else if (command.equals("fib")) {
                int1 = myScanner.nextInt();
                System.out.println(calculator.fibonacciNumberFinder(int1));
            } else if (command.equals("binary")) {
                int1 = myScanner.nextInt();
                System.out.println(calculator.intToBinaryNumber(int1));
            }
            command = myScanner.next();
        }
    }
}
