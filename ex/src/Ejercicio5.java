public class Ejercicio5 {
    public static void main(String[] args) {
        mostrarMultiplosDe7();
    }

    // Función de no retorno para mostrar los primeros 15 múltiplos de 7
    public static void mostrarMultiplosDe7() {
        int contador = 0;
        int numero = 1;

        while (contador < 15) {
            int multiplo = numero * 7;
            System.out.println(multiplo);
            contador++;
            numero++;
        }
    }
}
