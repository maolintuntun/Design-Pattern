
//1.����ʽ
public class SingleTonA {
	//��̬˽�еĳ�Ա����
	
	//��Ϊ�Ƕ���ʽ�� ����ֱ�Ӵ������� ����ʽ�ĺô���ϵͳ������ʱ��ֱ�Ӵ����ģ�������Ҫʹ��ʱֱ�ӵ���
	// getInstance �������ɣ��ǳ���
   private static SingleTonA singleTonA = new SingleTonA();
   
   //˽�еĹ��췽��
   private SingleTonA() {
	   
   }
   
   //ȫ�ֵ��ⲿ�ɷ��ʵ� �����Ǿ�̬�ģ���Ϊֻ�о�̬�Ĳ���ֱ��ͨ����������
   public static SingleTonA getInstance() {
	   return singleTonA;
   }
   
}
