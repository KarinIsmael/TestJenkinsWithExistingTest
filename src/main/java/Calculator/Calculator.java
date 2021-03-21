package Calculator;

public class Calculator {

    public int add(String numbers) {

        String[] s = numbers.split(",");

        int sum = 0;

        if (numbers.isEmpty()) {
            return 0;
        }
        for (String a : s) {
            sum += Integer.parseInt(a);
        }
        return sum;

    }

}
