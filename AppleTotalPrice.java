package Exercise4_6;

class AppleTotalPrice implements TotalPrice { //because we use interface
	
	public double price() {
		return 3.5;
	}
	
	public double price2() {
		return 2.5;
	}
	
	public double totalPrice(int quantity) {
		double newPrice = price(); //
		return (newPrice * quantity);
	}

}

class StrawberryTotalPrice implements TotalPrice{
	
	public double price() {
		return 2.8;
	}
	
	public double price2() {
		return 2.5;
	}
	public double totalPrice(int quantity) {
		double newP = price();  //newP is new price
		return newP * quantity; 
	}
	
	public double totalPrice(int quantity, double disc) {
		double newP= price2();  //newP is new price
		return (newP * quantity) - (newP * quantity*disc);
	}
}

class MangoTotalPrice implements TotalPrice{
	
	public double price() {
		return 0.01;
	}
	
	public double price2() {
		return 0.008;
	}
	public double totalPrice(int quantity) {
		double newP = price(); //newP is new price
		return newP * quantity;
	}
	
	public double totalPrice(int quantity, double disc) {
		double newP= price2(); //newP is new price
		return (newP * quantity) - (newP * quantity*disc);
	}
} //end class of AppleTotalPrice
