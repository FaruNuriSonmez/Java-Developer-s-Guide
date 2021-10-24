public class Main {
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String GREEN_BOLD = "\033[1;32m"; // GREEN

    public static int i = 1;
    public static int j = 100;
    
    public static void main(String[] args) {
        whileLoops();
        doWhileLoops();
        forLoops();
    }

    //While
    public static void whileLoops(){
        while(i <= 10){
            System.out.print(GREEN_BOLD + i);
            i+=2;
            if (i <= 10 ){
                System.out.print("-");
            }
        }
        System.out.println("");
        System.out.println(RED_BOLD + "END WHILE LOOP");
        System.out.println(YELLOW_BOLD + "#########################################");
    }

    //Do While
    public static void doWhileLoops(){
        do {
            System.out.print(GREEN_BOLD + j);
            j+=2;
            if (j <= 10 ){
                System.out.print("-");
            }
        } while(j < 10);

        System.out.println("");
        System.out.println(RED_BOLD + "END DO-WHILE LOOP");
        System.out.println(YELLOW_BOLD + "#########################################");
    }

    //For
    public static void forLoops(){
        for (i=1; i<=10; i++){
            System.out.print(GREEN_BOLD + i);
            if (i < 10) {
                System.out.print("-");
            }
            else
                break;
        }
        System.out.println("");
        System.out.println(RED_BOLD + "END FOR LOOP");
        System.out.println(YELLOW_BOLD + "#########################################");
    }
}
