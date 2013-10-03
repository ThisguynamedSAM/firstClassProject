import java.util.Random;

public class Temp {

    public static void fillRandom(int a[]){
        // precondition: array a is an empty array of 1000
        // this method will call randum number generator for each array element
        // array will now be filled with random numbers from 0 to 1000

        for (int i = 0; i < a.length; i++)
            a[i] = randInt();
    }

    public static int randInt() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
             // prints 5 ints per line
            if (i % 5 == 0) System.out.print("\n");

            System.out.print(a[i] + " ");
        }
    }
}