import java.util.Scanner;
import java.util.Random;

public class Funciones {
    public static void edad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edadUsuario = scanner.nextInt();
        System.out.println("Tu edad es: " + edadUsuario + " años");
    }

    public static void suma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
    }

    public static void numAleatorio() {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Adivina el número (entre 1 y 100): ");
            int intento = scanner.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicitaciones, adivinaste el número!");
                break;
            }
        }
    }

    public static int contadorVocales() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine().toLowerCase();
        String vocales = "aeiou";
        int conteo = 0;
        for (char letra : cadena.toCharArray()) {
            if (vocales.indexOf(letra) != -1) {
                conteo++;
            }
        }
        return conteo;
    }

    public static void main(String[] args) {
        edad();
        suma();
        numAleatorio();
        int resultado = contadorVocales();
        System.out.println("Número de vocales: " + resultado);
    }
}
