import java.util.Scanner;

public class StudentGradeCalculator
{
	
	public int sumofmarks(int tam,int eng,int mat,int sci,int soc)
	{
		return tam+eng+mat+sci+soc;
	}
	public double avgofmarks(int tam,int eng,int mat,int sci,int soc)
	{
		int tot = (tam+eng+mat+sci+soc);
		double percentage = ((double) tot / 500) * 100;
		return percentage;
	}
	public void grade(double percentage)
	{
		if(percentage >= 95 && percentage<=100)
		{
			System.out.println("Your grade is O");
		}
		else if(percentage >=85 && percentage < 95)
		{
			System.out.println("Your grade is A+");
		}
		else if(percentage >= 75 && percentage <85)
		{
			System.out.println("Your grade is A");
		}
		else if(percentage >= 65 && percentage<75)
		{
			System.out.println("Your grade is B+");
		}
		else if(percentage>=55 && percentage <65)
		{
			System.out.println("Your grade is B");
		}
		else if(percentage>=45 && percentage<55)
		{
			System.out.println("Your grade is C");
		}
		else if(percentage>=35 && percentage< 45)
		{
			System.out.println("Your grade is D");
		}
		else
		{
			System.out.println("Failed ! You can surely get again");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		StudentGradeCalculator sgc = new StudentGradeCalculator();
		System.out.println("Enter your tamil mark:");
		int tamil = sc.nextInt();
		System.out.println("Enter your english mark:");
		int english = sc.nextInt();
		System.out.println("Enter your maths mark:");
		int maths = sc.nextInt();
		System.out.println("Enter your science mark:");
		int science = sc.nextInt();
		System.out.println("Enter your social mark:");
		int social = sc.nextInt();
		
		int sum = sgc.sumofmarks(tamil,english,maths,science,social);
		System.out.println("Your total mark is :"+sum);
		double percent = sgc.avgofmarks(tamil,english,maths,science,social);
		System.out.println("Your percent of marks is :"+percent);
		sgc.grade(percent);
	}
}
		