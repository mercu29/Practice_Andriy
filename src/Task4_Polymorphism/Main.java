package Task4_Polymorphism;
import Task3_Inheritance.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // створюю фабрику для створення об'єктів
        ResultFactory factory = new ViewableTable();
        // створюю колекцію, де будемо зберігати результати
        ResultCollection collection = new ResultCollection();
        // ініціалізація сканера для читання з консолі
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (0 to stop):");
        // запуск безкінечного циклу для введення даних
        while (true) {
            double val = scanner.nextDouble();
            // якщо ввели 0, зупиняємо цикл
            if (val == 0) {
                break;
            }
            // створення результат через фабрику і додаємо в список
            collection.add(factory.createResult(val));
        }
        // створення об'єктів для відображення таблиці з певною шириною
        ViewTable table = new ViewTable(12);
        // вивід всіх даних на екран
        table.displayTable(collection.getResults());
    }
}
