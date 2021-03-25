package Calculator;

import java.util.Arrays;

public class Calculator {

    public int add(String numbers) {

        String[] s = numbers.split("[^-\\d]");

        for (String e:s) {
            if(e.startsWith("-")){
                throw new RuntimeException(e + " negatives not allowed");
            }
        }

        return Arrays.stream(s)
                .filter(t -> !t.isEmpty())
                .mapToInt(Integer::parseInt)
                .filter(d -> d <1001)
                .sum();
    }

    }


