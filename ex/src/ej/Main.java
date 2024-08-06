package ej;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();
        int opcion;

        do {
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("1. AGREGAR CÓDIGO");
            System.out.println("2. BUSCAR CÓDIGO");
            System.out.println("3. IMPRIMIR TODO");
            System.out.println("4. SALIR");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el código del producto: ");
                    int codigo = scanner.nextInt();
                    lista.agregarCodigo(codigo);
                    break;
                case 2:
                    System.out.print("Ingresa el código a buscar: ");
                    codigo = scanner.nextInt();
                    boolean encontrado = lista.buscarCodigo(codigo);
                    if (encontrado) {
                        System.out.println("El código se encuentra en la lista.");
                    } else {
                        System.out.println("El código no se encuentra en la lista.");
                    }
                    break;
                case 3:
                    lista.imprimirTodo();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        
    }
}

