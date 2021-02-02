/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author r2kar
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             //create array of employee object  
    Employee[] obj = new Employee[2] ;
 
     //create & initialize actual employee objects using constructor
     obj[0] = new Employee(100,"KLL");
     obj[1] = new Employee(200,"TYU");
 
     //display the employee object data
     System.out.println("Employee Object 1:");
     obj[0].showData();
     System.out.println("Employee Object 2:");
     obj[1].showData();
  }
}
//Employee class with empId and name as attributes
class Employee{
  int empId;
  String name;
  //Employee class constructor
  Employee(int eid, String n){
     empId = eid;
     name = n;
  }
public void showData(){
   System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
   System.out.println();
 }
}
    
    

