package functionalInterfaces;

interface Shape{
	void draw();
}

public class LambdaExample {
	public static void main(String args[]) {
		Shape rectangle=()->System.out.println("Rectangle");
		rectangle.draw();
	}
}
