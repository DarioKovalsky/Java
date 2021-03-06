public class Library {
	// Add the missing implementation to this class
	String address;
	static int horaApertura=9;
	static int horaCierre=5;

	public Library(String string) {
		address = string;
	}
	
	private void returnBook(String string) {
		// TODO Auto-generated method stub
		
	}
	
	private void printAvailableBooks() {

	}
	
	private void borrowBook(String string) {
		isBorrowed();
	}
	
	private void isBorrowed() {
		// TODO Auto-generated method stub
		
	}

	private void printAddress() {
		System.out.println(address);
		
	}
	
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from "+ horaApertura + "am to " + horaCierre +"pm.");
	}
	
	private void addBook(Book book) {
		Book[] books = new Book[10];
		
		for (int i = 0; i < books.length; i++) {
			books[i]=book;
		}
	}

	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");

		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));

		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();

		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}
}