public class Main {
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String GREEN_BOLD = "\033[1;32m"; // GREEN

    public static void main(String[] args) {
        ifStatements();
        examples();
        switchStatements();
    }

    public static void ifStatements(){
        //Some useful conditions
        System.out.println(5 == 5);
        System.out.println(10 != 11);
        System.out.println(3 < 6);
        System.out.println(10 > 100);

       int value = 20;

       if (value < 20){
           System.out.println( GREEN_BOLD + "The value is less than 20.");
       }
       else if ( value == value){
           System.out.println(YELLOW_BOLD + "The value is equal to 20.");
       }
       else {
           System.out.println(RED_BOLD + "The value is not less than 20.");
       }

       System.out.println("#########################################");
    }

    public static void examples(){
        int value1 = 20;
        int value2 = 25;
        int value3 = 2;

        int bigValue = value1;

        //Solution-1
        if (value2 < value1 ){
           if (value3 < value1){
               System.out.println(value1);
           }
           else if (value2 < value3){
               System.out.println(value3);
           }
        }
        else {
            if (value3 < value2){
                System.out.println(value2);
            }
            else {
                System.out.println(value3);
            }
        }
        //Solution-2

        if (bigValue < value2)
            bigValue = value2;
        if (bigValue < value3)
            bigValue = value3;

        System.out.println(bigValue);
        System.out.println("#########################################");
    }

    public static void switchStatements() {
        char grade = 'B';
        switch (grade){
            case 'A':
                System.out.println("Great Grade!");
                break;
            case 'B':
            case 'C':
                System.out.println("Good Grade!");
                break;
            case 'D':
                System.out.println("Pass Grade!");
                break;
            case 'F':
                System.out.println("You failed in class!");
                break;
            default:
                System.out.println("You entered an invalid grade!");
        }
    }



}
