import java.util.ArrayList;
public class ArrayListPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>names = new ArrayList<String>();
		
		//adding Items
		
		names.add("John");
		
		names.add("Lacy");
		
		names.add("Harry");
		
		names.add("Ron");
		
		System.out.println(names); //Prints out list of names
		
		//get() access items from array list
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		//set() modifies a element
		
		names.set(0,"Brommer");
		System.out.println(names);
		
		//remove() removes a item 
		names.remove(1);
		System.out.println(names);
		
		//size() finds the amount of elements
		
		System.out.println(names.size());
		
		//clear() removes all the elements in the list
		
		names.clear(); 
		
		
	}

}
