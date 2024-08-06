public class Ejercicio2 {
    public static void main(String[] args) {
        // Arrays de prueba
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3};

        // Comparar los arrays
        compararArrays(array1, array2);
    }

    // Método para comparar dos arrays
    public static void compararArrays(int[] array1, int[] array2) {
        boolean sonIguales = true;

        // Verificar si los arrays tienen el mismo tamaño
        if (array1.length != array2.length) {
            sonIguales = false;
        } else {
            // Comparar elemento por elemento
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    sonIguales = false;
                    break; // Salir del bucle si se encuentran elementos diferentes
                }
            }
        }

        // Imprimir el resultado de la comparación
        if (sonIguales) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son diferentes");
        }
    }
}

