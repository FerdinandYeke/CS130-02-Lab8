import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListofColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> Colors = new ArrayList<String>();
		
		Colors.add("Red");
		Colors.add("Orange");
		Colors.add("Yellow");
		Colors.add("Green");
		Colors.add("Blue");
		Colors.add("Purple");
		
		System.out.println(Colors);
		System.out.println("Does the List contain red: "+Colors.contains("Red"));
	}

}
