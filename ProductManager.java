import java.util.Scanner;

public class ProductManager {

    private static void printMenu() {
        System.out.println();
        System.out.println("Operations on List");
        System.out.println("1. Make Empty");
        System.out.println("2. Find ID");
        System.out.println("3. Insert At Front");
        System.out.println("4. Delete From Front");
        System.out.println("5. Delete ID");
        System.out.println("6. Print All Records");
        System.out.println("7. Done");
        System.out.print("Your choice: ");
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Try again.");
            }
        }
    }

    private static String readNonEmptyLine(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine();
            if (!line.trim().isEmpty()) return line;
            System.out.println("Input cannot be empty. Try again.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList<Product> list = new MyLinkedList<>();

        boolean done = false;
        while (!done) {
            printMenu();

            int choice;
            String line = sc.nextLine().trim();
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number 1-7.");
                continue;
            }

            switch (choice) {
                case 1: // Make Empty
                    list.makeEmpty();
                    System.out.println("List has been emptied.");
                    break;

                case 2: { // Find ID
                    int id = readInt(sc, "Enter Product ID: ");
                    Product p = list.findID(id);
                    if (p == null) {
                        System.out.println("Product with ID " + id + " not found.");
                    } else {
                        System.out.println("ID No: " + id);
                        p.printID();
                    }
                    break;
                }

                case 3: { // Insert At Front
                    int id = readInt(sc, "Enter Product ID: ");
                    String name = readNonEmptyLine(sc, "Enter Product Name: ");
                    String supplier = readNonEmptyLine(sc, "Enter Supplier Name: ");
                    Product p = new Product(id, name, supplier);

                    boolean inserted = list.insertAtFront(p);
                    if (inserted) {
                        System.out.println("Product Added");
                    } else {
                        System.out.println("Insert failed: ID " + id + " already exists (or invalid product).");
                    }
                    break;
                }

                case 4: { // Delete From Front
                    Product removed = list.deleteFromFront();
                    if (removed == null) {
                        System.out.println("List is empty. Nothing to delete.");
                    } else {
                        removed.printID(); 
                        System.out.println("First item deleted");
                    }
                    break;
                }

                case 5: { // Delete ID
                    int id = readInt(sc, "Enter Product ID to delete: ");
                    Product removed = list.delete(id);
                    if (removed == null) {
                        System.out.println("Product with ID " + id + " not found. Nothing deleted.");
                    } else {
                        removed.printID(); 
                        System.out.println("Item deleted");
                    }
                    break;
                }

                case 6: // Print All Records
                    list.printAllRecords();
                    break;

                case 7: // Done
                    done = true;
                    System.out.println("Done.");
                    break;

                default:
                    System.out.println("Please enter a number 1-7.");
            }
        }

        sc.close();
    }
}
