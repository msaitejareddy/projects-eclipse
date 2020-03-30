import java.util.Scanner;

public class Student {
	
	private static int tutionFee=0;
	private String name;
	private int classLevel;
	private static int id=100;
	private String course;
	private String courses="";
	private int amountPaid;
	
	
	// write constructor and ask user name and class level he is studying.
	// 1=freshman 2=sophomore 3=junior 4=senior
	
	public Student()
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter student name:");
		name=in.next();
		
		System.out.println("select class level \n1=freshamn 2=sophomore 3=junior 4=senior");
		classLevel=in.nextInt();
		
		
		System.out.println("name:"+name+"\n"
				+ "ID:"+id+"\n"
				+"Courses enrolled :"+ enrollCourses());
		
		
	}
	
	

	// create student ID for each user first number should be class level
	//id=classLevel+id
	
	public String setId()
	{
		return classLevel+""+id;
	}
	
	
	public String  enrollCourses()
	{
		int noOfCourses;
		System.out.print("enter number of  courses going to  enroll now");
		Scanner in = new Scanner(System.in);
		noOfCourses=in.nextInt();
		
		for(int i=0;i<noOfCourses;i++)
		{
		System.out.println("enter course for enrollment");
		
		course= in.next();
		courses=courses+"\n"+course;
		tutionFee=tutionFee+1000;
		}
		
		return courses;
	}
	
	
	// view balance ()  user can view balance 
	
	
	public void viewBalance() {
		
		System.out.println("Tution Fee Due "+"$"+tutionFee);
	
	}
	
	//payment()		ask user enter amount that he is paying  balance-payment. 
	
	public void payment() {
		
		viewBalance();
		System.out.println("enter amount you are paying today for fees");
		Scanner in = new Scanner(System.in);
		int amountPaid=in.nextInt();
		
		tutionFee=tutionFee-amountPaid;
		viewBalance();
		
	}
	
	
}
	
	
	
