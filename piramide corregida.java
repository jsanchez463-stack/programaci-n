package varios;

public class Piramide {
    public static void main(String[] args) {
        int filas = 5;

        for (int i = 1; i <= filas; ++i) {
            // Imprimir espacios
            for (int j = i; j < filas; ++j) {
                System.out.print("  ");
            }
            // Imprimir asteriscos
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
