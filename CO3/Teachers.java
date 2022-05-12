import java.util.*;
class Person{
	public String Name;
	public String Gender;
	public String Address;
	public int Age;
	Person(String pname,String pgender,String paddress,int page){

		Name=pname;
		Gender=pgender;
		Address=paddress;
		Age=page;
	}
}
public class Employee extends Person{
	public int Empid;
	public String Cname;
	public String Qualification;
	public int Salary;
	Employee(String pname,String pgender,String paddress,int page,int eid,String com_name,String qual,int sal){

		super(String pname,String pgender,String paddress,int page);
		Empid=eid;
		Cname=com_name;
		Qualification=qual;
		Salary=sal;
	}
}
public class Teachers extends Employee{
	public String Subject;
	public String Department;
	public int Tid;
	Teachers(String pname,String pgender,String paddress,int page,int eid,String com_name,String qual,int sal,String sub,String dep,int tid){

		super(String pname,String pgender,String paddress,int page,int eid,String com_name,String qual,int sal);
		Subject=sub;
		Department=dep;
		Tid=tid;
	}
}

 
	
	