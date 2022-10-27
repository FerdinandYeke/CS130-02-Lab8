import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> new_list = new ArrayList<Integer>();
		
		new_list.add(23);
		new_list.add(8);
		new_list.add(31);
		new_list.add(45);
		new_list.add(6);
		new_list.add(7);
		new_list.add(19);
		new_list.add(15);
		
		Iterator<Integer> Iter = new_list.iterator();
		
		while(Iter.hasNext()) 
		{
			Integer newer_list = Iter.next();
			
			if(newer_list > 10 && newer_list > 20) 
			{
				Iter.remove();
			}
		}
		System.out.println(new_list);
	}

}
