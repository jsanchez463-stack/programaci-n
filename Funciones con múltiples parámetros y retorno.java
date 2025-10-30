import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FuncionesNivel4 {
    public static double promedio(double... nums) {
        if (nums.length == 0) return 0;
        double suma = 0;
        for (double num : nums) {
            suma += num;
        }
        return suma / nums.length;
    }

    public static ArrayList<Double> multiplicarLista(ArrayList<Double> lista, double numero) {
        ArrayList<Double> resultado = new ArrayList<>();
        for (double elem : lista) {
            resultado.add(elem * numero);
        }
        return resultado;
    }

    public static double mayorDeVariosNumeros(double... nums) {
        if (nums.length == 0) return Double.NEGATIVE_INFINITY;
        double mayor = nums[0];
        for (double num : nums) {
            if (num > mayor) mayor = num;
        }
        return mayor;
    }

    public static double calcularMediana(double... nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        if (n % 2 == 1) {
            return nums[n / 2];
        } else {
            return (nums[n / 2 - 1] + nums[n / 2]) / 2.0;
        }
    }

    public static int contarOcurrencias(String cadena, String palabra) {
        String[] palabras = cadena.toLowerCase().split("\\s+");
        int conteo = 0;
        for (String p : palabras) {
            if (p.equals(palabra.toLowerCase())) {
                conteo++;
            }
        }
        return conteo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo para promedio
        System.out.print("Ingresa números separados por espacios para calcular el promedio: ");
        String[] inputPromedio = scanner.nextLine().split(" ");
        double[] numsPromedio = new double[inputPromedio.length];
        for (int i = 0; i < inputPromedio.length; i++) {
            numsPromedio[i] = Double.parseDouble(inputPromedio[i]);
        }
        double prom = promedio(numsPromedio);
        System.out.println("El promedio es: " + prom);

        // Ejemplo para multiplicarLista
        ArrayList<Double> lista = new ArrayList<>();
        System.out.print("¿Cuántos números para la lista? ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa número " + (i + 1) + ": ");
            lista.add(scanner.nextDouble());
        }
        System.out.print("Ingresa el número por el que multiplicar: ");
        double numero = scanner.nextDouble();
        ArrayList<Double> multiplicada = multiplicarLista(lista, numero);
        System.out.println("Lista multiplicada: " + multiplicada);

        // Ejemplo para mayorDeVariosNumeros
        System.out.print("Ingresa números separados por espacios para encontrar el mayor: ");
        scanner.nextLine(); // Consumir newline
        String[] inputMayor = scanner.nextLine().split(" ");
        double[] numsMayor = new double[inputMayor.length];
        for (int i = 0; i < inputMayor.length; i++) {
            numsMayor[i] = Double.parseDouble(inputMayor[i]);
        }
        double mayor = mayorDeVariosNumeros(numsMayor);
        System.out.println("El mayor es: " + mayor);

        // Ejemplo para calcularMediana
        System.out.print("Ingresa números separados por espacios para calcular la mediana: ");
        String[] inputMediana = scanner.nextLine().split(" ");
        double[] numsMediana = new double[inputMediana.length];
        for (int i = 0; i < inputMediana.length; i++) {
            numsMediana[i] = Double.parseDouble(inputMediana[i]);
        }
        double mediana = calcularMediana(numsMediana);
        System.out.println("La mediana es: " + mediana);

        // Ejemplo para contarOcurrencias
        scanner.nextLine(); // Consumir newline
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        System.out.print("Ingresa la palabra a contar: ");
        String palabra = scanner.nextLine();
        int ocurrencias = contarOcurrencias(cadena, palabra);
        System.out.println("La palabra '" + palabra + "' aparece " + ocurrencias + " veces.");
    }
}
