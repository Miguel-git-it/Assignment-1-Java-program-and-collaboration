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


    public static void restockItem(String[] names, int[] stocks, String target, int amount) {

    }
}
