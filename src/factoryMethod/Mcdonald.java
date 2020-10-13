package factoryMethod;

public class Mcdonald implements IStore{

	@Override
	public IChips getChips() {
		// TODO Auto-generated method stub
		System.out.println("麦当劳生产了薯条啦");
		return new MCchips();
	}
 
}
