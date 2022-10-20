public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        if (args[0].equals("add")) {
            System.out.println(calculator.add(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }
        else if(args[0].equals("subtract")) {
            System.out.println(calculator.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }
        else if(args[0].equals("multiply")) {
            System.out.println(calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }
        else if(args[0].equals("divide")) {
            System.out.println(calculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }
        else if(args[0].equals("fib")) {
            System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(args[1])));
        }
        else if(args[0].equals("binary")) {
            System.out.println(calculator.intToBinaryNumber(Integer.parseInt(args[1])));
        }
    }
}
