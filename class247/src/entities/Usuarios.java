package entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Usuarios implements Comparable<Usuarios>{
	private String name;
	private LocalDateTime data;
	
	public Usuarios(String name, LocalDateTime data) {
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Usuarios o) {
		return this.name.compareTo(o.name);
	}
	
}
