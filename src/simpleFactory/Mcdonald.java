package simpleFactory;

//������һ���򵥹������ṩ��һ��IFood����������ʳ��˿Ͳ�����Ҫ�������������㼦�ľ�����������
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
