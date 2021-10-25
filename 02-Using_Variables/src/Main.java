import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        stringDataType();
        basicDataTypes();
        stringsExamples();
    }

    public static void stringDataType() {
        String text = "Hello";

        String blank = " ";

        String name = "Java!";

        String greeting = text + blank + name;

        System.out.println(greeting);

        System.out.println("Hello " + "Java!");
    }

    public static void basicDataTypes() {
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

    public static void stringsExamples(){
        String msj = "Hello Java";

        System.out.println("Character Length: " + msj.length());
        System.out.println("5th Character : " + msj.charAt(4));
        System.out.println(msj.concat("!"));
        System.out.println(msj);
        System.out.println(msj.startsWith("H"));
        System.out.println(msj.endsWith("a"));

        char[] msj1 = new char[5];
        msj.getChars(0,5, msj1, 0);
        System.out.println(msj1);

        System.out.println(msj.indexOf("e"));
        System.out.println(msj.lastIndexOf("e"));

        System.out.println(msj.replace("Hello","Hi"));

        System.out.println(msj.substring(6));
        System.out.println(msj.substring(6,10));

        for (String character:msj.split(" ")){
            System.out.println(character);
        }

        System.out.println(msj.toLowerCase(Locale.ROOT));
        System.out.println(msj.toUpperCase(Locale.ROOT));

        System.out.println(msj.trim());
    }
}
