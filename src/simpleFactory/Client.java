package simpleFactory;

//¹Ë¿Í
public class Client {
	public static void main(String[] args) {
		System.out.println("this is SimpleFactory");
		
		Mcdonald mcdonald  = new Mcdonald();
		
		IFood food = mcdonald.getFood("mcChickens");
		if(food != null) {
			food.eat();
		}
		
		food = mcdonald.getFood("chip");
		if(food!=null) {
			food.eat();
		}
		
		food = mcdonald.getFood("KFC");
		if(food!=null) {
			food.eat();
		}
	
		
	}
	
}
