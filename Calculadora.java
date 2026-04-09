//1.Mediante la edad calcular el boleto del avion
//Precio del boleto edad(<18 50% , >=65 75%)

//2.Calcular el valor del transporte terrestre por km 
//(<= 100 $5 , <=200 $7.50 , >= 200 $10)
import java.util.Scanner;

public class MenuTransporte {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Calcular boleto de avión por edad");
            System.out.println("2. Calcular transporte terrestre por km");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opción 1 seleccionada");
                    break;

                case 2:
                    System.out.println("Opción 2 seleccionada");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

            System.out.println();

        } while (opcion != 0);

        scanner.close();
    }
}