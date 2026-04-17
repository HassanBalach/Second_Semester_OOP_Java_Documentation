package Season_03;

class Box {
    double width;
    double height;
    double depth;

    // Default Constructor
    Box() {
        width = 1;
        height = 1;
        depth = 1;
    }

    // Parameterized Constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Volume Method
    double volume() {
        return width * height * depth;
    }

    // Surface Area Method
    double getSurfaceArea() {
        return 2 * (width * height + height * depth + width * depth);
    }

    // isEqual Method
    boolean isEqual(Box otherBox) {
        if (this.width == otherBox.width &&
                this.height == otherBox.height &&
                this.depth == otherBox.depth) {
            return true;
        }
        return false;
    }
}

class BoxTest {
    public static void main(String[] args) {

        Box b1 = new Box(); // default
        Box b2 = new Box(2, 3, 4); // parameterized
        Box b3 = new Box(2, 3, 4);

        System.out.println("Box 1 Volume: " + b1.volume());
        System.out.println("Box 1 Surface Area: " + b1.getSurfaceArea());

        System.out.println("Box 2 Volume: " + b2.volume());
        System.out.println("Box 2 Surface Area: " + b2.getSurfaceArea());

        System.out.println("Box 2 == Box 3 ? " + b2.isEqual(b3));
    }
}