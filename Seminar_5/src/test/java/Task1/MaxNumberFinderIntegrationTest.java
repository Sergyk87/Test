package Task1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaxNumberFinderIntegrationTest {
    @Test
    void findMaxNumber() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        List<Integer> numbers = randomNumberGenerator.generateRandomNumbers(5, -100, 100);

        for (int n : numbers) {
            assertTrue(n >= -100 && n <= 100);
        }
    }
}
