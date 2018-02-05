import employee.experience;  //importing interface packages
import java.io.*;

import com.sun.javafx.applet.ExperimentalExtensions;
interface personalDetails  //creating 1st interface having multiple methods
{
    void setName(String Name);
    void setAge(int Age);

}
interface professionalDetails //creating 2nd interface having single method
{
    void setEmpID(int EmpID);
}
interface employeeDetails extends personalDetails,professionalDetails  //Extending personalDetails and professionalDetails 
                                                                       // interface to employeeDetails
{
    void changeSalary(long salary);
    void changeDesignation(String Designation);
    void setDepartment(String Department);
}
class employee implements employeeDetails  //implementing the employeeDetails Interface
{
    //Data members
    String Name;
    int Age;
    long salary;
    int EmpID;
    String Designation;
    String Department;
    int experience;
    
    //Default Constructor
    employee()
    {
        Name = "UNDEFINED";
        Age = 0;
        salary = 30000;
        EmpID = 0;
        Designation = "Null";
        Department = "Unassigned";
        experience = 0;
    }

    //methods from personalDetails interface
     public void setName(String Name)
    {
        this.Name = Name;
    }
    public void setAge(int Age)
    {
        this.Age = Age;
    }

    //method from professionalDetails Interface
    public void setEmpID(int EmpID)
    {
        this.EmpID = EmpID;
    }
    
    //methods from employeeDetails interface
    public void changeSalary(long salary)
    {
        this.salary = salary;
    }
    public void changeDesignation(String Designation)
    {
        this.Designation =Designation;
    }
    public void setDepartment(String Department)
    {
        this.Department = Department;
    }

    //methods from imported interface experience
    public void setExperience(int Experience)
    {
        this.experience = Experience;
    }
    //method of employeeClass
    void read() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter Name: ");
        Name = br.readLine();
        System.out.println("Enter Age: ");
        Age = Integer.parseInt(br.readLine());
        System.out.println("Enter Salary: ");
        salary = Long.parseLong(br.readLine());
        System.out.println("Enter EmpID: ");
        EmpID = Integer.parseInt(br.readLine());
        System.out.println("Enter Designation: ");
        Designation = br.readLine();
        System.out.println("Enter Department: ");
        Department = br.readLine();
        System.out.println("Enter Experience: ");
        experience = Integer.parseInt(br.readLine());

    }
    void display() throws IOException
    {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Salary: " + salary);
        System.out.println("EmpID: " + EmpID);
        System.out.println("Designation: " +  Designation);
        System.out.println("Department: " + Department);
        System.out.println("Experience: " + experience);

    }
}
class employeeDatabase
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int choice,change;
        String changeString;
        int changeInt;
        long changeLong;
        boolean exit = true;
        employee obj = new employee();
        while(exit)
        {
            System.out.println("\nEmployee Database\n");
            System.out.println("1. Set Details\n2. Change Details\n3. Display Details\n4. Exit");
            choice = Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                    obj.read();
                    break;
                case 2:
                    System.out.println("1.Change Name\n2. Change Age\n3. Change Salary\n4. Change EmpID\n5. Change Designation\n6. Change Department\n7. Change Experience  ");
                    change = Integer.parseInt(br.readLine());
                    switch(change)
                    {
                        case 1:
                            System.out.println("Enter the New Name: ");
                            changeString = br.readLine();
                            System.out.println("The Name is updated from " + obj.Name +" to " + changeString);   
                            obj.setName(changeString);
                            break;
                        case 2:
                            System.out.println("Enter the New Age: ");
                            changeInt = Integer.parseInt(br.readLine());
                            System.out.println("The Age is updated from " + obj.Age +" to " + changeInt);   
                            obj.setAge(changeInt);
                            break;
                        case 3:
                            System.out.println("Enter the New Salary ");
                            changeLong = Long.parseLong(br.readLine());
                            System.out.println("The Salary is updated from " + obj.salary +" to " + changeLong);   
                            obj.changeSalary(changeLong);
                            break;
                        case 4:
                            System.out.println("Enter the New EmpID ");
                            changeInt = Integer.parseInt(br.readLine());
                            System.out.println("The EmpID is updated from " + obj.EmpID +" to " + changeInt);   
                            obj.setEmpID(changeInt);
                            break;
                        case 5:
                            System.out.println("Enter the New Designation: ");
                            changeString = br.readLine();
                            System.out.println("The Designation is updated from " + obj.Designation +" to " + changeString);   
                            obj.changeDesignation(changeString);
                            break;
                        case 6:
                            System.out.println("Enter the New Department: ");
                            changeString = br.readLine();
                            System.out.println("The Department is updated from " + obj.Department +" to " + changeString);   
                            obj.setDepartment(changeString);
                            break;
                        case 7:
                            System.out.println("Enter the New Experience ");
                            changeInt = Integer.parseInt(br.readLine());
                            System.out.println("The Experience is updated from " + obj.experience +" to " + changeInt);   
                            obj.setExperience(changeInt);
                            break;        
                        case 8:
                            System.exit(0);
                            break; 
                    }
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    exit=false;
                    break;
                }
        }
    }
}
