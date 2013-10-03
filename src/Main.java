import java.lang.Object;

public class Main{

    static int[] a = new int[1000];
    static int[] b = new int[1000];
	public static void main(String[] args) {

        Temp.fillRandom(a); // calls fill rand array and passes along a
        Temp.copyArray(a, b);
        Temp.printCopy(b);
        System.out.println("This is array b before sorting");
        Temp.shellSort(b);
        System.out.println("\nThis is array b after sorting");
        Temp.printCopy(b);
     // Temp.printArray(a);  // print array receives a and prints all elements

        /*
                       To do
               add all sorting arrays to AM class
               create benchmark arrays
               print results to .csv files
         */
    }
}