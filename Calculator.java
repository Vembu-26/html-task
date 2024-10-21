public class Calculator {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int num1 = 10;
        int num2 = 5;

        // Calling methods
        int sum = calculator.add(num1, num2);
        int difference = calculator.subtract(num1, num2);
        int product = calculator.multiply(num1, num2);
        double quotient = calculator.divide(num1, num2);

        // Displaying results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}