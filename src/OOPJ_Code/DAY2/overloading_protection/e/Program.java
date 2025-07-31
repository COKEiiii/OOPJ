package OOPJ_Code.DAY2.overloading_protection.e;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        // can only store objects (not primitives)
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Accessing elements by their indices...");
        System.out.printf("First element: %d\n", list.get(0));
        System.out.printf("Second element: %d\n", list.get(1));
        System.out.printf("Third element: %d\n", list.get(2));

        // using the property 'Count' to get the number of elements
        System.out.println("\nIterating through each element in the list...");
        for (int i=0, sz=list.size(); i<sz; i++) {
            System.out.printf("Element[%d]: %d\n", i, list.get(i));
        }

        System.out.println("\nRemoving the last element in the list...");
        if (list.size() > 0) {
            list.remove(list.size()-1);
        }

        System.out.println("\nIterating through each element in the list...");
        // a more modern way to loop through the List
        for (int elem : list) {
            System.out.printf("Element: %d\n", elem);
        }
    }
}