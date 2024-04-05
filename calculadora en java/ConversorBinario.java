import java.util.Scanner;

public class ConversorBinario {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número binario de 16 dígitos: ");
        String binario = scanner.nextLine();

        if (binario.length() != 16 || !binario.matches("[01]+")) {
            System.out.println("El número binario ingresado no es válido.");
            return;
        }

        int decimal = Integer.parseInt(binario, 2);
        System.out.println("Decimal: " + decimal);

        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octal);

        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal: " + hexadecimal.toUpperCase());
    }
}