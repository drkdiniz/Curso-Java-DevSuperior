package entities;

import java.util.Objects;

public class Teacher {
	private Integer students;
	
	public Teacher(Integer students) {
		this.students = students;
;
	}

	public Integer getStudents() {
		return students;
	}

	public void setStudents(Integer students) {
		this.students = students;
	}


	@Override
	public int hashCode() {
		return Objects.hash(students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(students, other.students);
	}

	@Override
	public String toString() {
		return "Teacher [students=" + students + "]";
	}
	
	
	
	
}
