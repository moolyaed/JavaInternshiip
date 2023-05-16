package intern;

interface Operation{  
	void add();  
	}  
	
class Addition implements Operation{  
	public void add()
	{
		System.out.println("Addition operation");
	}  
}  
public class Interface {

	public static void main(String[] args) {
			Addition a = new Addition();  
			a.add();  
	 }  
}  
