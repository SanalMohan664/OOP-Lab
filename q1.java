import java.util.Scanner;

class q1 {
	public static void main(String[] args)
	 { 
	String name;
	int rollno,mark;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	name=sc.nextLine();
	System.out.println("Enter your rollno:");
	rollno = sc.nextInt();
	System.out.println("Enter your Mark:");
	mark = sc.nextInt();




	System.out.println("The Name is:" +name);
	System.out.println("The Rollno is:" +rollno);
	System.out.println("The Mark is:" +mark);
}
}