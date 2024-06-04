package src.br.com.alura.currencyconverter.Main;

import src.br.com.alura.currencyconverter.ApiRequest.ConvertedValue;
import src.br.com.alura.currencyconverter.ApiRequest.RequestExchange;

import java.io.IOException;
import java.net.ConnectException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        double parity = 0.0;

        RequestExchange requestExchange = new RequestExchange();
        ConvertedValue convertedValue = new ConvertedValue();

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        do {

        Menu.showMenu();
        try {
            var operation = scanner.nextLine();
            switch (operation) {
                case "1":
                    parity = requestExchange.ReceiveValue("EUR", "BRL");
                    convertedValue.ParityCalculator("EUR", "BRL", parity);
                    break;
                case "2":
                    parity = requestExchange.ReceiveValue("USD", "EUR");
                    convertedValue.ParityCalculator("USD", "EUR", parity);
                    break;
                case "3":
                    parity = requestExchange.ReceiveValue("BRL", "USD");
                    convertedValue.ParityCalculator("BRL", "USD", parity);
                    break;
                case "4":
                    parity = requestExchange.ReceiveValue("EUR", "ARS");
                    convertedValue.ParityCalculator("EUR", "ARS", parity);
                    break;
                case "5":
                    parity = requestExchange.ReceiveValue("BRL", "CUP");
                    convertedValue.ParityCalculator("BRL", "CUP", parity);
                    break;
                case "6":
                    parity = requestExchange.ReceiveValue("USD", "RUBs");
                    convertedValue.ParityCalculator("USD", "RUB", parity);
                    break;
                case "0": System.out.println("Exiting the program....");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option! Please select a valid option.");
                    System.out.println("Press Enter to continue...");
                    scanner.nextLine();
                    break;
            }
        } catch (InputMismatchException exception) {
            System.out.println("Error: Please enter a valid numeric value (If you are using a period as the decimal separator, switch to a comma!");
            System.out.println("Press Enter to continue ...");
            scanner.nextLine();
        } catch (ConnectException exception) {
            System.out.println("Connection error, please connect to the internet");
            System.out.println("Press Enter to continue ...");
            scanner.nextLine();
        }
        } while (!quit);
    }
}
