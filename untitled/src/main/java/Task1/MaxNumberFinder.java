package Task1;

// Модуль 2: Поиск максимального числа в списке
import java.util.List;

public class MaxNumberFinder {
    public int findMaxNumber(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Список чисел пуст или равен null.");
        }

        int maxNumber = numbers.get(0);

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }
}