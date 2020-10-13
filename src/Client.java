
// 分别测试饿汉和懒汉模式
public class Client {
	public static void main(String[] args) {
		
		System.out.println("this is singleton main");
		System.out.println("this is " + SingleTonA.getInstance());
		System.out.println("this is" + SingleTonB.getInstance());
	}
}
