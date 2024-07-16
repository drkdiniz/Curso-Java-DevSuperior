package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceObject {
	
	List<Object> list = new ArrayList<>();
	
	public void addValue(Object value) {
		list.add(value);
	}
	public Object first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is Empty");
		}
		return list.get(0);
	}
	public void print() {
		System.out.println(list);
		
		
	}
}
