public class Calculator {
    // Method for addition
    public int addition(int num1, int num2) {
        return num1 + num2;
    }
    
    // Method for multiplication
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }
 // Input validation method
    private void validateInput(int a, int b) {
        if (a < Integer.MIN_VALUE || a > Integer.MAX_VALUE || b < Integer.MIN_VALUE || b > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Input values must be within the integer range.");
        }
    }
}