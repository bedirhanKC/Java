package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao , Logger[] loggers) {

		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {

		// iş kuralları

		if (product.getUnitPrice() < 10) {

			throw new Exception("ürün fiyatı 10dan küçük olamaz.");

		}
		
		productDao.add(product);
		
		for(Logger logger:loggers) {
			
			logger.log(product.getName());
			
		}
	}

}
