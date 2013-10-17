public class Main {

    private static long start, end;
    private static int[] a = new int[1000];
    private static int[] a2 = new int[10000];
    private static int[] a3 = new int[100000];
    private static int[] a4 = new int[250000];
    private static int[] a5 = new int[500000];
    private static int[] b = new int[1000];
    private static int[] b2 = new int[10000];
    private static int[] b3 = new int[100000];
    private static int[] b4 = new int[250000];
    private static int[] b5 = new int[500000];
    private static long[] time = new long[10]; // one time frame for each element

    public static void main(String[] args) {
        // fills arrays with appropriate random elements

        warmUp(); // calls method to warm up processor

        // fills all arrays with appropriate elements
        AM.fillRandom( a );
        AM.fillRandom( a2 );
        AM.fillRandom( a3 );
        AM.fillRandom( a4 );
        AM.fillRandom( a5 );

        // loop calls associated sort method with different arrays each time
        // each sort method copies array, starts time, calls sort, ends time, calls csv writer with sort time
        // shellloop -> callshellsort -> shell sort -> write to csv
        shellLoop();
        selLoop();
        quickLoop();
        intLoop();
        insertLoop();
        System.exit(0);
    }

    private static void warmUp() {
        // This method fills a local array and sorts it
        // The purpose of this method is to warm up the processor for the sortings to come
        int z[] = new int[10000];
        AM.fillArray( z );
        AM.shellSort( z );
    }
    private static long timeElapsed(long start, long end) {
        // returns elapsed time
        return end - start;
    }

    // shell sort
    private static void shellLoop() {
        // generates sort name followed by 10 sorts for each of the 5 brackets
        System.out.println( "Started shell sort" );

        AM.generateCsvFile( "Shell sort", 1000, true );
        callShellSort( a, b, time );

        AM.generateCsvFile( "Shell sort", 10000, true );
        callShellSort( a2, b2, time ); // calls sh

        AM.generateCsvFile( "Shell sort", 100000, true );
        callShellSort( a3, b3, time );

        AM.generateCsvFile( "Shell sort", 250000, true );
        callShellSort( a4, b4, time );

        AM.generateCsvFile( "Shell sort", 500000, true );
        callShellSort( a5, b5, time );
    }

    private static void callShellSort(int[] a, int[] b, long[] time) {

        for(int i = 0; i < 10; i++) {

            AM.copyArray( a, b ); // copies original array a with each iteration
            start = System.nanoTime(); // start timer
            AM.shellSort( b );
            end = System.nanoTime(); // end timer
            time[i] = timeElapsed( start, end ); // converts long to int
        }
        AM.generateCsvFile( time );
    }

    // sel sort
    private static void selLoop() {
        // generates sort name followed by 10 sorts for each of the 5 brackets
        System.out.println( "Started selection sort" );

        AM.generateCsvFile( "Selection sort", 1000, true );
        callSelSort( a, b, time );

        AM.generateCsvFile( "Selection sort", 10000, true );
        callSelSort( a2, b2, time ); // calls sh

        AM.generateCsvFile( "Selection sort", 100000, true );
        callSelSort( a3, b3, time );

        AM.generateCsvFile( "Selection sort", 250000, true );
        callSelSort( a4, b4, time );

        AM.generateCsvFile( "Selection sort", 500000, true );
        callSelSort( a5, b5, time );
    }

    private static void callSelSort(int[] a, int[] b, long[] time) {

        for(int i = 0; i < 10; i++) {

            AM.copyArray( a, b ); // copies original array a with each iteration
            start = System.nanoTime(); // start timer
            AM.selSort( b );
            end = System.nanoTime(); // end timer
            time[i] = timeElapsed( start, end ); // converts long to int
        }
        AM.generateCsvFile( time );
    }

    // quicksort
    private static void quickLoop() {
        // generates sort name followed by 10 sorts for each of the 5 brackets
        System.out.println( "Started quick sort" );

        AM.generateCsvFile( "Quick sort", 1000, true );
        callQuickSort( a, b, time );

        AM.generateCsvFile( "Quick sort", 10000, true );
        callQuickSort( a2, b2, time ); // calls sh

        AM.generateCsvFile( "Quick sort", 100000, true );
        callQuickSort( a3, b3, time );

        AM.generateCsvFile( "Quick sort", 250000, true );
        callQuickSort( a4, b4, time );

        AM.generateCsvFile( "Quick sort", 500000, true );
        callQuickSort( a5, b5, time );
    }

    private static void callQuickSort(int[] a, int[] b, long[] time) {

        for(int i = 0; i < 10; i++) {

            AM.copyArray( a, b ); // copies original array a with each iteration
            start = System.nanoTime(); // start timer
            AM.quickSort( b, 0, b.length - 1 );
            end = System.nanoTime(); // end timer
            time[i] = timeElapsed( start, end ); // converts long to int
        }
        AM.generateCsvFile( time );
    }

    // insertion sort
    private static void insertLoop() {
        // generates sort name followed by 10 sorts for each of the 5 brackets
        System.out.println( "Started insertion sort" );

        AM.generateCsvFile( "Insertion sort", 1000, true );
        callInsertSort( a, b, time );

        AM.generateCsvFile( "Insertion sort", 10000, true );
        callInsertSort( a2, b2, time ); // calls sh

        AM.generateCsvFile( "Insertion sort", 100000, true );
        callInsertSort( a3, b3, time );

        AM.generateCsvFile( "Insertion sort", 250000, true );
        callInsertSort( a4, b4, time );

        AM.generateCsvFile( "Insertion sort", 500000, true );
        callInsertSort( a5, b5, time );
    }

    private static void callInsertSort(int[] a, int[] b, long[] time) {

        for(int i = 0; i < 10; i++) {

            AM.copyArray( a, b ); // copies original array a with each iteration
            start = System.nanoTime(); // start timer
            AM.insertionSort( b );
            end = System.nanoTime(); // end timer
            time[i] = timeElapsed( start, end ); // converts long to int
        }
        AM.generateCsvFile( time );
    }

    // distribution counting
    private static void intLoop() {
        // generates sort name followed by 10 sorts for each of the 5 brackets
        System.out.println( "Started quick int sort" );

        AM.generateCsvFile( "Distribution counting", 1000, true );
        callIntSort( a, b, time );

        AM.generateCsvFile( "Distribution counting", 10000, true );
        callIntSort( a2, b2, time ); // calls sh

        AM.generateCsvFile( "Distribution counting", 100000, true );
        callIntSort( a3, b3, time );

        AM.generateCsvFile( "Distribution counting", 250000, true );
        callIntSort( a4, b4, time );

        AM.generateCsvFile( "Distribution counting", 500000, true );
        callIntSort( a5, b5, time );
    }

    private static void callIntSort(int[] a, int[] b, long[] time) {

        for(int i = 0; i < 10; i++) {

            AM.copyArray( a, b ); // copies original array a with each iteration
            start = System.nanoTime(); // start timer
            AM.intSort( b );
            end = System.nanoTime(); // end timer
            time[i] = timeElapsed( start, end ); // converts long to int
        }
        AM.generateCsvFile( time );
    }
}