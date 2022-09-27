package ders_14_classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.name = "Laptop";
		product.id=1;
		product.description = "Asus tuf gaming";
		product.price = 16000;
		product.stockAmount = 3;
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);

	}

}
