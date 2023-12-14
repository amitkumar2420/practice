package lambda;

interface Addable{
	int addition (int a,int b);
}

//class AddableImpl implements Addable{
//
//	@Override
//	public int addition(int a, int b) {
//		// TODO Auto-generated method stub
//		return (a+b);
//	}
//	
//}

public class parameter {
	public static void main(String[] args) {
		
		Addable add=(a,b)->(a+b);
		int res=add.addition(10, 20);
		System.out.println(res);
	}

}
