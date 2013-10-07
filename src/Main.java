import java.lang.String;

public class Main {

    private static int[] a = new int[10000];
    private static int[] b = new int[10000];
    private static int[] time = new int[10]; // hold one time (in nanoseconds) for each iteration


    private static long timeElapsed(long start, long end) {

        return end - start;
    } // returns elapsed time

    /*
    *   create a new method to loop through all sorts
    *   for each sort write times to csv file
    * */
    public static void main(String[] args) {

        long start, end;

        Temp.fillRandom(a); // calls fill rand array and passes along a
        for (int i = 0; i < 10; i++) {
            Temp.copyArray(a, b); // copies original array a with each iteration
            start = System.nanoTime(); // start timer
            Temp.shellSort(b);
            // AM.selSort(b);
            end = System.nanoTime(); // end timer
            time[i] = (int) (long) (timeElapsed(start, end)); // converts long to int
        }
                               // change filepath to the folder location on your computer
        Temp.generateCsvFile("/Users/Samson/Documents/code/java/firstClassProject/sortTimes.csv", time, "Shell sort");
    }                                                                            // change string for each function call
}