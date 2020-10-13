package simpleFactory;

//麦当劳是一个简单工厂，提供了一个IFood方法来生成食物。顾客并不需要关心薯条和麦香鸡的具体生产过程
public class Mcdonald {
	public IFood getFood(String name) {
		switch(name) {
		case "chip":
			return new Chips();
		case "mcChickens":
			return new McChickens();
		default:
			System.out.println("we cannot produce the food!");
			return null;
		}
	}
}
