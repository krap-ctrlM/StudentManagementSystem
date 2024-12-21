
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + name;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nВыберите операцию (1: Добавить, 2: Удалить, 3: Просмотреть, 4: Выйти): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите ID студента: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Введите имя студента: ");
                    String name = scanner.nextLine();
                    students.add(new Student(id, name));
                    System.out.println("Студент добавлен.");
                    break;
                case 2:
                    System.out.print("Введите ID студента для удаления: ");
                    int removeId = scanner.nextInt();
                    students.removeIf(student -> student.id == removeId);
                    System.out.println("Студент удален.");
                    break;
                case 3:
                    System.out.println("Список студентов:");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                case 4:
                    System.out.println("Выход из системы.");
                    return;
                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }
}
