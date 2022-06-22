package CollectionsFrame;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class GenericPro {
	
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(43);
		li.add(99);
		li.add(121);
		li.add(32);
		li.add(78);
		li.add(22);
		
		System.out.println(li);
		
		System.out.println(li.size());


		Iterator ele = li.iterator();
		
		while(ele.hasNext()) {
			System.out.println(ele.next());
		}
	}

}
