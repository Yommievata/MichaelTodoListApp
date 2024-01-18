package org.todoapp;

import java.util.ArrayList;

public class ToDoList {
    private final ArrayList<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added successfully.");
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void markTaskAsCompleted(int taskIndex) {
        if (isValidIndex(taskIndex)) {
            Task task = tasks.get(taskIndex - 1);
            task.markAsCompleted();
            System.out.println("Task marked as completed: " + task.getDescription());
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void deleteTask(int taskIndex) {
        if (isValidIndex(taskIndex)) {
            Task task = tasks.remove(taskIndex - 1);
            System.out.println("Task deleted: " + task.getDescription());
        } else {
            System.out.println("Invalid task index.");
        }
    }

    private boolean isValidIndex(int index) {
        return index > 0 && index <= tasks.size();
    }
}