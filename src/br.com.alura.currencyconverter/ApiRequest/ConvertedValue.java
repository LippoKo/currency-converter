package src.br.com.alura.currencyconverter.ApiRequest;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConvertedValue {
    public void ParityCalculator(String coin1, String coin2, double parity) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the amount you wish to convert: ");
        double value = userInput.nextDouble();
        double conversion = value * parity;

        System.out.println("The value of " + value + " (" + coin1 + "), will be: " + String.format("%.2f", conversion) + " (" + coin2 + ")");

        System.out.println("Press Enter to continue ...");
        userInput.nextLine();
    }
}
