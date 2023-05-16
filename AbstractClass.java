package intern;

abstract class birds{
	public abstract void fly();
}

class Parrot extends birds{
	public void fly()
	{
		System.out.println("Parrot flying");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Parrot p = new Parrot();
		p.fly();

	}

}
