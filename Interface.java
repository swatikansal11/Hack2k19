import java.util.Scanner; 

public class Student{

	Scanner sc = new Scanner(System.in); 
	
	int marks1 = sc.nextInt;
	int marks2 = sc.nextInt;
	int marks3 = sc.nextInt;
}

public class Result extends Student{
	int Result = marks1 + marks2 + marks3;
	int GPA = Result/3;
}

public static int main(String[] args) {

	Student s = new Result();

	System.out.println(Result);
	System.out.println(GPA);
}