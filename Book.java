package exercise_dosyalama;

public class Book extends Document{

	public Book(String[] authors, String title) {
	
		super(authors);
		this.title = title;
		
	}

	private String title;

	
	public String getTitle() {
		
		return this.title;
		
	}
	
}
