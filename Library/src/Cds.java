
public class Cds extends LibraryItems{
	private String Musician;
	
	public Cds(int ItemNumber, String Title, String Musician) {
		super(ItemNumber, Title);
		this.Musician = Musician;
	}

	public void nameMusician() {
		System.out.println(Musician + " created " + getTitle());
		System.out.println("");
	}
}
