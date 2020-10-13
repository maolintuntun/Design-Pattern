
//2.懒汉模式
public class SingleTonB {
	
	  // 先设为空。懒汉好处：       1.只在需要使用时才创建对象 在没有使用之前可以节约内存，减小开销  
	                   //2. 在JVM class load时候会快一些
	
	  private static SingleTonB singleTon = null;
	   
	 
	   private SingleTonB() {
		   
	   }
	   
	   //全局的外部可访问的 必须是静态的，因为只有静态的才能直接通过类来访问
	   public static SingleTonB getInstance() {
		   //调用getInstance需要它的时候，先判断是否为空，如果为空，才初始化对象
		   if(singleTon == null) {
			   singleTon = new SingleTonB();
		   }
		   
		   return singleTon;
	   }
}
