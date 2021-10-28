public class Main {

    public static void main(String[] args) {
        //BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new MailLogger()};

        //for (BaseLogger logger:loggers)
            //logger.Log(" Message");

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.Add();

        //MailLogger mailLogger = new MailLogger();
        //mailLogger.Log(" Message");

        //DatabaseLogger databaseLogger = new DatabaseLogger();
        //databaseLogger.Log(" Message");
    }
}
