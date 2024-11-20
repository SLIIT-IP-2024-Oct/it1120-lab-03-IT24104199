import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = input.nextDouble();

        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = input.nextDouble();

        
        double totalAmount = pricePerKg * quantity;

        
        double discount = totalAmount * 0.10;

        
        double finalAmount = totalAmount - discount;

        
        System.out.println("Total amount before discount: " + totalAmount);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Final amount to pay after discount: " + finalAmount);

        
        input.close();
    }
}
