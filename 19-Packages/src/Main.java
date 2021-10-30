import java.util.Scanner;
import Mathematics.Transactions;
import Mathematics.Logarithm;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your Name : ");

        String name = scanner.nextLine();

        System.out.println("Hello " + name +"!");

        Transactions transactions = new Transactions();

        int total = transactions.Addition(1,1);

        System.out.println(total);

        Logarithm logarithm = new Logarithm();

        System.out.println(logarithm.calculate());
    }
}
