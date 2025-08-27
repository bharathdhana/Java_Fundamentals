public class Cart {
    //encapsulated data members
    private String[] cartItems = new String[25];


    //view cartitems
    public void viewCart(){
        for(String each : cartItems){
           System.out.println("Item in cart: " + each);  
        }
    }
    //Additems methods
    public void addToKart(String item){
        for(int index=0; index<cartItems.length;index++){
            if(cartItems[index]==null){
                cartItems[index] = item;
                System.out.println("Item added to cart: " + item);
                return;
            }
        }
        System.out.println("Cart is full, cannot add more items.");
    }
}
 class Signup{
    public static void main(String[] args) {
        Cart flipkart = new Cart();
        flipkart.addToKart("Laptop");
        flipkart.addToKart("Smartphone");
        flipkart.viewCart();
    }
}