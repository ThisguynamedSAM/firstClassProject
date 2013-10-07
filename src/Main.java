import java.lang.String;

public class Main {

    private static int[] a = new int[10000];
    private static int[] b = new int[10000];
    private static int[] time = new int[10]; // one timeframe for each element
    private static long start, end;
    private static String filePath = "/Users/Samson/Documents/code/java/firstClassProject/sortTimes.csv";

    /*
    *   create a new method to loop through all sorts
    *   for each sort write times to csv file
    * */
    public static void main(String[] args) {

        Temp.fillRandom(a); // calls fill rand array and passes along a
    /*
        loop();
        loop(4);
        loop(1.2);
        loop(true);
        loop('x');
    */
    }

    private static long timeElapsed(long start, long end) {

        return end - start;
    } // returns elapsed time

    // shell sort
    private static void loop() {

        for (int i = 0; i < 10; i++) {
            Temp.copyArray(a, b); // copies original array a with each iteration
            start = System.nanoTime(); // start timer
            Temp.shellSort(b);
            end = System.nanoTime(); // end timer
            time[i] = (int) (long) (timeElapsed(start, end)); // converts long to int
        }
        Temp.generateCsvFile(filePath, time, "Shell sort");
    }

    // sel sort
    private static void loop(int s) {

        for (int i = 0; i < 10; i++) {
            Temp.copyArray(a, b); // copies original array a with each iteration
            start = System.nanoTime(); // start timer
            AM.selSort(b);
            end = System.nanoTime(); // end timer
            time[i] = (int) (long) (timeElapsed(start, end)); // converts long to int
        }
        Temp.generateCsvFile(filePath, time, "Sel sort");
    }

    // quicksort
    private static void loop(boolean s) {

        for (int i = 0; i < 10; i++) {
            Temp.copyArray(a, b); // copies original array a with each iteration
            start = System.nanoTime(); // start timer
//            Temp.shellSort(b);
            end = System.nanoTime(); // end timer
            time[i] = (int) (long) (timeElapsed(start, end)); // converts long to int
        }
        Temp.generateCsvFile(filePath, time, "Quick sort");
    }

    // insertion sort
    private static void loop(double f) {

        for (int i = 0; i < 10; i++) {
            Temp.copyArray(a, b); // copies original array a with each iteration
            start = System.nanoTime(); // start timer
            AM.insertionSort(b);
            end = System.nanoTime(); // end timer
            time[i] = (int) (long) (timeElapsed(start, end)); // converts long to int
        }
        Temp.generateCsvFile(filePath, time, "Insertion sort");
    }

    // quick integer sort
    private static void loop(char s) {

        for (int i = 0; i < 10; i++) {
            Temp.copyArray(a, b); // copies original array a with each iteration
            start = System.nanoTime(); // start timer
            //Temp.shellSort(b);
            end = System.nanoTime(); // end timer
            time[i] = (int) (long) (timeElapsed(start, end)); // converts long to int
        }
        Temp.generateCsvFile(filePath, time, "Quick Integer sort");
    }
}