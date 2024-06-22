import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> estudiantes = new ArrayList<>();

    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n====================");
            System.out.println("       Menu");
            System.out.println("====================");
            System.out.println("1. Juntar resultados");
            System.out.println("2. Tabla de multiplicar");
            System.out.println("3. Calculadora basica");
            System.out.println("4. Numero primo o no");
            System.out.println("5. Lista de estudiantes");
            System.out.println("6. Gestion de estudiantes");
            System.out.println("7. Salir");
            System.out.println("====================");
            System.out.print("Ingrese su opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (opcion) {
                case 1:
                    menu.calculadoraBasica();
                    break;
                case 2:
                    menu.();
                    break;
                case 3:
                    menu.listaDeEstudiantes();
                    break;
                case 4:
                    menu.gestionDeEstudiantes();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Error: Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        scanner.close();
    }
}

