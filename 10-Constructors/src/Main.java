public class Main {

    public static void main(String[] args) {
        Product product2 = new Product(1,"Casper","Nirvana",3500,100);
        Product product = new Product();

        product.set_name("Asus");
        product.set_description("ROG 5");
        product.set_price(2500);
        product.set_stockAmount(3);

        ProductManager productManager = new ProductManager();

        //productManager.Add(product.name, product.description, product.stockAmount, product.price);

        productManager.Add(product);

        System.out.print(product.get_name());
        System.out.print(product2.get_name());

    }
}
