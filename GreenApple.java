package Exercise4_6;

public class GreenApple extends Apple{ //subclass for Apple
	
	private String colour;
	
	public GreenApple(String name, int quantity, double price, String brand, String colour) {
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
		return "The taste of Green Apple\t: Little bit sour" + "\n";
	}
	
} //end class of Green apple
