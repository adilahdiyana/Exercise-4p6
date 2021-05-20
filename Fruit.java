package Exercise4_6;

public abstract class Fruit {
	
	//define super class because we don't need to create instance (object) of fruits
	//class which declare as abstract cannot create instance object
	
	protected String name;
	
	public Fruit(String name) { //constructor with 1 argument
		this.name = name;
		//System.out.printl("Fruit constructor is invoked.");
	}
	
	//declare method that gas no implementation
	//only subclass know to implement the metod
	/*public abstract double totalPrice();
	 public abstract double totalPrice(double newPrice);
	 public abstract double totalPrice(double newPrice, double disc);*/
	public abstract String toString();
	public abstract String taste();

} //end class of Fruit
