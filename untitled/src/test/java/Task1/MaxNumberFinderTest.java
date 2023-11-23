package Task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberFinderTest {

     @Test
    void findMaxNumber_emptyList() {
         MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
         List<Integer> numbers = new ArrayList<>();
         assertThrows(IllegalArgumentException.class, () -> maxNumberFinder.findMaxNumber(numbers));
    }

    @Test
    void findMaxNumber_singleValue() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        List<Integer> numbers = List.of(5);
        assertEquals(5, maxNumberFinder.findMaxNumber(numbers));
    }

    @Test
    void findMaxNumber_multiValue() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        List<Integer> numbers = Arrays.asList(5, 3, 7, 9);
        assertEquals(9, maxNumberFinder.findMaxNumber(numbers));
    }
}