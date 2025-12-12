// Library import for built-in List and ArrayList methods
import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        runVisualizerForArrayVSArrayList();
    }
    public static void runVisualizerForArrayVSArrayList() {
        System.out.println("Array vs ArrayList Visualization!\n");
        System.out.println("Creating an ArrayList and an Array with initial size of 10.");

        List<String> arrayList = new ArrayList<>();
        String[] array = new String[10];


        System.out.println("Adding 10 elements to both ArrayList and Array.");
        for (int i = 0; i < 10; i++) {
            // Adding elements to ArrayList and Array
            // Notice the difference in syntax
            arrayList.add("Item " + i);
            array[i] = "Item " + i;
        }

        // Displaying contents of both ArrayList and Array
        System.out.println("\nArrayList contents:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // Can list contents of array using enhanced for loop
        System.out.println("\nArray contents:");
        for (String item : array) {
            System.out.println(item);
        }

        // Demonstrating accessing elements beyond the initial size
        System.out.println("\nAttempting to access the 11th element in both Array and ArrayList.");
        try {
            System.out.println("\nTry Accessing 11th element in Array: ");
            System.out.println(array[11]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            System.out.println("\nTry Accessing 11th element in ArrayList: ");
            System.out.println(arrayList.get(11));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Demonstrating adding elements beyond the initial size
        System.out.println("\nAdding an 11th element to both Array and ArrayList.");
        try {
            System.out.println("\nAdd 11th element to Array: ");
            array[10] = "Item 10";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Cannot add more elements to a fixed-size array.");
        }

        // Adding to ArrayList
        // This works fine as ArrayList can dynamically resize
        System.out.println("\nAdd 11th element to ArrayList: ");
        arrayList.add("Item 10");
        System.out.println("ArrayList after adding 11th element:");
        for (String item : arrayList) {
            System.out.println(item);
        }
    }
}
