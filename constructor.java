class emp{
int emp_no;
String emp_name;
double salary;

emp(int a, String b,double c){
this.emp_no=a;
this.emp_name=b;
this.salary=c;
}
public static void main(String[] A){
    emp p=new emp(101,"Bhanu", 500.00);
    System.out.println(p.emp_name);
	System.out.println(p.emp_no);
	System.out.println(p.salary);
   }
}