//HACER UN MENU CON 2 OPCIONES
//1.- TRANSFORMAR DE CELSIUS A FAHRENHEIT
//2.- CALCULAR EL PRECIO REAL MAS IVA DE UN PRODUCTO


import java.util.Scanner;

public class MenuSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú
            System.out.println("=== MENU ===");
            System.out.println("1. Convertir Celsius a Fahrenheit");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            // Leer opción
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la temperatura en Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println(celsius + "°C son " + fahrenheit + "°F");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }

            System.out.println(); // separa iteraciones
        } while (opcion != 0);

        scanner.close();
    }
}