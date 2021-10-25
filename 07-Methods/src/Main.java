public class Main {
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String GREEN_BOLD = "\033[1;32m"; // GREEN

    public static void main(String[] args) {
        findingNumbers(new int[]{1,2,3,4,5}, 3,4);
    }

    public static void findingNumbers(int[] numbers, int... number) {
        boolean found = check(false, numbers, number);

        if (found == true) {
            msj("Number Found : ", number[1]);
        }
        else {
            msj("Number Not Found : ", number[1]);
        }
    }

    public static boolean check(boolean found, int[] numbers, int... number){

        for(int num:number){
            for (int i=0; i < numbers.length; i++) {
                if (num == numbers[i]) {
                    found = true;
                    break;
                }
                else
                    found = false;
            }
        }
        return found;
    }

    public static void msj(String text, int number){
        System.out.println(GREEN_BOLD + text + number);
    }
}