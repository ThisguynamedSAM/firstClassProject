import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Temp {

    public static void fillRandom(int a[]) {
        // precondition: array a is an empty array of 1000
        // this method will call rand number generator for each array element
        // array will now be filled with random numbers from 0 to 1000
        for (int i = 0; i < a.length; i++)
            a[i] = randInt();
    }

    public static int randInt() {
        // generates a random number from 0 - 1000
        Random rand = new Random();
        return rand.nextInt(1000);
    }

    public static void copyArray(int a[], int b[]) {
        // copies each element of array a to array b
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
    }

    public static void shellSort(int[] b) {

        int h = 1;
        while (h < b.length) h = 3 * h + 1;
        while (h > 0) {
            h = h / 3;
            for (int k = 0; k < h; k++) {
                for (int i = h + k; i < b.length; i += h) {
                    int key = b[i];
                    int j = i - h;
                    while (j >= 0 && b[j] > key) {
                        b[j + h] = b[j];
                        j -= h;
                    }
                    b[j + h] = key;
                    //-> invariant: array[0,h,2*h..j] is sorted
                }
            }
            //->invariant: each h-sub-array is sorted
        }
    }

    public static void generateCsvFile(String sFileName, int d[], String sortName) {
        // method is called with file path, array containing run times, and a string with the name of the sort
        // after this method is called a new line will be added to the .csv file containing the sort name and all
        // run times
        try {
            FileWriter writer = new FileWriter(sFileName, true); // where true means add to end of file
            if (sortName == "Shell sort") {
                writer.append(sortName + ","); // avoids adding a blank line
            } else {
                writer.append("\n" + sortName + ",");
            }
            for (int i = 0; i < d.length; i++) {
                writer.append(d[i] + ",");
            }
            writer.append("Nano seconds");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}