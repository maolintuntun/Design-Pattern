package simpleFactory;

public class Mcdonald {
	public IFood getFood(String name) {
		switch(name) {
		case "chip":
			return new Chips();
		case "McChickens":
			return new McChickens();
		default:
			System.out.println("we cannot produce the food!");
			return null;
		}
	}
}
