package ore.student;
import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("sathyapriya");
	}
	public void studentId() {
		System.out.println("9750535612");
	}

	public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentId();
	}
		
		
	}
	
		
