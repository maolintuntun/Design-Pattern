package factoryMethod;

//����ֵĿͻ�
public class Client {
	public static void main(String[] args) {
		  System.out.println("this is Factory Method main");
		  IStore store = new KFC();
		  
		  store.getChips().eat();
	}
	  
	  
}
