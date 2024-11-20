import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();
        
        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();
        
        
        double totalCost = pricePerKg * kilograms;
        
        
        double discount = totalCost * 0.10;
        double finalAmount = totalCost - discount;
        
        
        System.out.print("Total cost before discount: %.2f\n", totalCost);
        System.out.print("Discount amount: %.2f\n", discount);
        System.out.print("Amount to pay after discount: %.2f\n", finalAmount);
        
        
        input.close();
    }
}
