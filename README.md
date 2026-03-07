
# E-Commerce Product Manager Using Linked List

## Project Description

This Java project simulates a simple product management system for an e-commerce company using a **custom singly linked list**. The application stores product records and allows users to perform core operations such as insertion, searching, deletion, and displaying all records.

The goal of the project is to apply **linked list concepts** in a real scenario while using object-oriented programming and data structure implementation in Java.

---

## Objectives

- Implement a custom linked list from scratch
- Store product records efficiently
- Perform common linked list operations
- Build a menu-driven Java console application
- Prevent duplicate product IDs

---

## Functionalities

The program supports the following operations:

- Emptys the list
- Finds a product by ID
- Insert a product at the front of the list
- Delete the first product in the list
- Delete a product by its ID
- Print all product records
- Exit the program

---

## Classes Used

### `IDedObject`
An interface that ensures every stored object has:
- a unique integer ID
- a method to print its information

### `Product`
A class that represents each product with:
- Product ID
- Product Name
- Supplier Name

### `MyLinkedList<AnyType extends IDedObject>`
A generic custom linked list that supports:
- insertion
- searching
- deletion
- printing records
- clearing the list

### `ProductManager`
The main class that provides a user-friendly menu for interacting with the system.

---

## Data Structure Used

This project uses a **singly linked list**, where each node contains:
- product data
- a reference to the next node

This structure is useful because it allows:
- an adaptable memory allocation
- easy insertion at the front
- efficient deletion without shifting other elements

---
## Compilation and Execution

### Compile all Java files

```
javac *.java

```

### Then Run the program
```
java ProductManager
```
## Program Menu Output

```text
1. Make Empty
2. Find ID
3. Insert At Front
4. Delete From Front
5. Delete ID
6. Print All Records
7. Done
