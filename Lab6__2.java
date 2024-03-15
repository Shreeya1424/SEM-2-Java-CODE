import java.util.Scanner;
class Member {
String name;
int age;
long phonenumber;
String Address;
double Salary;
// Member(){
// name="abc";
// age=18;
// Address="rajkot";
// Phonenumber=1233645651;
// Salary=100000;
// }
Member(String name,int age,long phonenumber,String Address,double Salary){
    this.name=name;
    this.age=age;
    this.Address=Address;
    this.phonenumber=phonenumber;
    this.Salary=Salary;
}
void printSalary(){
    System.out.println("name="+this.name);
    System.out.println("age"+this.age);
    System.out.println("phonenumber"+this.phonenumber);
    System.out.println("Address"+this.Address);
    System.out.println("Salary"+this.Salary);
}
}
class Employee extends Member{
    String specialization;
    // Employee(){
    //     specialization="apple";
    // }
    Employee(String name,int age,long phonenumber,String Address,double Salary,String specialization){
        super(name,age,phonenumber,Address,Salary);
this.specialization=specialization;
    }
    void printDetails(){
       
        super.printSalary();
        System.out.println("specialization ="+this.specialization);
    }
}
class Manager extends Member{
    String department;
    // Manager(){
    //     department="computer";
    // }
    Manager(String name,int age,long phonenumber,String Address,double Salary,String department){
        super(name,age,phonenumber,Address,Salary);
        this.department=department;
    }
    void printDetails(){
       
        super.printSalary();
        System.out.println("department ="+this.department);
    }
}
public class Lab6__2{
    public static void main(String[]args){
        // Employee E1 = new Employee("abc",20,1236789670,"rajkot",2345600);
        Employee e2 = new Employee("Shatrunjay", 12, 989867728, "gfdjnmb", 34, "fmg");
        // Manager M1 = new Manager("sbg",34,1234567894,"gondal",24465215);
        e2.printDetails();
        // M1.printDetails();
        
       
    }
}