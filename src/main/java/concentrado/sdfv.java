package concentrado;

import java.util.Scanner;

class GFG {
    public static int search(int arr[], int x)
    {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    // Driver's code
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿De qué tamaño desea el array?");
        int tamaño = scanner.nextInt();
        int[] arr = ArrayGenerator.generarNumerosAleatorios(tamaño);
        int x = 10;



        // Function call
        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                    "El elemento no se encuentra en el array");
        else
            System.out.print("El elemento esta en la posicion "
                    + result);
    }

    static class ArrayGenerator {
        public static int[] generarNumerosAleatorios(int tamaño) {
            int[] numeros = new int[tamaño];
            for (int i = 0; i < tamaño; i++) {
                numeros[i] = (int) (Math.random() * 100);
            }
            return numeros;
        }
    }
}
