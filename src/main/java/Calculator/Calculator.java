package Calculator;

public class Calculator {

    public int add(String numbers) {

        String[] s = getStrings(numbers);

        if (numbers.isEmpty()) {
            return 0;
        }
        return getASum(s);
    }

    private int getASum(String[] s) {
        int sum = 0;
        for (String a : s) {
            if(getAnInt(a)>1000){
                continue;
            }
            sum += getAnInt(a);
            if(a.startsWith("-")){
                throw new RuntimeException(a +" negatives not allowed");
            }
        }
        return sum;
    }

    private int getAnInt(String a) {
        return Integer.parseInt(a);
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


