package Lab02.ex1;

public class Book {
	private String chapters[]; // Array
	private static final int DEFAULT_CHAPTERS = 10;
	
	// Constructor
	public Book() {
		chapters = new String[DEFAULT_CHAPTERS]; // Size 10
		for (int i = 0; i < chapters.length; i++) {
			chapters[i] = "Cahpter " + i;
		}
	}
	
	// Construct the object with an array of chapter names
	public Book(String argument[]) {
		chapters = new String[argument.length]; // Size 10
		for (int i = 0; i < argument.length; i++) {
			chapters[i] = argument[i];
		}
	}
	
	// Return the chapter by the given index
	public String getChapter(int i) {
		if (i < 0 || i >= chapters.length) {
			System.out.println("Invalid Chapter");
		}
		
		return chapters[i];
	}
	
	public String[] getChapters() {
		return chapters;
	}

}
