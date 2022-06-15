import java.util.*;

public class StudentTest {
	
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("홍길동", 3.39);
		students[1] = new Student("임꺽정", 4.21);
		students[2] = new Student("황진이", 2.19);

		Arrays.sort(students);
		for (Student s : students)
			System.out.println("이름= " + s.getName() + " 평점= " + s.getGpa());
	}
}

class Student implements Comparable {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Object o) {
		StudentTest other = (StudentTest) o;
		if (gpa < other.gpa) {
			return -1;
		} else if (gpa > other.gpa) {
			return 1;
		} else
			return 0;
	}
}
