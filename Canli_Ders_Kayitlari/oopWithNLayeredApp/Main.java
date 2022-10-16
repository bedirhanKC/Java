package oopWithNLayeredApp;

import java.io.File;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product = new Product(1,"Iphone 11",12000);
		
		Logger[] loggers = {new DatabaseLogger() , new FileLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product);
		

	}
 }