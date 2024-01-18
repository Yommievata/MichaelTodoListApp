package org.todoapp;

import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMy Todo:");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Mark Task as Completed");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                }
                case 2 -> {
                    System.out.print("Enter task index to delete: ");
                    int taskIndex = scanner.nextInt();
                    toDoList.deleteTask(taskIndex);
                }
                case 3 -> toDoList.displayTasks();
                case 4 -> {
                    System.out.print("Enter task index to mark as completed: ");
                    int taskIndex = scanner.nextInt();
                    toDoList.markTaskAsCompleted(taskIndex);
                }
                case 5 -> {
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}