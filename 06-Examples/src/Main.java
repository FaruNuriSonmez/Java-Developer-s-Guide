public class Main {

    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String GREEN_BOLD = "\033[1;32m"; // GREEN

    public static void main(String[] args) {
        primeNumber(2);
        vowelLetters('A');
        perfectNumber(6);
        friendlyNumber(220,284);
        findingNumbers(new int[]{1,2,3,4,5},6);
    }

    public static void primeNumber(int number){

        boolean isPrime = true;

        if (number == 1){
            System.out.println(YELLOW_BOLD +"The number is not prime.");
            return;
        }
        if(number<1){
            System.out.println(RED_BOLD + "Invalid Number.");
            return;
        }


        for (int i=2; i<number; i++){
            if (number % i == 0){
                isPrime = false;
            }
        }

        if (isPrime){ //isPrime == true
            System.out.println(GREEN_BOLD + "Number is prime.");
        }
        else {
            System.out.println(GREEN_BOLD + "The number is not prime.");
        }
    }

    public static void vowelLetters(char letter){

        switch (letter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(GREEN_BOLD + "Thick vowels");
                break;
            default:
                System.out.println(GREEN_BOLD + "Thin vowels");
        }
    }

    public static void perfectNumber(int number){
        //6-->1,2,3
        //28-->1,2,4,7,14

        int total = 0;

        for(int i=1; i<number; i++){
            if (number % i == 0)
                total = total + i;
        }

        if (total == number)
            System.out.println(GREEN_BOLD + "Is the perfect number.");
        else
            System.out.println(GREEN_BOLD + "It's not a perfect number.");
    }

    public static void friendlyNumber(int number1, int number2){
        //220-284
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++){
            if (number1%i==0)
                total1 = total1 + 1;
        }
        for (int j = 1; j < number2; j++){
            if (number2%j==0)
                total2 = total2 + 1;
        }

        if (number1==total2 && number2==total1){
            System.out.println(GREEN_BOLD + "Numbers are friend numbers.");
        }
        else {
            System.out.println(RED_BOLD + "Numbers are not friend numbers.");
        }
    }

    public static void findingNumbers(int[] numbers, int number){
        boolean found = false;
        for (int i=0; i < numbers.length; i++) {
            if (number == numbers[i])
                found = true;
            else
                found = false;
        }

        if (found == true)
            System.out.println(GREEN_BOLD + "Number Found.");
        else
            System.out.println(RED_BOLD + "Number Not Found.");
    }
}
