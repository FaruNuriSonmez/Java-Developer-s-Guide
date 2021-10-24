public class Main {

    public static void main(String[] args) {
        StringDataType();
        BasicDataTypes();
    }

    public static void StringDataType() {
        String text = "Hello";

        String blank = " ";

        String name = "Java!";

        String greeting = text + blank + name;

        System.out.println(greeting);

        System.out.println("Hello " + "Java!");
    }

    public static void BasicDataTypes() {
        int myNumber = 12;
        short myShort = 38;
        long myLong = 3838;

        double myDouble = 7.3243;
        float myFloat = 324.3f;

        char myChar = 'y';
        boolean myBoolean = false;

        byte myByte = 127;

        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);
    }
}
