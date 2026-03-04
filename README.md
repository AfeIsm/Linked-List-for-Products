# Linked List to track e-commerce products
Project 1 - Linked List (Products)

IDE Used: IntelliJ IDEA (permitted)
Java Version: (fill in, e.g., Java 17)

Files:
- IDedObject.java
- Product.java
- MyLinkedList.java
- ProductManager.java

How to Run (IntelliJ):
1) Open the folder as a project
2) Ensure JDK is set (File -> Project Structure -> Project SDK)
3) Run ProductManager.java

How to Run (Command Line):
1) Open terminal in the folder containing the .java files
2) Compile:
   javac *.java
3) Run:
   java ProductManager

What works:
- makeEmpty
- findID (no removal)
- insertAtFront (rejects duplicate IDs)
- deleteFromFront
- delete(ID)
- printAllRecords (prints message if empty)

What doesn’t work:
- (Write "N/A" if everything works)

Sample Run (example):
Operations on List
1. Make Empty
2. Find ID
3. Insert At Front
4. Delete From Front
5. Delete ID
6. Print All Records
7. Done
Your choice: 3
Enter Product ID: 1111
Enter Product Name: ABC Book
Enter Supplier Name: Scholastic
Product Added

Your choice: 2
Enter Product ID: 1111
ID No: 1111
1111
ABC Book
Scholastic

Your choice: 4
1111
ABC Book
Scholastic
First item deleted

Your choice: 7
Done.
