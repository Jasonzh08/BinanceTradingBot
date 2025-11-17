package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SampleCalculatorTest {

    @Test
    void addReturnsSum() {
        SampleCalculator calculator = new SampleCalculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
    }

    @Test
    void sumHandlesEmptyCollections() {
        SampleCalculator calculator = new SampleCalculator();
        assertEquals(0, calculator.sum(Collections.emptyList()));
    }

    @Test
    void sumAggregatesMultipleValues() {
        SampleCalculator calculator = new SampleCalculator();
        assertEquals(15, calculator.sum(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    void sumRejectsNullInput() {
        SampleCalculator calculator = new SampleCalculator();
        assertThrows(NullPointerException.class, () -> calculator.sum(null));
    }
}
