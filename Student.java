import java.util.Scanner;
class StudentData
{
	String name;
	int rollno;
	int regno;
	int Mark;
	char grade;
	void readData(String a,int b, int c,int d)
	{
		name=a;
		rollno=b;
		regno= c;
		Mark = d;
		computeGrade();
	}
	void computeGrade()
	{
		if(Mark<=30)
			grade='F';
		else if(Mark<=40)
			grade='e';
		else if(Mark<=50)
			grade='d';
		else if(Mark<=60)
			grade='c';
		else if(Mark<=70)
			grade='B';
		else if(Mark<=80)
			grade='A';
		else
			System.out.println("Wrong input");
		display();
	}
	void display()
	{
		System.out.println("------------------");
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
		System.out.println("Regno. : "+regno);
		System.out.println("Grade : "+grade);
	}
}
class Student
{
	public static void main(String args[])
	{	StudentData S1 = new StudentData();
		Scanner data= new Scanner(System.in);
		String a;
		int b,c,d;
		System.out.println("Enter your name : ");
		a = data.next();
		System.out.println("Enter rollno : ");
		b=data.nextInt();
		System.out.println("Enter your Regno. : ");
		c=data.nextInt();
		System.out.println("Enter your mark : ");
		d=data.nextInt();
		S1.readData(a,b,c,d);
	}
}
		
		
