import java.util.Scanner;
import java.util.ArrayList;

public class FuncionesNivel2 {
    public static void palindromo(String palabra) {
        String reversa = new StringBuilder(palabra).reverse().toString();
        if (palabra.equalsIgnoreCase(reversa)) {
            System.out.println("La palabra '" + palabra + "' es un palíndromo.");
        } else {
            System.out.println("La palabra '" + palabra + "' no es un palíndromo.");
        }
    }

    public static void calcularPotencia(double base, int exponente) {
        double resultado = Math.pow(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
    }

    public static void calcularMedia(ArrayList<Double> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía, no se puede calcular la media.");
            return;
        }
        double suma = 0;
        for (double num : lista) {
            suma += num;
        }
        double media = suma / lista.size();
        System.out.println("La media de la lista es: " + media);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra para verificar si es palíndromo: ");
        String palabra = scanner.nextLine();
        palindromo(palabra);

        System.out.print("Ingresa la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa el exponente: ");
        int exponente = scanner.nextInt();
        calcularPotencia(base, exponente);

        ArrayList<Double> lista = new ArrayList<>();
        System.out.print("¿Cuántos números quieres ingresar para la lista? ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            lista.add(scanner.nextDouble());
        }
        calcularMedia(lista);
    }
}
