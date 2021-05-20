package Exercise4_6;

public class Strawberry extends Fruit { //subclass for Fruit
	
	protected int kJoules;
	protected int amount;
	protected String colour;
	protected double price;
	protected String brand;
			
	public Strawberry(String name, int kJoules, int amount, String colour, double price, String brand) { //constructor with 5 arguments
		super(name);
		this.kJoules = kJoules;
		this.amount = amount;
		this.colour = colour;
		this.price = price;
		this.brand = brand;
		
		System.out.println("\nFruit of " + name);
		System.out.println("=========================");
		
		if (this.amount <= 300) { //amount less than or equal to 300
			System.out.println("The quantity bought\t\t\t: " + this.amount + " gram.");
			System.out.println("Price per gram\t\t\t: RM " + this.price);
			System.out.println("Discount got\t\t\t: 0%");
			System.out.printf("Total price of %d grams %s\t\t: RM %.2f%n", this.amount, name, this.amount * this.price);
		}
		
			else if (this.amount >= 300 && this.amount <= 500) { //if quantity more than 300 and less than or equal to 500
				double totalPrice; //declare variable for total price
				TotalPrice stp = new StrawberryTotalPrice(); //create a new object for TotalPrice strawberry
				double newPrice = stp.price();//declare and initialize the new price of strawberry
				totalPrice = stp.totalPrice(amount);//initialize the total price of strawberry
				System.out.println("The quantity bought\t\t\t: " + this.amount + " gram.");
				System.out.println("Price per gram\t\t\t: RM " + newPrice);
				System.out.println("Discount got\t\t\t: 0%");
				System.out.printf("Total price of %d grams %s\t\t: RM %.2f%n", this.amount, name ,totalPrice);
		}
		
			else {
				double totalPrice; //declare variable for total price
				double disc; //declare variable for discount
				Discount aa = new StrawberryDiscount();  //create a new object for discount
				disc = aa.rateOfDiscount(); //initialize the discount
				TotalPrice stp = new StrawberryTotalPrice(); //create a new object for TotalPrice strawberry
				double newPrice = stp.price2(); //declare and initialize the new price of strawberry
				totalPrice = stp.totalPrice(amount, disc); //initialize the total price of strawberry
				System.out.println("The quantity bought\t\t\t\t: " + this.amount + " gram.");
				System.out.println("Price per gram "+ name + "\t\t\t: RM " + newPrice);
				System.out.printf("Discount got\t\t\t\t: %.2f percent", disc*100);
				System.out.printf("%nTotal price of %d grams %s\t: RM %.2f%n", this.amount, name ,totalPrice);
		}
		
		if (this.colour.equals("Red")) {
			int calcNutrition = calcNutrition(); //declare and initialize the calculate nutrition method
			System.out.println("Food energy provided by 100 g Red Strawberry: "+ this.kJoules + " kJ");
			System.out.println("Food energy provided by " + this.amount + " g Red Strawberry: "+ calcNutrition/100 + " kJ");
		}
		
		else if (this.colour.equals("Green")) {
			int nKj = 300; //declare and initialize the kJ
			int calcNutrition = calcNutrition(nKj);//initialize the calculate nutrition method
			System.out.println("Food energy provided by 100 g Green Strawberry: "+ nKj + " kJ");
			System.out.println("Food energy provided by " + this.amount + " g Green Strawberry: "+ calcNutrition/100 + " kJ");
		}
		
		else
			System.out.println("There are no such colour.");
	}
	
	/*public double totalPrice() { // overloading method with no argument
		return this.price * this.amount;
		
	}
	
	public double totalPrice(double newPrice) { // overloading method with 1 argument
		return newPrice * this.amount;
	}
	
	public double totalPrice(double newPrice, double disc) { // overloading method with 2 argument
		return (newPrice * this.amount) - (newPrice * this.amount * disc);
	}*/
	
	 public int calcNutrition() {
		 return this.kJoules * this.amount;
	 }
	 
	 public int calcNutrition(int nKj) {
		 return nKj * this.amount;
	 }
	 
	 public String taste() {   //overriding method
			return "The taste of " + name + ": Sweet and Sour";
		}
	 
	 public String toString() {     //overriding method
		 return "\nThis " + name + "is come from beautiful place that called as" + this.brand;
		}
	
} //end class of Strawberry

	
