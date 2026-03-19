import java.io.*;
import java.util.Date;
import java.util.Scanner;

/**
 * Клас для зберігання параметрів приміщення та результатів обчислень.
 * Реалізує інтерфейс Serializable для збереження стану.
 */
class RoomData implements Serializable {
    private static final long serialVersionUID = 1L;

    private int length, width, height;
    private int perimeter, area, volume;

    /**
     * Поле transient — демонструє особливість серіалізації: 
     * воно не буде збережене у файл.
     */
    private transient Date calculationDate;

    public RoomData(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.calculationDate = new Date();
    }

    public void setResults(int p, int s, int v) {
        this.perimeter = p;
        this.area = s;
        this.volume = v;
    }

    public int getLength() { return length; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }

    @Override
    public String toString() {
        return String.format("Розміри: %dx%dx%d | P: %d, S: %d, V: %d | Дата: %s",
                length, width, height, perimeter, area, volume, 
                (calculationDate == null ? "null (не серіалізовано)" : calculationDate));
    }
}

/**
 * Клас для знаходження рішення задачі. 
 * Використовує агрегування об'єкта RoomData.
 */
class RoomCalculator {
    private RoomData data;

    /**
     * Конструктор конвертує двійкові рядки у десяткові числа.
     * @param bl двійкова довжина
     * @param bw двійкова ширина
     * @param bh двійкова висота
     */
    public RoomCalculator(String bl, String bw, String bh) {
        int l = Integer.parseInt(bl, 2);
        int w = Integer.parseInt(bw, 2);
        int h = Integer.parseInt(bh, 2);
        this.data = new RoomData(l, w, h);
    }

    /**
     * Визначає периметр, площу та об'єм приміщення.
     */
    public void calculate() {
        int p = 2 * (data.getLength() + data.getWidth());
        int s = data.getLength() * data.getWidth();
        int v = s * data.getHeight();
        data.setResults(p, s, v);
    }

    public RoomData getData() { return data; }
}

/**
 * Клас для демонстрації роботи в діалоговому режимі та тестування.
 */
public class RoomApplication {
    private static final String FILE_NAME = "room.ser";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Введіть двійкові значення (0 та 1) ---");

        try {
            System.out.print("Довжина (напр. 1010): "); String l = scanner.next();
            System.out.print("Ширина (напр. 101): ");   String w = scanner.next();
            System.out.print("Висота (напр. 11): ");    String h = scanner.next();

            // Розрахунок
            RoomCalculator calc = new RoomCalculator(l, w, h);
            calc.calculate();
            System.out.println("\nПеред серіалізацією: " + calc.getData());

            // Збереження (Серіалізація)
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                oos.writeObject(calc.getData());
                System.out.println("Стан об'єкта збережено у файл " + FILE_NAME);
            }

            // Відновлення (Десеріалізація)
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                RoomData restored = (RoomData) ois.readObject();
                System.out.println("Після десеріалізації: " + restored);
            }

        } catch (NumberFormatException e) {
            System.out.println("Помилка: введено не двійкове число!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}