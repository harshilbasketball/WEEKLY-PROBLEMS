public class University_discout {
    public static void main(String[] args) {
        int Studentfee = 125000;
        int discountPercent = 10;
        double discount = (Studentfee * discountPercent) / 100;
        double discountedPrice = Studentfee - discount;
        System.err.println("The discout amount is INR  " + discount);
        System.err.println("The Discounted Price is INR " + discountedPrice);

    }
    
}
