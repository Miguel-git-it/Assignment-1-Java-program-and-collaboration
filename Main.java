import java.util.Scanner;

/**
 * Main class for the Grocery Management System.
 */
public class Main {

    /**
     * Main method that runs the user menu loop.
     * * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Required parallel arrays
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        System.out.println("Grocery Manager initialized.");
        System.out.println("Feature branches will implement functionality.");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. View");
            System.out.println("2. Restock");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline buffer
            
            if (choice == 1) {
                printInventory(itemNames, itemPrices, itemStocks);
            } else if (choice == 2) {
                System.out.print("Enter item to restock: ");
                String target = scanner.nextLine();
                System.out.print("Enter the amount of " + target + " to restock: ");
                int amount = scanner.nextInt();
                restockItem(itemNames, itemStocks, target, amount);
            } else if (choice == 3) {
                System.out.println("Thank you for using the Grocery Manager.");
                break;
            } else {
                System.out.println("Please select a valid option.");
            }
        }
        
        scanner.close();
    }

    public static void printInventory(String[] names, double[] prices, int[] stocks) {

    }

    /**
     * Searches for a specific item by name within the inventory and increases
     * its stock level by the specified amount. If the item name is not found
     * in the array, a message is displayed to the console.
     * @param names  The array containing the names of the grocery items.
     * @param stocks The array containing the current stock quantities for each item.
     * @param target The name of the item to be restocked.
     * @param amount The quantity to add to the existing stock of the target item.
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(target)) {
                stocks[i] += amount;
                found = true;
                break;
            }
        }

        if (!found) {System.out.println("Item not found.");}
    }
}
