package lab4_enum;

public enum Branch {
	
	MATH("matematik"),
	PHYSICS("fizik"),
	CS("bilgisayar bilimi"),
	ENG("ingilizce");
	
	private String explanation;
	
	Branch(String explanation) {
		
		this.explanation = explanation;
	}

	public String getExplanation() {
		return explanation;
	}
	
	
}
