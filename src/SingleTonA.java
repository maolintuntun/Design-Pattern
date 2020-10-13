
//1.饿汉式
public class SingleTonA {
	//静态私有的成员变量
	
	//因为是饿汉式的 所以直接创建对象 饿汉式的好处是系统加载类时候直接创建的，所以需要使用时直接调用
	// getInstance 方法即可，非常简单
   private static SingleTonA singleTonA = new SingleTonA();
   
   //私有的构造方法
   private SingleTonA() {
	   
   }
   
   //全局的外部可访问的 必须是静态的，因为只有静态的才能直接通过类来访问
   public static SingleTonA getInstance() {
	   return singleTonA;
   }
   
}
