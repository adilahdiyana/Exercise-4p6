package Exercise4_6;

public class Apple extends Fruit { //subclass for Fruit
	
	protected int quantity;
	protected double price;
	protected String brand;
	
	public Apple(String name, int quantity, double price, String brand) { //constructor with 3 arguments
		super(name);
		this.quantity = quantity;
		this.price = price;
		this.brand = brand;
		
		System.out.println("\nFruit of " + name);
		System.out.println("=========================");
		
		if (this.quantity <= 15) { //if the quantity less than or equal than 15
			System.out.println("The quantity bought\t\t\t: " + this.quantity);
			System.out.println("Price per " + name + "\t\t\t: RM " + this.price);
			System.out.println("Discount got\t\t\t: 0%");
			System.out.println("Total price of " + name + this.quantity + "\t\t\t: RM " + quantity*price);
		}
		
			else if (this.quantity >= 15 && this.quantity <= 55) { //if the quantity more than or equal than 15 and less than or equal than 55
				double totalPrice; //declare variable for total price
				TotalPrice atp = new AppleTotalPrice(); //create a new object for Totalprice
				totalPrice = atp.totalPrice(quantity); //initialize the total price of apple
				double newPrice = atp.price(); //declare and initialize the new price of apple
				System.out.println("The quantity bought\t\t\t: " + this.quantity);
				System.out.println("Price per " + name + "\t\t\t: RM " + newPrice);
				System.out.println("Discount got\t\t\t: 0%");
				System.out.printf("Total price of %d %s\t\t: RM %.2f%n", this.quantity, name, totalPrice);
		}
		
			else {
				double totalPrice; //declare variable for tootal price
				double disc; //declare variable for discount
				Discount aa = new AppleDiscount(); //create new object for discount
				disc = aa.rateOfDiscount(); //initialize the discount
				TotalPrice atp = new AppleTotalPrice(); //create a new object for TotalPrice apple
				totalPrice = atp.totalPrice(quantity, disc); //initialize the total price of apple
				double newPrice = atp.price(); //declare and initialize the new price of apple
				System.out.println("The quantity bought\t\t\t: " + this.quantity);
				System.out.println("Price per " + name + "\t\t\t: RM " + newPrice);
				System.out.printf("Discount got\t\t\t: %2.f percent", disc*100);
				System.out.printf("Total price of %d %s\t\t: RM %.2f%n", this.quantity, name, totalPrice);
			
		}
			
	}

	
	/*public double totalPrice() { //overloading method with no argument
 			return this.price * this.quantity;
	}

	  public double totalPrice(double newPrice) { //overloading method with 1 argument
			return newPrice * this.quantity;
	}

	  public double totalPrice(double newPrice, double disc) { //overloading method with 2 arguments
			return (newPrice * this.quantity) - (newPrice * this.quantity * disc);
    }*/
	
	public String toString() { //overriding method
		return "\nThis " + name + "is come from beautiful place that called as" + this.brand;
	}
	
	public String taste() { //overriding method
		return "\nThe taste of " + name + "is sweet.";
	}
} //end class of Apple
	
	

