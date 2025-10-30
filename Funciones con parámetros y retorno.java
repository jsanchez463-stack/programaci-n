import java.util.Scanner;

public class FuncionesNivel3 {
    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    public static double mayorDeTresNumeros(double numero1, double numero2, double numero3) {
        return Math.max(Math.max(numero1, numero2), numero3);
    }

    public static double calcularArea(double radio, double altura) {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
    }

    public static boolean buscarPalabra(String cadena, String palabra) {
        return cadena.toLowerCase().contains(palabra.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo para invertirCadena
        System.out.print("Ingresa una cadena para invertir: ");
        String cadena = scanner.nextLine();
        String invertida = invertirCadena(cadena);
        System.out.println("Cadena invertida: " + invertida);

        // Ejemplo para mayorDeTresNumeros
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextDouble();
        double mayor = mayorDeTresNumeros(num1, num2, num3);
        System.out.println("El mayor de los tres números es: " + mayor);

        // Ejemplo para calcularArea
        System.out.print("Ingresa el radio del cilindro: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingresa la altura del cilindro: ");
        double altura = scanner.nextDouble();
        double area = calcularArea(radio, altura);
        System.out.println("El área del cilindro es: " + area);

        // Ejemplo para buscarPalabra
        scanner.nextLine(); // Consumir el newline
        System.out.print("Ingresa una cadena: ");
        String cadenaBuscar = scanner.nextLine();
        System.out.print("Ingresa la palabra a buscar: ");
        String palabra = scanner.nextLine();
        boolean encontrada = buscarPalabra(cadenaBuscar, palabra);
        System.out.println("¿La palabra está en la cadena? " + encontrada);
    }
}
