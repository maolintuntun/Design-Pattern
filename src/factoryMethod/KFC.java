package factoryMethod;

public class KFC implements IStore{

	@Override
	public IChips getChips() {
		// TODO Auto-generated method stub
		System.out.println("肯德基生产了薯条啦");
		return new KFCChips();
	}

}
