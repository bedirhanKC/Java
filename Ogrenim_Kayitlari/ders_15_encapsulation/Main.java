package ders_15_encapsulation;

public class Main {

	public static void main(String[] args) {
		
		//Product product = new Product(1,"Laptop","Asus Tuf Gaming",15000,3,"black");
		Product product = new Product();
		
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Tuf Gaming");
		product.setPrice(15000);
		product.setStockAmount(3);
		product.setRenk("black");
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);

	}

}
