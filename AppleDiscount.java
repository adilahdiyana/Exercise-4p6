package Exercise4_6;

class AppleDiscount implements Discount { //because we use interface
	
	public float rateOfDiscount() {
		return 10.9f;
	}
	
}

class StrawberryDiscount implements Discount{
	
	public float rateOfDiscount() {
		return 0.3f;
	}
}

class MangoDiscount implements Discount{
	
	public float rateOfDiscount() {
		return 0.25f;
	}
} //end class of AppleDiscount

