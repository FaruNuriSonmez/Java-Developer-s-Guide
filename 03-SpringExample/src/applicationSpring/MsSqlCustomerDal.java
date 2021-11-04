package applicationSpring;

public class MsSqlCustomerDal implements ICustomerDal {
    
    String connectionString;
    
    public String getconnectionString() {
	return connectionString;
    }
    
    public void setconnectionString(String connectionString) {
	this.connectionString = connectionString;
    }

    @Override
    public void add() {
	System.out.println("MsSql Connection String : " + this.connectionString);
	System.out.println("MsSql");
    }

}
