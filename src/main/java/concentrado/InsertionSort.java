package concentrado;

public class InsertionSort {
    static void insertionSort(int arr[])
    {
        int n = arr.length;
        long startTime = System.nanoTime();
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
};