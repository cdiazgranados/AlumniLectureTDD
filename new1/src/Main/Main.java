package Main;

public class Main {
    public String[] sortNumbers(String[] input) {
        String temp;
        Boolean sorted = false;

        //for loop that checks charAt

        while (sorted == false) {
            sorted = true;
            for (int i = 0; i < input.length - 1; i++) {

                String[] numbersToCompare = new String[]{input[i], input[i + 1]};

                if (firstBiggerThanSecond(numbersToCompare)) {
                    temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    sorted = false;
                }
            }

        }
        return input;
    }

    //swap numbers method

    //if greaterMethod
    public Boolean firstBiggerThanSecond(String[] input) {
        if (input[0].length() > input[1].length()) return true;
        if (input[0].length() < input[1].length()) return false;
        if (input[0].compareTo(input[1]) > 0) return true;
        return false;
    }

    public static void main(String[] args) {
    }


}