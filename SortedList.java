import java.util.*;

/**
 * Class SortedList takes an integer from the command line and adds it to a
 * LinkedList.
 * The list is sorted and printed out to the console.
 * <p>
 *
 * @author Rob Sand
 * @since CSC6301 Week 4
 */

public class SortedList {
    /**
     * Main Method of the class. The main method will continue
     * to request integers to be added to the LinkedList until a non-integer
     * is entered into the command line.
     * 
     * @param args default parameter for main - not used
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        do {
            System.out.println("Please enter an integer:");

            int next = scanner.nextInt();
            addSort(next, list);
            System.out.println(list);

        } while (scanner.hasNextInt());

        scanner.close();

    }

    /**
     * Method which adds an integer to the Linked List and then
     * sorts the LinkedList
     * 
     * @param next Integer from scanner to be added to the LinkedList
     * @param list The LinkedList which the integer is added into.
     */
    public static void addSort(int next, LinkedList<Integer> list) {
        list.add(next);
        Collections.sort(list);

    }
}
