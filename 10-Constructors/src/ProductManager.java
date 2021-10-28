public class ProductManager {

    //Correct usage
    public void Add(Product product){
        //JDBC
        System.out.println( product.get_name() +" Product Added." );
    }

    //Wrong usage
    /*
    public void Add(int id, String name, String desc, int stockAmount, double price){
        System.out.println( id + name + desc + stockAmount + price +" Product Added." );
    }
    */
}
