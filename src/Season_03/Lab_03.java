package Season_03;

class Car{
    String make;
    String model;
    int year;
    double price;

    Car(String make , String model , int year , double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void DisplayCarDetails(){
        System.out.println("Made by: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Made in : " + year);
        System.out.println("Car Price: " + price);

        System.out.println("Discount Amount : " + CarDiscountPrice());
        System.out.println("Tag " + classicCar());

    }

    double CarDiscountPrice(){
        double discountAmount = 50000;
        if(price > 50000){
            price = price - discountAmount;
        }

        return price;
    }

    String classicCar(){
        int currentYear = 2025;
        currentYear = currentYear - year;
        String tag = " ";
        if(currentYear > 20 ){
            tag = "Classic";
        }

        return tag;

    }

}
public class Lab_03 {
    public static void main(String[] args) {
        Car car1 = new Car("Alto" , "Suski" , 2000 , 800000);
        car1.DisplayCarDetails();
    }


}
