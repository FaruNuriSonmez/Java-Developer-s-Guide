public class Main {
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String GREEN_BOLD = "\033[1;32m"; // GREEN

    public static void main(String[] args) {
        String student1="Faru1";
        String student2="Faru2";
        String student3="Faru3";

        System.out.println(RED_BOLD + student1);
        System.out.println(RED_BOLD + student2);
        System.out.println(RED_BOLD + student3);

        System.out.println(YELLOW_BOLD + "-------------------------");

        stringArray();
        intArray();
        examples();
        multiDimensionalArray();
    }

    public static void stringArray(){
        String[] students;
        students = new String[3];

        students[0] = "Faru1";
        students[1] = "Faru2";
        students[2] = "Faru3";

        //Solution-1
        for (int i=0; i < students.length; i++){
            System.out.println(GREEN_BOLD + students[i]);
        }
        System.out.println(YELLOW_BOLD + "-------------------------");
        //Solution-2
        for (String student:students){
            System.out.println(GREEN_BOLD + student);
        }

        System.out.println(YELLOW_BOLD + "-------------------------");
    }

    public static void intArray(){
        int[] numbers = {5, 6, 7};

        //Solution-1
        for (int i=0; i<numbers.length; i++){
            System.out.println(GREEN_BOLD + numbers[i]);
        }
        System.out.println(YELLOW_BOLD + "-------------------------");
        //Solution-2
        for (int number:numbers){
            System.out.println(GREEN_BOLD + number);
        }
        System.out.println(YELLOW_BOLD + "-------------------------");
    }

    public static void examples(){
        double[] myList = {1.2,6.3,1.4,1.5,1.6};
        double total=0;
        double max = myList[0];
        for (double number:myList){
            if (max < number){
                max = number;
            }
            total = total + number;
            System.out.println(GREEN_BOLD + number);
        }
        System.out.println("total = " +total);
        System.out.println("max = " +max);
        System.out.println(YELLOW_BOLD + "-------------------------");
    }

    public static void multiDimensionalArray(){
        String[][] cities = new String[3][3];

        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Bilecik";
        cities[1][0] = "Kayseri";
        cities[1][1] = "Yozgat";
        cities[1][2] = "Ankara";
        cities[2][0] = "Siirt";
        cities[2][1] = "Diyarbakır";
        cities[2][2] = "Ağrı";

        for (int i=0; i<=2; i++){
            System.out.println(YELLOW_BOLD + "-------------------------");
            for(int j=0; j<=2; j++){
              System.out.println(cities[i][j]);
            }
        }
    }
}
