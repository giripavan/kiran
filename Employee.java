class Employee{
	int Employee_no;
	String Employee_name;
	double Salary;
	public void get_Employee_details(){
		System.out.println("Employee details methods");
	}  
	Employee (int a,String b,double c){
		this.Employee_no=a;
		this.Employee_name=b;
		this.Salary=c;
	}
	public static void main(String []args){
	  Employee e= new Employee(101,"kiran",45000);
       e.get_Employee_details();
	}
}	