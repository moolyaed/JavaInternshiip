package intern;

class superC{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void add(double a,double b)
	{
		System.out.println(a+b);
	}
}
	
class child extends SuperClass{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

public class OverloadindOverriding {
	public static void main(String[] args) {
		child c = new child();
		superC s = new superC();
		s.add(4.7, 87.8);
		c.add(6, 8);

	}

}