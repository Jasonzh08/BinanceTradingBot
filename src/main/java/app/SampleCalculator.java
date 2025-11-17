package app;

import java.util.List;
import java.util.Objects;

public class SampleCalculator {
    public int add(int left, int right) {
        return left + right;
    }

    public int sum(List<Integer> values) {
        Objects.requireNonNull(values, "values");
        return values.stream().mapToInt(Integer::intValue).sum();
    }
}
