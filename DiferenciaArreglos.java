import java.util.Scanner;

public class DiferenciaArreglos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] arreglo1 = new double[7];
        double[] arreglo2 = new double[7];
        double[] arregloDiferencia = new double[7];
        double suma = 0;
        System.out.println("Ingrese 7 números para el primer arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextDouble();
        }
        System.out.println("\nIngrese 7 números para el segundo arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextDouble();
        }
        for (int i = 0; i < 7; i++) {
            arregloDiferencia[i] = arreglo1[i] - arreglo2[i];
            suma += arregloDiferencia[i];
        }
        double promedio = suma / 7;
        System.out.println("\nDatos del tercer arreglo (diferencia):");
        for (int i = 0; i < 7; i++) {
            System.out.println("Posición " + i + ": " + arregloDiferencia[i]);
        }
        System.out.println("\nPromedio de los datos del tercer arreglo: " + promedio);

        scanner.close();
    }
}