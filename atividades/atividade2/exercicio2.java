import java.util.Scanner;

public class ConversorTemperatura {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        double temperaturaConvertida = 0.0;

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double temperaturaCelsius = scanner.nextDouble();
            temperaturaConvertida = celsiusParaFahrenheit(temperaturaCelsius);
            System.out.println("Temperatura em Fahrenheit: " + temperaturaConvertida + " °F");
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double temperaturaFahrenheit = scanner.nextDouble();
            temperaturaConvertida = fahrenheitParaCelsius(temperaturaFahrenheit);
            System.out.println("Temperatura em Celsius: " + temperaturaConvertida + " °C");
        } else {
            System.out.println("Escolha inválida.");
        }

        scanner.close();
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
