import java.lang.String;

public class Main {

    /*
    How the csv file will print for each sort
      sort name   1000 elements                                     average

      1     33    44   1    5                                         16

      10000 elements                                     average
      100000 elements                                     average
      250000 elements                                     average
      500000 elements                                     average
      750000 elements                                     average
      1000000 elements                                     average
     */
    private static long start, end;
    private static String filePath = "/Users/Samson/Documents/code/java/firstClassProject/sortTimes.csv";

    public static void main (String[] args) {

        int[] a = new int[1000];
        int[] a1 = new int[10000];
        int[] a2 = new int[100000];
        int[] a3 = new int[250000];
        int[] a4 = new int[500000];
        int[] a5 = new int[750000];
        int[] a6 = new int[1000000];
        int[] b = new int[1000];
        int[] b1 = new int[10000];
        int[] b2 = new int[100000];
        int[] b3 = new int[250000];
        int[] b4 = new int[500000];
        int[] b5 = new int[750000];
        int[] b6 = new int[1000000];
        int[] time = new int[10]; // one timeframe for each element


        // these are calls to the print csv file and shell sort function for each of the element brackets
        //       to do
        // put this in one method and call shell sort loop
        // do the same for each sort function
        // also rename each sort instead of overloading loop() // it's pretty lame
        // after is done merge all to AM class and call it a day
        Temp.fillRandom ( a ); // calls fill rand array and passes along a
        Temp.generateCsvFile ( filePath, "Shell sort", 1000, true );
        loop ( a, b, time );

        Temp.generateCsvFile ( filePath, "Shell sort", 10000, true );
        loop ( a1, b1, time ); // calls sh

        Temp.generateCsvFile ( filePath, "Shell sort", 100000, true );
        loop ( a2, b2, time );

        Temp.generateCsvFile ( filePath, "Shell sort", 250000, true );
        loop ( a3, b3, time );

        Temp.generateCsvFile ( filePath, "Shell sort", 500000, true );
        loop ( a4, b4, time );

        Temp.generateCsvFile ( filePath, "Shell sort", 750000, true );
        loop ( a5, b5, time );

        Temp.generateCsvFile ( filePath, "Shell sort", 1000000, true );
        loop ( a6, b6,
    }

    private static long timeElapsed (long start, long end) {

        return end - start;
    } // returns elapsed time

    // shell sort
    private static void loop (int[] a, int[] b, int[] time) {

        for (int i = 0; i < 10; i++) {

            Temp.copyArray ( a, b ); // copies original array a with each iteration
            start = System.nanoTime (); // start timer
            Temp.shellSort ( b );
            end = System.nanoTime (); // end timer
            time[i] = (int) (long) ( timeElapsed ( start, end ) ); // converts long to int


        }
            Temp.generateCsvFile ( filePath, time);
    }
      /*

    // sel sort
    private static void loop (int s) {

        for (int i = 0; i < 1; i++) {
            Temp.copyArray ( a, b ); // copies original array a with each iteration
            start = System.nanoTime (); // start timer
            AM.selSort ( b );
            end = System.nanoTime (); // end timer
            time[i] = (int) (long) ( timeElapsed ( start, end ) ); // converts long to int
        }
        Temp.generateCsvFile ( filePath, time, "Sel sort" );
    }

    // quicksort
    private static void loop (boolean s) {

        for (int i = 0; i < 1; i++) {
            Temp.copyArray ( a, b ); // copies original array a with each iteration
            start = System.nanoTime (); // start timer
//            Temp.shellSort(b);
            end = System.nanoTime (); // end timer
            time[i] = (int) (long) ( timeElapsed ( start, end ) ); // converts long to int
        }
        Temp.generateCsvFile ( filePath, time, "Quick sort" );
    }

    // insertion sort
    private static void loop (double f) {

        for (int i = 0; i < 1; i++) {
            Temp.copyArray ( a, b ); // copies original array a with each iteration
            start = System.nanoTime (); // start timer
            AM.insertionSort ( b );
            end = System.nanoTime (); // end timer
            time[i] = (int) (long) ( timeElapsed ( start, end ) ); // converts long to int
        }
        Temp.generateCsvFile ( filePath, time, "Insertion sort" );
    }

    // quick integer sort
    private static void loop (char s) {

        for (int i = 0; i < 1; i++) {
            Temp.copyArray ( a, b ); // copies original array a with each iteration
            start = System.nanoTime (); // start timer
            AM.intSort ( b );
            end = System.nanoTime (); // end timer
            time[i] = (int) (long) ( timeElapsed ( start, end ) ); // converts long to int
        }
        Temp.generateCsvFile ( filePath, time, "Quick Integer sort" );
    } */
}