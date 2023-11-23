package Task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    @Test
    void generateRandomNumbers_count() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        assertEquals(5, randomNumberGenerator.generateRandomNumbers(5, 1, 100).size());
    }

    @Test
    void generateRandomNumbers_inRange() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        List<Integer> numbers = randomNumberGenerator.generateRandomNumbers(10, -100, 100);

        for (int n : numbers) {
            assertTrue(n >= -100 && n <= 100);
        }
    }
}