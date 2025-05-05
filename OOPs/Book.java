package encapsulation;
class Book {
	private int pages;

	// setter method/mutators
	public void setPages(int x) {
		if (x > 0) {
			pages = x;
		}
	}

	// getter method/accessors
	public int getPages() {
		return pages;
	}
}

public class BookApp {
	public static void main(String[] args) {
		Book b = new Book();
		b.setPages(-100);
		int m = b.getPages();
		System.out.println("The value of pages are " + m);
	}
}

