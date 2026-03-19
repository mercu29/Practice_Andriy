package Task3_Inheritance;
// головний клас програми
public class Main {
    public static void main(String[] args) {
        // створення фабрики результатів.
        // фабрика використовується для створення об'єктів CalcResult
        ResultFactory factory = new SimpleResultFactory();
        // створення колекції для зберігання результатів обчислень
        ResultCollection collection = new ResultCollection();
        // створення першого результату за допомогою фабричного методу
        CalcResult r1 = factory.createResult(10.5);
        // створення другого результату
        CalcResult r2 = factory.createResult(25.7);
        // додавання результатів до колекції
        collection.add(r1);
        collection.add(r2);
        // прохід по всіх результатах у колекції
        //  виведення їх на екран
        for (CalcResult r : collection.getResults()) {
            r.display(); // виклик методу відображення результату
        }
    }
}