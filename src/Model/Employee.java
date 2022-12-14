
package Model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
private String dept;
private int salary;
private List<Employee> subordinates;

// constructor
    public Employee(String name,String dept, int sal) {
    this.name = name;
    this.dept = dept;
    this.salary = sal;
    subordinates = new ArrayList<Employee>();

    }
    public void add(Employee e) {

    subordinates.add(e);
    }
    
    public void remove(Employee  e) {

    subordinates.remove(e);
    }
    
    public List<Employee> getSubordinates(){

        return subordinates;
        }

    public String toString(){
    return ("Employee :[ Name : "+ name + ", dept : " +dept+ ",salary :"+ salary+ " ]");

    }

 
}
 
    
