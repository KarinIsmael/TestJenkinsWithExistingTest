package Calculator;

public class Calculator {

    public int add(String numbers) {

        String[] s = getStrings(numbers);

        int sum = 0;

        if (numbers.isEmpty()) {
            return 0;
        }

        for (String a : s) {
            sum += Integer.parseInt(a);
            if(a.startsWith("-")){
                throw new RuntimeException(a +" negatives not allowed");
            }
        }
        return sum;

    }

    private String[] getStrings(String numbers) {
        return numb(numbers).split(delimiters(numbers));

    }

        private String delimiters(String numbers){
            String del = ",|;|/n";
            if(numbers.startsWith("//"+del))
                del = numbers.substring(2,4);
            return del;
        }

        private String numb (String numbers){
            if(numbers.startsWith("//"))
                numbers = numbers.substring(5);
            return numbers;
        }

    }


