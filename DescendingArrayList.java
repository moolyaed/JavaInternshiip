package intern;
import java.util.ArrayList;
import java.util.Collections;

public class DescendingArrayList {

	public static void main(String[] args) {
		      ArrayList<String> list = new ArrayList<String>();
		      list.add("Bangalore");
		      list.add("Hyderabad");
		      list.add("Chennai");
		      list.add("Dehli");
		      Collections.sort(list);
		      System.out.println(list);
		      Collections.reverse(list);
		      System.out.println(list);
	}

}
