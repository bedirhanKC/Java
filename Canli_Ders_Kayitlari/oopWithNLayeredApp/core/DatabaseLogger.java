package oopWithNLayeredApp.core.logging;

public class DatabaseLogger implements Logger{

	public void log(String data) {
		
		System.err.println("Veritabanına loglandı : " + data);
		
	}

}
