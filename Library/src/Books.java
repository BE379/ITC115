
public class Books extends LibraryItems {
	private String Author;

	public Books(int ItemNumber, String Title, String Author) {
		super(ItemNumber, Title);
		this.Author = Author;
		// TODO Auto-generated constructor stub
	}
	
	public void whoIsAuthor() {
		System.out.println("The author of " + getTitle() + " is " + Author + ".");
		System.out.println("");
	}

}
