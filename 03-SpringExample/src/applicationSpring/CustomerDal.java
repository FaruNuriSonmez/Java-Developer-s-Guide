package applicationSpring;

public class CustomerDal implements ICustomerDal {
	
    	String connectionString;
    	
    	public String getconnectionString() {
    	    return connectionString;
    	}
    	
    	public void setconnectionString(String connectionString) {
    	    this.connectionString = connectionString;
    	}
    
	public void add() {
	    	System.out.println("Connection String : " + this.connectionString);
		System.out.println("Oracle");
	}
}
