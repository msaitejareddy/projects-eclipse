import java.util.*;

public class Studentmain {

	public static void main(String[] args) {
		
		System.out.println("enter no of new students\n");
		Scanner in = new Scanner(System.in);
		int noOfStudents=in.nextInt();
		
		for(int i=0;i<noOfStudents;i++)
		{
		Student stu1 = new Student();
		stu1.payment();
	}
		
	
	}

}
