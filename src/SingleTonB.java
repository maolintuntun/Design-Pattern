
//2.����ģʽ
public class SingleTonB {
	
	  // ����Ϊ�ա������ô���       1.ֻ����Ҫʹ��ʱ�Ŵ������� ��û��ʹ��֮ǰ���Խ�Լ�ڴ棬��С����  
	                   //2. ��JVM class loadʱ����һЩ
	
	  private static SingleTonB singleTon = null;
	   
	 
	   private SingleTonB() {
		   
	   }
	   
	   //ȫ�ֵ��ⲿ�ɷ��ʵ� �����Ǿ�̬�ģ���Ϊֻ�о�̬�Ĳ���ֱ��ͨ����������
	   public static SingleTonB getInstance() {
		   //����getInstance��Ҫ����ʱ�����ж��Ƿ�Ϊ�գ����Ϊ�գ��ų�ʼ������
		   if(singleTon == null) {
			   singleTon = new SingleTonB();
		   }
		   
		   return singleTon;
	   }
}
