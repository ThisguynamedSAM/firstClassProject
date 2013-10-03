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

    /*// copied this from stack overflow
    // not really sure what all that stuff in the header means
    public static <T extends Comparable<? super T>>
    void shellSort(  T [ ] b )
    {
        int j;
        for( int gap = b.length / 2; gap > 0; gap /= 2 )
            for( int i = gap; i < b.length; i++ )
            {
                T tmp = b[ i ];
                for( j = i; j >= gap &&
                        tmp.compareTo( b[ j - gap ] ) < 0; j -= gap )
                    b[ j ] = b[ j - gap ];
                b[ j ] = tmp;
            }
    } */

    public static void shellSort(int[] b){
        int h = 1;
        while (h < b.length) h = 3*h + 1;
        while (h > 0){
            h = h/3;
            for (int k = 0; k < h; k++){
                for (int i = h+k; i < b.length; i+=h){
                    int key = b[i];
                    int j = i-h;
                    while (j>=0 && b[j] > key){
                        b[j+h] = b[j];
                        j-=h;
                    }
                    b[j+h] = key;
                    //-> invariant: array[0,h,2*h..j] is sorted
                }
            }
            //->invariant: each h-sub-array is sorted
        }
    }

    public static void copyArray(int a[], int b[]) {
        // copies each element of array a to array b
        for(int i = 0; i <a.length; i++)
            b[i] = a[i];
    }

    public static void printCopy(int b[]) {
        for (int i = 0; i < b.length; i++) {
            // prints 5 ints per line
            if (i % 5 == 0) System.out.print("\n");

            System.out.print(b[i] + " ");
        }
    }
}