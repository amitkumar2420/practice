package lambda;

public class RunnableLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable runnable = () -> {
			System.out.println("run called using lambda");
		};
		Thread threadLambda=new Thread(runnable);
		threadLambda.start();
	}
}
