package Exercise4_6;

public class Main {

public static void main(String[] args) {
		
		/*System.out.println("Name of Fruits");
		System.out.println("---------------");
		Fruit fFruit = new Fruit("Fruits");*/

		Apple a = new Apple("Apple", 55, 2.0, "Turkey");
		System.out.println(a.toString());
		System.out.println(a.taste());
		
		RedApple RA = new RedApple("Red Apple", 45, 1.0, "China", "Red");
		System.out.println(RA.toString());
		System.out.println(RA.taste());
		
		GreenApple GA = new GreenApple("Green Apple", 25, 4.0, "Brazil", "Green");
		System.out.println(GA.toString());
		System.out.println(GA.taste());
		
		System.out.println("Name of Strawberr");
		System.out.println("---------------");
		Strawberry S = new Strawberry("Strawberry",217, 5000, "Green", 0.054,"Switzerland");
		System.out.println(S.taste());
		System.out.println(S.toString());
		
		System.out.println();

		System.out.println("Name of Mango");
		System.out.println("---------------");
		Mango M = new Mango("Mango", 600, "Sour", 60.12, "Indian", 2.0, 412);
		System.out.println(M.taste());
		System.out.println(M.toString());
	}
} //end class of Main
