package factoryMethod;

public class Mcdonald implements IStore{

	@Override
	public IChips getChips() {
		// TODO Auto-generated method stub
		System.out.println("����������������");
		return new MCchips();
	}
 
}
