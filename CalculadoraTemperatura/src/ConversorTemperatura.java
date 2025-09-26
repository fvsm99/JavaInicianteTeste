import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        
        System.out.println("\nTemperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");
        
        scanner.close();
    }

}
