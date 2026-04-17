package Season_03;

class Rectangle {
    double length;
    double width;

    // Default Constructor
    Rectangle() {
        length = 0;
        width = 0;
    }

    // Parameterized Constructor
    Rectangle(double l, double w) {
        if (l < 0 || w < 0) {
            System.out.println("Invalid input! Setting values to 0.");
            length = 0;
            width = 0;
        } else {
            length = l;
            width = w;
        }
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    boolean isSquare() {
        if (length == width) {
            return true;
        }
        return false;
    }

    void displayRectangleInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());

        if (isSquare()) {
            System.out.println("This is a Square");
        } else {
            System.out.println("This is not a Square");
        }
    }
}

class RectangleTest {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 3);
        Rectangle r3 = new Rectangle(4, 4);
        Rectangle r4 = new Rectangle(-2, 5); // invalid

        System.out.println("\nRectangle 1:");
        r1.displayRectangleInfo();

        System.out.println("\nRectangle 2:");
        r2.displayRectangleInfo();

        System.out.println("\nRectangle 3:");
        r3.displayRectangleInfo();

        System.out.println("\nRectangle 4:");
        r4.displayRectangleInfo();
    }
}