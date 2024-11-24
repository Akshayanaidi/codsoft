import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");

        // Input available currencies
        System.out.println("Enter the source currency (e.g., USD, EUR, INR): ");
        String sourceCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Enter the target currency (e.g., USD, EUR, INR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Input exchange rate
        System.out.printf("Enter the exchange rate from %s to %s: ", sourceCurrency, targetCurrency);
        double exchangeRate = scanner.nextDouble();

        // Input amount
        System.out.printf("Enter the amount in %s: ", sourceCurrency);
        double amount = scanner.nextDouble();

        // Perform conversion
        double convertedAmount = amount * exchangeRate;

        // Display result
        System.out.printf("%.2f %s = %.2f %s%n", amount, sourceCurrency, convertedAmount, targetCurrency);

        // Close scanner
        scanner.close();
    }
}