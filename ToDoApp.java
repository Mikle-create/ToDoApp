
import java.util.ArrayList;
import java.util.Scanner;

class ToDoList {
    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Задача добавлена: " + task);
    }

    public void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Задача удалена: " + task);
        } else {
            System.out.println("Задача не найдена: " + task);
        }
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
        } else {
            System.out.println("Ваши задачи:");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }
}

public class ToDoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Показать все задачи");
            System.out.println("4. Выйти");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // для обработки новой строки после ввода числа

            switch (choice) {
                case 1:
                    System.out.print("Введите задачу: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Введите задачу для удаления: ");
                    String taskToRemove = scanner.nextLine();
                    toDoList.removeTask(taskToRemove);
                    break;
                case 3:
                    toDoList.showTasks();
                    break;
                case 4:
                    System.out.println("Выход из программы...");
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }
}
