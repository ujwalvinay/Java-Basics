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
		if(Mark>40)
			grade='F';
		else if(Mark>=50)
			grade='e';
		else if(Mark>=60)
			grade='d';
		else if(Mark>=70)
			grade='c';
		else if(Mark>=80)
			grade='B';
		else if(Mark>=90)
			grade='A';
		else
			System.out.println("Wrong input");
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
class Student_array
{
	public static void main(String args[])
	{	StudentData[] Std = new StudentData[10];
		Scanner data= new Scanner(System.in);
		String a;
		int b,c,d,n;
		System.out.println("Enter the number of students : ");
		n=data.nextInt();
		for (int i=0;i<n;i++)
		{	Std[i]= new StudentData();
			System.out.printf("Enter your name : ");
			a = data.next();
			System.out.printf("Enter rollno : ");
			b=data.nextInt();
			System.out.printf("Enter your Regno. : ");
			c=data.nextInt();
			System.out.printf("Enter your mark : ");
			d=data.nextInt();
			Std[i].readData(a,b,c,d);
		}
		for (int i=0;i<n;i++)
		{
			Std[i].display();
		}
	}
}
		
		
