import java.text.DecimalFormat;
import java.util.*;

public class AM {
    public static int findPosOfLargest(int[] b){

        int pos=0;
        for (int i=0; i<b.length; i++) // this works for arrays of any length
            if (b[i]>b[pos])
                pos=i; // change pos if smaller
        return pos;


    }
    public static int findPosOfLargest(int[] b, int start){

        int pos=start;
        for (int i=start; i<b.length; i++) // this works for arrays of any length
            if (b[i]>b[pos])
                pos=i; // change pos if smaller
        return pos;


    }
    public static int findPosOfLargest(double[] b){

        int pos=0;
        for (int i=0; i<b.length; i++) // this works for arrays of any length
            if (b[i]>b[pos])
                pos=i; // change pos if smaller
        return pos;


    }
    public static int findPosOfLargest(double[] b, int start){

        int pos=start;
        for (int i=start; i<b.length; i++) // this works for arrays of any length
            if (b[i]<b[pos])
                pos=i; // change pos if smaller
        return pos;


    }
    public static int findPosOfSmallest(int[] b){

        int pos=0;
        for (int i=0; i<b.length; i++) // this works for arrays of any length
            if (b[i]<b[pos])
                pos=i; // change pos if smaller
        return pos;


    }
    public static int findPosOfSmallest(int[] b, int start){

        int pos=start;
        for (int i=start; i<b.length; i++) // this works for arrays of any length
            if (b[i]<b[pos])
                pos=i; // change pos if smaller
        return pos;


    }
    public static int findPosOfSmallest(double[] b){

        int pos=0;
        for (int i=0; i<b.length; i++) // this works for arrays of any length
            if (b[i]<b[pos])
                pos=i; // change pos if smaller
        return pos;


    }
    public static int findPosOfSmallest(double[] b, int start){

        int pos=start;
        for (int i=start; i<b.length; i++) // this works for arrays of any length
            if (b[i]<b[pos])
                pos=i; // change pos if smaller
        return pos;


    }
    // write a method to fill an array of integers by asking the user for input

    public static void fillArray(int[] a){
        //preconditions: start with an empty defined int[] array
        //postconditions: array filled with user input values
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Filling an arrray of length " + a.length);
        for(int i = 0; i < a.length; i++) {
            System.out.println("Input a value for index " + i);
            a[i] = keyboard.nextInt();
        }
    }
    public static void fillArray(int[] a, int n){
        //preconditions: start with an empty defined int[] array of length >= n
        //postconditions: array filled with user input values
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Filling an arrray of length " + a.length);
        for(int i = 0; i < n; i++) {
            System.out.println("Input a value for index " + i);
            a[i] = keyboard.nextInt();
        }
    }
    public static void fillArray(double[] a){
        //preconditions: start with an empty defined int[] array
        //postconditions: array filled with user input values
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Filling an arrray of length " + a.length);
        for(int i = 0; i < a.length; i++) {
            System.out.println("Input a value for index " + i);
            a[i] = keyboard.nextDouble();
        }
    }
    public static void fillArray(double[] a, int n){
        //preconditions: start with an empty defined int[] array of length >= n
        //postconditions: array filled with user input values
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Filling an arrray of length " + a.length);
        for(int i = 0; i < n; i++) {
            System.out.println("Input a value for index " + i);
            a[i] = keyboard.nextDouble();
        }
    }

    public static int findValueOfSmallest(int[] a)
    {
        return a[findPosOfSmallest(a)];
    }
    public static int findValueOfSmallest(int[] a, int start)
    {
        return a[findPosOfSmallest(a, start)];
    }
    public static double findValueOfSmallest(double[] a)
    {
        return a[findPosOfSmallest(a)];
    }
    public static double findValueOfSmallest(double[] a, int start)
    {
        return a[findPosOfSmallest(a, start)];
    }
    public static int findValueOfLargest(int[] a)
    {
        return a[findPosOfLargest(a)];
    }
    public static int findValueOfLargest(int[] a, int start)
    {
        return a[findPosOfLargest(a, start)];
    }
    public static double findValueOfLargest(double[] a)
    {
        return a[findPosOfLargest(a)];
    }
    public static double findValueOfLargest(double[] a, int start)
    {
        return a[findPosOfLargest(a, start)];
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void swap(double[] a, int i, int j){
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void selSort(int[] a){

        for(int k= 0;k<a.length;k++)
        {
            int p=AM.findPosOfSmallest(a,k);
            AM.swap(a, p, k);

        }
    }
    public static void selSort(double[] a){

        for(int k= 0;k<a.length;k++)
        {
            int p=AM.findPosOfSmallest(a,k);
            AM.swap(a, p, k);

        }
    }
    public static void printArr(int[] a)
    {
        String s = "";

        for(int i = 0; i < a.length; i++)
        {
            s += a[i] + "\t"+" ";

            if((i + 1) % 5 == 0)
                s += "\n";
        }
        System.out.println(s);
    }
    public static void printArr(double[] a)
    {
        String s = "";

        for(int i = 0; i < a.length; i++)
        {
            s += a[i] + "\t"+" ";

            if((i + 1) % 5 == 0)
                s += "\n";
        }
        System.out.println(s);
    }
    public static void printArr(double[] a, int x) {
        String s = "";
        double temp;
        for(int i = 0; i < a.length; i++) {
            temp = (Math.round( (a[i] * 100.0 )) / 100.0);
            s += temp + "\t";

            if( (i + 1) % 5 == 0)
                s += "\n";
        }
        System.out.println(s);
    }
    public static void printArray(double[] a, int n){
        //precondition: array a has been filled, int n must be >= 1
        //postcondition: array a has been printed with n decimal places
        String decimalPlaces = "0.";
        for(int k = 1; k < n + 1; k ++)
            decimalPlaces = decimalPlaces + "0";
        DecimalFormat hundreth = new DecimalFormat(decimalPlaces);
        String s = "";
        s = s + (hundreth.format(a[0]));
        for(int i = 1; i < a.length; i++){

            if(i%5 == 0)
                s = s + "\n";
            else
                s = s + ", ";

            s = s + (hundreth.format(a[i]));
        }
        System.out.println(s);
    }
    public static void insertionSort(int[] a){
        //precondition: a has been filled
        // postcondition: a will be sorted low to high

        int j;
        int key;
        int i;
        for (j=1; j<a.length; j++){
            key = a[j];
            for (i=j; (i>=0)&&(a[i]<key);i--)
                a[i+1]=a[i];
            a[i+1]=key;
        }
    }
    public static void insertionSort(double[] a){
        //precondition: a has been filled
        // postcondition: a will be sorted low to high

        int j;
        double key;
        int i;
        for (j=1; j<a.length; j++){
            key = a[j];
            for (i=j; (i>=0)&&(a[i]<key);i--)
                a[i+1]=a[i];
            a[i+1]=key;
        }
    }
    public static void insertionSort(int[] a,int st, int end){
        //precondition: a has been filled
        // postcondition: a will be sorted low to high from position st through pos end

        int j;
        int key;
        int i;
        for (j=st+1; j<end+1; j++){
            key = a[j];
            for (i=j; (i>=st)&&(a[i]<key);i--)
                a[i+1]=a[i];
            a[i+1]=key;
        }
    }
    public static void insertionSort(double[] a,int st, int end){
        //precondition: a has been filled
        // postcondition: a will be sorted low to high from position st through pos end

        int j;
        double key;
        int i;
        for (j=st+1; j<end+1; j++){
            key = a[j];
            for (i=j; (i>=st)&&(a[i]<key);i--)
                a[i+1]=a[i];
            a[i+1]=key;
        }
    }

    public static void testPrint() {

        System.out.println("This works!");}
}