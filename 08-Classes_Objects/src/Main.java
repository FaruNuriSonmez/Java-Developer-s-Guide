public class Main {

    public static void main(String[] args) {
	CustomerManager customerManager = new CustomerManager();

    customerManager.Add();
    customerManager.Remove();
    customerManager.Update();

    Transactions transactions = new Transactions();

    int result = transactions.Sum(3,4);

    System.out.println(result);
    }
}

