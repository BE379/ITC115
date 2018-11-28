import java.text.NumberFormat;

public class Product {

	private String name;
	private String productCode;
	private String description;
	private double price;
	private int productCount;

	public Product(String name, String productCode, String description, double price, int productCount) {
		this.name = name;
		this.productCode = productCode;
		this.description = description;
		this.price = price;
		this.productCount = productCount;
	}

	public String toString() {
		return ("Name: " + name + " " + " Product Code: " + productCode + "\t" + " Price $" + price + "\t"
				+ "Product Count: " + productCount);
	}

	public double getprice() {
		return price;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}
}
