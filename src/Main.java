import java.lang.String;

public class Main {

    private static long start, end;

    private static int[] a = new int[1000];
    private static int[] a1 = new int[10000];
    private static int[] a2 = new int[100000];
    private static int[] a3 = new int[250000];
    private static int[] a4 = new int[500000];
    private static int[] b = new int[1000];
    private static int[] b1 = new int[10000];
    private static int[] b2 = new int[100000];
    private static int[] b3 = new int[250000];
    private static int[] b4 = new int[500000];

    private static long[] time = new long[10]; // one time frame for each element

    public static void main (String[] args) {
        // fills arrays with appropriate random elements
        Temp.fillRandom ( a );
        Temp.fillRandom ( a1 );
        Temp.fillRandom ( a2 );
        Temp.fillRandom ( a3 );
        Temp.fillRandom ( a4 );

        // loop calls associated sort method with different arrays each time
        // each sort method copies array, starts time, calls sort, ends time, calls csv writer with sort time
        // shellloop -> callshellsort -> shell sort -> write to csv
        /*shellLoop ();
        selLoop ();
        quickLoop ();
        insertLoop ();
        intLoop (); */
        quickLoop ();

    }

    private static long timeElapsed (long start, long end) {

        return end - start;
    } // returns elapsed time

    // shell sort
    private static void shellLoop () {

        System.out.println ("Started shell sort");

        Temp.generateCsvFile ( "Shell sort", 1000, true );
        callShellSort ( a, b, time );

        Temp.generateCsvFile ( "Shell sort", 10000, true );
        callShellSort ( a1, b1, time ); // calls sh

        Temp.generateCsvFile ( "Shell sort", 100000, true );
        callShellSort ( a2, b2, time );

        Temp.generateCsvFile ( "Shell sort", 250000, true );
        callShellSort ( a3, b3, time );

        Temp.generateCsvFile ( "Shell sort", 500000, true );
        callShellSort ( a4, b4, time );
    }

    private static void callShellSort (int[] a, int[] b, long[] time) {

        for (int i = 0; i < 10; i++) {

            Temp.copyArray ( a, b ); // copies original array a with each iteration
            start = System.nanoTime (); // start timer
            Temp.shellSort ( b );
            end = System.nanoTime (); // end timer
            time[i] =  timeElapsed ( start, end  ); // converts long to int
        }
        Temp.generateCsvFile ( time );
    }

    // sel sort
    private static void selLoop () {

        System.out.println ("Started selection sort");

        Temp.generateCsvFile ( "Selection sort", 1000, true );
        callSelSort ( a, b, time );

        Temp.generateCsvFile ( "Selection sort", 10000, true );
        callSelSort ( a1, b1, time ); // calls sh

        Temp.generateCsvFile ( "Selection sort", 100000, true );
        callSelSort ( a2, b2, time );

        Temp.generateCsvFile ( "Selection sort", 250000, true );
        callSelSort ( a3, b3, time );

        Temp.generateCsvFile ( "Selection sort", 500000, true );
        callSelSort ( a4, b4, time );
    }

    private static void callSelSort (int[] a, int[] b, long[] time) {

        for (int i = 0; i < 10; i++) {

            Temp.copyArray ( a, b ); // copies original array a with each iteration
            start = System.nanoTime (); // start timer
            AM.selSort ( b );
            end = System.nanoTime (); // end timer
            time[i] = timeElapsed ( start, end ); // converts long to int
        }
        Temp.generateCsvFile ( time );
    }

    // quicksort
    private static void quickLoop () {

        System.out.println ("Started quick sort");

        Temp.generateCsvFile ( "Quick sort", 1000, true );
        callQuickSort ( a, b, time );
       /*
        Temp.generateCsvFile ( "Quick sort", 10000, true );
        callQuickSort ( a1, b1, time ); // calls sh

        Temp.generateCsvFile ( "Quick sort", 100000, true );
        callQuickSort ( a2, b2, time );

        Temp.generateCsvFile ( "Quick sort", 250000, true );
        callQuickSort ( a3, b3, time );

        Temp.generateCsvFile ( "Quick sort", 500000, true );
        callQuickSort ( a4, b4, time );    */
    }

    private static void callQuickSort (int[] a, int[] b, long[] time) {

        for (int i = 0; i < 10; i++) {

            Temp.copyArray ( a, b ); // copies original array a with each iteration
            start = System.nanoTime (); // start timer
            AM.qs ( b, 0, b.length - 1);
            end = System.nanoTime (); // end timer
            time[i] =  timeElapsed ( start, end ); // converts long to int
        }
        Temp.generateCsvFile ( time );
    }

    // insertion sort
    private static void insertLoop () {

        System.out.println ("Started insertion sort");

        Temp.generateCsvFile ( "Insertion sort", 1000, true );
        callInsertSort ( a, b, time );

        Temp.generateCsvFile ( "Insertion sort", 10000, true );
        callInsertSort ( a1, b1, time ); // calls sh

        Temp.generateCsvFile ( "Insertion sort", 100000, true );
        callInsertSort ( a2, b2, time );

        Temp.generateCsvFile ( "Insertion sort", 250000, true );
        callInsertSort ( a3, b3, time );

        Temp.generateCsvFile ( "Insertion sort", 500000, true );
        callInsertSort ( a4, b4, time );
    }

    private static void callInsertSort (int[] a, int[] b, long[] time) {

        for (int i = 0; i < 10; i++) {

            Temp.copyArray ( a, b ); // copies original array a with each iteration
            start = System.nanoTime (); // start timer
            AM.insertionSort ( b );
            end = System.nanoTime (); // end timer
            time[i] = timeElapsed ( start, end ); // converts long to int
        }
        Temp.generateCsvFile ( time );
    }

    // distribution counting
    private static void intLoop () {

        System.out.println ("Started quick int sort");

        Temp.generateCsvFile ( "Distribution counting", 1000, true );
        callIntSort ( a, b, time );

        Temp.generateCsvFile ( "Distribution counting", 10000, true );
        callIntSort ( a1, b1, time ); // calls sh

        Temp.generateCsvFile ( "Distribution counting", 100000, true );
        callIntSort ( a2, b2, time );

        Temp.generateCsvFile ( "Distribution counting", 250000, true );
        callIntSort ( a3, b3, time );

        Temp.generateCsvFile ( "Distribution counting", 500000, true );
        callIntSort ( a4, b4, time );
    }

    private static void callIntSort (int[] a, int[] b, long[] time) {

        for (int i = 0; i < 10; i++) {

            Temp.copyArray ( a, b ); // copies original array a with each iteration
            start = System.nanoTime (); // start timer
            AM.intSort ( b );
            end = System.nanoTime (); // end timer
            time[i] = timeElapsed ( start, end ); // converts long to int
        }
        Temp.generateCsvFile ( time );
    }
}