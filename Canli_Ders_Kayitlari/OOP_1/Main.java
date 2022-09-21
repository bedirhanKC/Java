package oop1;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Vade Orani";
		
		Product product1 = new Product();
		
		product1.setName("delonghi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStocks(3);
		product1.setImageUrl("image1.jpg");	
		

		Product product2 = new Product();

		product2.setName("smeg kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStocks(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();

		product3.setName("kitchen kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStocks(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		
		System.out.println("<ul>");
		for(Product product : products) {
			
			System.out.println("<li>" + product.getName() + "</li>");
			
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setName("bedirhan");
		
		CorporateCustomer corporatecustomer = new CorporateCustomer();
		corporatecustomer.setId(2);
		corporatecustomer.setCompanyName("kodlama.io");
		corporatecustomer.setPhone("05453160598");
		corporatecustomer.setTaxNumber("11111111111");
		corporatecustomer.setCustomerNumber("1234");
		
		Customer[] customer = {individualCustomer, corporatecustomer};
		
		
	}

}
