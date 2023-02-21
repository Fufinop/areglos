package concentrado;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ordenar un array por BubbleSort.");
            System.out.println("2. Ordenar un array por InsertionSort.");
            System.out.println("3. Ordenar un array por SelectionSort.");
            System.out.println("4. Ordenar un array por CountSort.");
            System.out.println("5. Salir.");

            int opcion = scanner.nextInt();

            if (opcion == 5) {
                break;
            }
            System.out.println("¿De qué tamaño desea el array?");
            int tamaño = scanner.nextInt();

            int[] numeros = ArrayGenerator.generarNumerosAleatorios(tamaño);

            switch (opcion) {
                case 1:
                    System.out.println("Arreglo desordenado: " + Arrays.toString(numeros));
                    long startTime = System.nanoTime();
                    BubbleSort.bubbleSort(numeros);
                    System.out.println("Arreglo ordenado por BubbleSort: " + Arrays.toString(numeros));
                    long endTime = System.nanoTime();
                    long elapsedTime = (endTime - startTime) / 1000000;
                    System.out.println("Tiempo de ejecución: " + elapsedTime + " milisegundos.");
                    break;
                case 2:
                    System.out.println("Arreglo desordenado: " + Arrays.toString(numeros));
                    long startTime1 = System.nanoTime();
                    InsertionSort.insertionSort(numeros);
                    System.out.println("Arreglo ordenado por InsertionSort: " + Arrays.toString(numeros));
                    long endTime1 = System.nanoTime();
                    long elapsedTime1 = (endTime1 - startTime1) / 1000000;
                    System.out.println("Tiempo de ejecución: " + elapsedTime1 + " milisegundos.");
                    break;
                case 3:
                    System.out.println("Arreglo desordenado: " + Arrays.toString(numeros));
                    long startTime2 = System.nanoTime();
                    SelectionSort.selectionSort(numeros);
                    System.out.println("Arreglo ordenado por SelectionSort: " + Arrays.toString(numeros));
                    long endTime2 = System.nanoTime();
                    long elapsedTime2 = (endTime2 - startTime2) / 1000000;
                    System.out.println("Tiempo de ejecución: " + elapsedTime2 + " milisegundos.");
                    break;
                case 4:
                    System.out.println("Arreglo desordenado: " + Arrays.toString(numeros));
                    long startTime3 = System.nanoTime();
                    CountSort.countSort(numeros);
                    System.out.println("Arreglo ordenado por CountSort: " + Arrays.toString(numeros));
                    long endTime3 = System.nanoTime();
                    long elapsedTime3 = (endTime3 - startTime3) / 1000000;
                    System.out.println("Tiempo de ejecución: " + elapsedTime3 + " milisegundos.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }
}

class ArrayGenerator {
    public static int[] generarNumerosAleatorios(int tamaño) {
        int[] numeros = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        return numeros;
    }
}
