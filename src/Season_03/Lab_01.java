package Season_03;

class Item{
    String name;
    double price;
    int quantity;

    Item(String name , double price , int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice(){
      return price * quantity;

    }

    void displayItemDetails(){
        System.out.println("Item Name: " + name);
        System.out.println("Item Price $ : " + price);
        System.out.println("Item quantity : " + quantity);
        System.out.println("Total quantity Price $ : " +getTotalPrice() );
    }

    void updateQuantity(int moreQuantity){
        quantity = quantity + moreQuantity;
    }
}

public class Lab_01 {
    public static void main(String[] args) {
        Item item01 = new Item("Learning Board" , 1200 , 20);

        System.out.println("Initial Items detail: ");
        item01.displayItemDetails();

        System.out.println("Adding 1 more item: ");
        item01.updateQuantity(4 );

        System.out.println("Updated Item Detail:");
        item01.displayItemDetails();


    }


}
