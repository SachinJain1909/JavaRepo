package This_Keyword;

public class This_Keyword_1 {
	static int age;
	int salary;//global variable
	int empId;
	void display(int salary) //int salary=45000;
	{
		System.out.println("Salary"+salary);//45000
		System.out.println("Salary"+this.salary);//0
		this.salary=35000;
		System.out.println("Salary"+this.salary);//0
	}
	
	public static void main(String[] args) {
		int age=25;
		System.out.println("age: "+age);
		System.out.println("global age:"+This_Keyword_1.age);
		int salary=25000;//local variable
		int empId=250;
		System.out.println("local Salary: "+salary);//
		System.out.println("Local EmpId: "+empId);
		This_Keyword_1 t1=new This_Keyword_1();
		System.out.println("t1: Global EmpID: "+t1.empId);
		System.out.println("t1: Global Salary: "+t1.salary);
		t1.display(45000);
		System.out.println("t1: Global Salary: "+t1.salary);
		This_Keyword_1 t2=new This_Keyword_1();
		System.out.println("t2: Global EmpID: "+t2.empId);
		System.out.println("t2: Global Salary: "+t2.salary);//
		t2.display(45000);	
	}
}
/**
 * this keyword is an instance of current class
 * this keyword is used to differentiate non-static local and global variable when they have same name
 * this keyword can be used only for non-static method
*/