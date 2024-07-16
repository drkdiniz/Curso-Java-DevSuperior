package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceString {
	
	List<String> list = new ArrayList<>();
	
	public void addValue(String value) {
		list.add(value);
	}
	public String first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is Empty");
		}
		return list.get(0);
	}
	public void print() {
		System.out.println(list);
		
		
	}
}
