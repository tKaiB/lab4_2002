import java.util.Scanner;

public class Strings {
    public static void main (String[] args)
    {
        Comparable[] strList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many words do you want to sort? ");
        size = scan.nextInt();
        strList = new Comparable[size];
        System.out.println ("\nEnter the strings...");
        for (int i = 0; i < size; i++)
            strList[i] = scan.next();
        Sorting.insertionSort(strList);
        System.out.println ("\nYour words in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(strList[i] + " ");
        System.out.println ();
    }
}
