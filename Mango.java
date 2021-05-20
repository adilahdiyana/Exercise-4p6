package Exercise4_6;

public class Mango extends Fruit { //subclass for Fruit
	
	private double vitC;
	private int weight;
	private int quantity;
	private String taste;
	private String brand;
	private double price;
	
	public Mango (String name, int weight, String taste, double vitC, String brand, double price, int quantity) { //constructor with 6 arguments
		super(name);
		this.vitC = vitC;
		this.weight = weight;
		this.taste = taste;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		
		
		if (this.quantity <= 10) {   //if quantity less than or equal to 10
			System.out.println("The quantity bought\t\t\t: " + this.quantity);
			System.out.println("Price per "+ name + "\t\t: RM "+ this.price);
			System.out.println("Discount got\t\t\t: 0 %");
			System.out.println("Total price of " + this.quantity + " " + name + "\t\t: RM "+ price * quantity);
		}
		
			else if(this.quantity >= 10 && this.quantity <= 20) { //if quantity more than 10 and less than or equal to 20
				double totalPrice; //declare variable for total price
				TotalPrice mtp = new MangoTotalPrice(); //create a new object for TotalPrice mango
				double newPrice = mtp.price();//declare and initialize the new price of mango
				totalPrice = mtp.totalPrice(quantity); //initialize the total price of mango
				System.out.println("The quantity bought\t\t\t: " + this.quantity);
				System.out.println("Price per "+ name + "\t\t: RM " + newPrice);
				System.out.println("Discount got\t\t\t: 0% ");
				System.out.printf("Total price of %d %s\t\t: RM %2f%n", this.quantity, name ,totalPrice);
		}
		
			else {
				double totalPrice;  //declare variable for total price
				double disc; //declare variable for discount
				Discount aa = new MangoDiscount();  //create a new object for discount
				disc = aa.rateOfDiscount();  //initialize the discount
				TotalPrice mtp = new MangoTotalPrice(); //create a new object for TotalPrice mango
				double newPrice = otp.price2(); //declare and initialize the new price of mango
				totalPrice = mtp.totalPrice(quantity, disc); //initialize the total price of mango
				System.out.println("The quantity bought\t\t\t: " + this.quantity);
				System.out.println("Price per "+ name + "\t\t: RM " + newPrice);
				System.out.printf("Discount got\t\t\t: %.2f percent", disc*100);
				System.out.printf("%nTotal price of %d %s\t: RM %.2f%n", this.quantity, name ,totalPrice);
		}
		
		if(this.weight <= 50) {
			getVitC();//call the method getVitC
			System.out.println("Weight\t\t\t\t: " + this.weight + " g");
			System.out.println("Size of mango\t\t\t: Small");
			System.out.printf("Amount of Vitamin C\t\t: %.2f mg%n", getVitC());
		}
		
		else if(this.weight >= 50 && this.weight <= 100 ) {
			double nVC = 40.5;  //declare and initialized the new amount of vitamin C
			getVitC(nVC);//call the method getVitC
			System.out.println("Weight\t\t\t\t: " + this.weight + " g");
			System.out.println("Size of mango\t\t\t: Medium");
			System.out.printf("Amount of Vitamin C\t\t: %.2f mg%n", getVitC(nVC));
		}
		
		else if(this.weight >= 100) {
			double nVC = 65.5;//declare and initialized the new amount of vitamin C
			String harm = "You consume too much orange. It is very harmful!!!";//declare and initialized the string variable
			System.out.println("Weight\t\t\t\t: " + this.weight + " g");
			System.out.println("Size of mango\t\t\t: Large");
			System.out.printf("Amount of Vitamin C\t\t: %.2f mg%n%s", getVitC(nVC), harm);
		}
		
	}
	
	/*public double totalPrice() { //overloading method with no argument
		return this.price * this.weight;
		
	}
	
	public double totalPrice(double newPrice) { //overloading method with 1 argument
		return newPrice * this.weight;
	}
	
	public double totalPrice(double newPrice, double disc) { // overloading method with 2 argument
		return (newPrice * this.weight) - (newPrice * this.weight*disc);
	}*/
	
	public double getVitC() {   //overloading method with no parameter  calculate the amount of vitamin c
		return this.vitC * this.weight;
	}
	
	public double getVitC(double nvc) {   //overloading method with 1 parameter   calculate the amount of vitamin c
		return nvc * this.weight;
	}
	 
	public String taste() {  //overriding method
		return "\nThe taste of mango\t\t: " + this.taste;
	}
	
	 public String toString() {     //overriding method
		 return "\nThis " + name + "is come from beautiful place that called as" + this.brand;
		}
} //end class of Mango
