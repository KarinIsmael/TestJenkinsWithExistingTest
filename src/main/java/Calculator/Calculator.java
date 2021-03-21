package Calculator;

public class Calculator {

    public int add(String numbers){

        String[] s = numbers.split(",");

        if (numbers.isEmpty()){
        return 0;
        }
        if (numbers.length()<2){
            return Integer.parseInt(numbers);
        }
        else return Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
    }

}
