package by.it.academy.maven.impl;

import by.it.academy.maven.Service;

import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;

public class MathService implements Service {
    public Double average(List<String> values) {
        OptionalDouble optionalDouble =
                values.stream()
                        .filter(Objects::nonNull)
                        .mapToInt(Integer::parseInt)
                        .average();

        return optionalDouble.orElse(0.0);

        /*double sum = 0;
        for (Integer value:values) {
            if (value != null) sum += value;
        }
        return sum/values.size();*/
    }
}
