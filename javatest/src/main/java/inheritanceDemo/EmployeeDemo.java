package inheritanceDemo;
class Employee{
   public int id=10;
    public String name;
    public String dept;
    public int salary;
    public void deatils(int id, String name, String dept,int salary)
    {
this.id=id;
this.name=name;
this.dept=dept;
this.salary=salary;
    }
public void showData(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(dept);
    System.out.println(salary);
}

}
public class EmployeeDemo {
    public static void main(String args[])
    {
        Employee[]  e = new Employee[1];
        try {

            System.out.println(e[0].id);
            //e[0].deatils(10, "Umesh", "IT", 300000);
            //e[0].showData();

        }catch( Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
