import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();
        
        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();
        
        
        double totalCost = pricePerKg * kilograms;
        
       
        System.out.print("The total amount you have to pay is: %.2f\n", totalCost);
        
     
        input.close();
    }
}
