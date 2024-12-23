import java.util.Scanner;

public class Temperature_Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("             Temperature Conversion Program");
        System.out.println("===============================================");
        System.out.println();

        System.out.print("Enter a temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the original unit of measurement (1 for Celsius, 2 for Fahrenheit, or 3 for Kelvin): ");
        int ch = scanner.nextInt();

        System.out.println();
        System.out.println("-----------------------------------------------");

        switch (ch) {
            case 1:
                System.out.println("----Temperature Conversion Results----");
                System.out.println("---------------------------------------");
                System.out.println(temperature + " degrees Celsius is equal to:");
                System.out.println(celsiusToFahrenheit(temperature) + " degrees Fahrenheit");
                System.out.println(celsiusToKelvin(temperature) + " Kelvin");
                break;
            case 2:
                System.out.println("----Temperature Conversion Results----");
                System.out.println("---------------------------------------");
                System.out.println(temperature + " degrees Fahrenheit is equal to:");
                System.out.println(fahrenheitToCelsius(temperature) + " degrees Celsius");
                System.out.println(fahrenheitToKelvin(temperature) + " Kelvin");
                break;
            case 3:
                System.out.println("----Temperature Conversion Results----");
                System.out.println("---------------------------------------");
                System.out.println(temperature + " Kelvin is equal to:");
                System.out.println(kelvinToCelsius(temperature) + " degrees Celsius");
                System.out.println(kelvinToFahrenheit(temperature) + " degrees Fahrenheit");
                break;
            default:
                System.out.println(
                        "Invalid unit of measurement. Please enter 1 for Celsius, 2 for Fahrenheit, or 3 for Kelvin.");
        }
        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}