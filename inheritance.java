public class inheritance{
public static void main(String[] args)
{

Employee e = new Employee();

e.setEmployeeInfo("wrath","CEO");
e.displayEmployeeInfo();

}
}

class Person{

String name;
int age;

void setPersonInfo(String n,int a)
{
this.name=n;
this.age=a;

}
void displayPersonInfo()
{
System.out.println("Name ="+name);
System.out.println("Age ="+age);
}
}



class Employee extends Person{
String EmpId;
String designation;

public void setEmployeeInfo(String i,String d)
{
setPersonInfo("Sawant Tejaswini",18);

this.EmpId=i;
this.designation=d;
}
void displayEmployeeInfo()
{
displayPersonInfo();
System.out.println("Employee ID ="+EmpId);
System.out.println("Designation ="+designation);
}
}
