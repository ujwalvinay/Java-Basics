import java.util.Scanner;
class Area
{	
	int l;
	int b;
	void readData(int a,int c)
	{
		l=a;
		b=c;
		calculateArea();
	}
	void calculateArea()
	{
		int area;
		area=l*b;
		System.out.println("The area is "+area);
	}
}
class Rectangle
{
	public static void main(String[] args)
	{
		int a,b;
		Area dim = new Area();
		Scanner data = new Scanner(System.in);
		System.out.printf("Enter the length : ");
		a = data.nextInt();
		System.out.printf("Enter the breadth : ");
		b = data.nextInt();
		dim.readData(a,b);
	}
}
		
