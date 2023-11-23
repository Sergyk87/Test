package Task1;

// Модуль 1: Генерация списка случайных чисел
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class RandomNumberGenerator {

    public List<Integer> generateRandomNumbers(int count, int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            numbers.add(randomNumber);
        }

        return numbers;
    }
}
