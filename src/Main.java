public class Main{

    private static int[] a = new int[1000000];
    private static int[] b = new int[1000000];
    private static int[] time = new int[10]; // will hold 10 different timeframes that sorts will run

	public static void main(String[] args) {
        long start, end;

        Temp.fillRandom(a); // calls fill rand array and passes along a
        Temp.copyArray(a, b);

        for (int i = 0; i < 10; i++) {
            start = System.nanoTime(); // assigns start to current time

            Temp.shellSort(b);

            end = System.nanoTime(); // marks current time for end

            time [i] = (int) (long) (timeElapsed(start, end)); // converts to int to be stored in array
            Temp.copyArray(a, b); // will recopy the array after each iteration
        }

        System.out.println("10 shell sorts were run, and took the follow times in nanoseconds");
        Temp.printArray(time);
    }

    private static long timeElapsed(long start, long end) { return end - start; }
}