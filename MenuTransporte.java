//1.Mediante la edad calcular el boleto del avion
//Precio del boleto edad(<18 50% , >=65 75%)

//2.Calcular el valor del transporte terrestre por km 
//(<= 100 $5 , <=200 $7.50 , >= 200 $10)
import java.util.*;
import javax.swing.JOptionPane;

public class MenuTransporte {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        int edad;
        int precio=100;




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
                    
                    System.out.print("Ingresa tu edad: ");
                     edad = scanner.nextInt();

                    double precioFinal = precio;
                     if (edad < 18) {
                    precioFinal = precio * 0.5; // 50%
                     } else if (edad >= 65) {
                     precioFinal = precio * 0.75; // 75%
                      }

        System.out.println("El precio del boleto es: $" + precioFinal);
                        
                    break;

                case 2:
                    System.out.println("Opción 2 seleccionada");
                    
                    String inputKm = JOptionPane.showInputDialog("Ingresa la cantidad de kilómetros:");
                    double km = Double.parseDouble(inputKm);
                    double precio2;
                    

                    if (km <= 100) {
                        precio2 = km * 5;
                    } else if (km <= 200) {
                        precio2 = km * 7.5;
                    } else {
                        precio2 = km * 10;
                    }

                    JOptionPane.showMessageDialog(null,
                            "Kilómetros: " + km
                            + "\nPrecio total: $" + precio);
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
