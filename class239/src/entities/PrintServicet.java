package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintServicet<T> {
	
	List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is Empty");
		}
		return list.get(0);
	}
	public void print() {
		System.out.println(list);
		
		
	}
}
