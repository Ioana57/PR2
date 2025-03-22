package IB3.Sortieralgorithmen;
import java.util.Random;

// Elemente von vorne auf korrekte Reihenfolge prüfen, sobald ein kleineres auftaucht,
// wird dieses so lange nach vorne getauscht, bis es selbst auf ein kleineres trifft

public class InsertionSort {
    public static void main(String[] args) {

        //Um einen Array mit 10 Random int Zahlen zu generieren
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before sorting: ");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("After sorting: ");
        printArray(numbers);
    }

    public static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) { // Anfang bei 1 weil der 0te Element an sich schon mit sich selbst sortiert ist
            int currentValue = inputArray[i];
            int j = i - 1; //Position des vorheriges Element, mit dem es verglichen wird
            while (j >= 0 && inputArray[j] > currentValue) { // j>=0 weil Stopp bei Anfang des Arrays
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }

    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i] + " ");
        }
    }
}
