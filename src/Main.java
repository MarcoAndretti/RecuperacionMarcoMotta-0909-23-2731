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
            System.out.println("1. Calculadora basica");
            System.out.println("2. Lista de estudiantes");
            System.out.println("3. Gestion de estudiantes");
            System.out.println("4. Salir");
            System.out.println("====================");
            System.out.print("Ingrese su opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (opcion) {
                case 1:
                    menu.calculadoraBasica();
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
class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> estudiantes = new ArrayList<>();

    public void calculadoraBasica() {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;
        boolean operacionValida = true;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                operacionValida = false;
                break;
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }
    }

    public void listaDeEstudiantes() {
        System.out.println("Lista de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public void gestionDeEstudiantes() {
        boolean gestionSalir = false;

        while (!gestionSalir) {
            System.out.println("\n====================");
            System.out.println("  Gestion de estudiantes");
            System.out.println("====================");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Volver al menú principal");
            System.out.println("====================");
            System.out.print("Ingrese su opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    eliminarEstudiante();
                    break;
                case 3:
                    gestionSalir = true;
                    break;
                default:
                    System.out.println("Error: Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    private void agregarEstudiante() {
        System.out.print("Ingrese el nombre del estudiante a agregar: ");
        String nombre = scanner.nextLine();
        estudiantes.add(nombre);
        System.out.println("Estudiante \"" + nombre + "\" agregado correctamente.");
    }

    private void eliminarEstudiante() {
        System.out.print("Ingrese el nombre del estudiante a eliminar: ");
        String nombre = scanner.nextLine();
        if (estudiantes.remove(nombre)) {
            System.out.println("Estudiante \"" + nombre + "\" eliminado correctamente.");
        } else {
            System.out.println("Error: Estudiante no encontrado.");
        }
    }
}
