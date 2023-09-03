package testing;

import keywordStatic.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em1=new Employee("khalil", "lakhdhar", "test@gmail.com", 2000, "admin");
		System.out.println(Employee.id);
		System.out.println(em1.toString());
		Employee  em2=new Employee();
		System.out.println(Employee.id);
		//em2.description="aucune";


	}

}
