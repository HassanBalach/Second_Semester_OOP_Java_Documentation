package Season_04;

// Custom class for Complex numbers
class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() { return real; }
    public double getImaginary() { return imaginary; }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

class OverloadDemo {
    // Existing methods (mocked for the assignment)
    public void test() { System.out.println("No parameters"); }
    public void test(int a) { System.out.println("a: " + a); }

    // NEW Method for Home Task #1
    public void test(Complex c1, Complex c2) {
        double sumReal = c1.getReal() + c2.getReal();
        double sumImaginary = c1.getImaginary() + c2.getImaginary();
        System.out.println("Sum of complex numbers: " + sumReal + " + " + sumImaginary + "i");
    }
}

public class HomeTask_01 {
    public static void main(String[] args) {
        Complex num1 = new Complex(2.5, 3.0);
        Complex num2 = new Complex(1.5, 2.0);

        OverloadDemo demo = new OverloadDemo();
        System.out.println("Number 1: " + num1.toString());
        System.out.println("Number 2: " + num2.toString());

        demo.test(num1, num2); // Calls the new overloaded method
    }
}

