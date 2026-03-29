package Practise_Section_During_Class;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write Something");
    }
}

public class Basic {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Pointer";

        pen1.write();
    }

}
