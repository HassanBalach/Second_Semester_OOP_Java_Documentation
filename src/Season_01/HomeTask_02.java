package Season_01;

public class HomeTask_02 {
    public static void main(String[] args) {

        System.out.println("--- 1. Variable Declarations & Formatting ---");
        int myInt = 65;
        float myFloat = 3.14159f;
        double myDouble = 9.87654321;
        char myChar = 'A';
        boolean myBool = true;

        // Using printf for formatted output
        System.out.printf("Integer (padded): %05d%n", myInt);
        System.out.printf("Float (2 decimal places): %.2f%n", myFloat);
        System.out.printf("Double (4 decimal places): %.4f%n", myDouble);
        System.out.printf("Character: %c%n", myChar);
        System.out.printf("Boolean: %b%n", myBool);

        System.out.println("\n--- 2. Type Conversion (Casting) ---");

        // Double to Int (Observe truncation: the decimals are chopped off)
        int doubleToInt = (int) myDouble;
        System.out.println("Double (" + myDouble + ") cast to int: " + doubleToInt + " (Notice the data loss)");

        // Int to Char (65 corresponds to 'A' in the ASCII table)
        char intToChar = (char) myInt;
        System.out.println("Int (" + myInt + ") cast to char: " + intToChar);

        // Char to Int (Shows the underlying ASCII numerical value of the character)
        char letter = 'Z';
        int charToInt = (int) letter;
        System.out.println("Char ('" + letter + "') cast to int: " + charToInt);

        System.out.println("\n--- 3. String Conversion ---");

        // Numeric to String
        String strFromInt = String.valueOf(myInt);
        String strFromDouble = String.valueOf(myDouble);
        System.out.println("Converted to String: " + strFromInt + " and " + strFromDouble);

        // String to Numeric
        String numberString = "150";
        String doubleString = "45.99";

        int parsedInt = Integer.parseInt(numberString);
        double parsedDouble = Double.parseDouble(doubleString);
        System.out.println("Parsed from String to Int: " + parsedInt);
        System.out.println("Parsed from String to Double: " + parsedDouble);
    }
}

