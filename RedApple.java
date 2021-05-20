package Exercise4_6;

public class RedApple extends Apple { //subclass for Apple

	private String colour;
	
	public RedApple(String name, int quantity, double price, String brand, String colour) {
		super(name, quantity, price, brand);
		this.colour = colour;
		
		colour();
	}

	public void colour() {
		System.out.println("Coluor of " + name + "\t\t: " + this.colour);
	}
	public String toString() {    //overriding method
		return "\nThis " + name + "is come from beautiful place that called as" + this.brand;
	}
	 
	public String taste() {    //overriding method
		return "The taste of Red Apple\t\t: Little bit sour" + "\n";
	}
	
} //end class of RedApple
