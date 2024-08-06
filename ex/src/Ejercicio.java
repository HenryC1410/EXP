import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        if(num1>0 && num2>0){
            if(num1!=num2){

                if(num1>num2){
                    int temp=num1;
                    num1=num2;
                    num2=temp;
                }

                int suma=0;
                int i = num1;
                while (i <= num2) {
                    if (i % 2 != 0 && i % 3 == 0) {
                        suma=suma+i;
                        System.out.print(i+" + ");
                    }
                    
                    i++;
                }
                System.out.println("La suma es: " + suma);
            }
        }

        
    }
}