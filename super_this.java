import java.io.*;
import java.util.concurrent.PriorityBlockingQueue;
class university
{
    String universityName;
    int totalStudents;
    String Location; 
    university()
    {
        universityName="Christ University";
        totalStudents = 0;
        Location = "Bengaluru";
    }
    university(String universityName)
    {
        this.universityName = universityName;  //using this keyword to initialize data members  
    }
    university(String universityName,int totalStudents)
    {
        this(universityName);   // using this keyword in constructor chaining
        this.totalStudents = totalStudents;
    }
    public void readData() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(isr);
        System.out.println("Please enter the university name: ");
        universityName = br.readLine();
        System.out.println("Please enter the Strength of Students in "+universityName+ ":  ");
        totalStudents = Integer.parseInt(br.readLine());
        System.out.println("Please enter the location of " + universityName);
        Location = br.readLine();
    }
    public void dispData() throws IOException
    {
        System.out.println("Universtiy Name: " + universityName);
        System.out.println("University Location: " + Location);
        System.out.println("Total Number of students: " + totalStudents);
    }
}
class department extends university 
{
    String departmentName;
    String HOD;
    int noOfClasses;
    department()
    {
        super();    //use of super keyword to call parent class constructor
        noOfClasses = 0;
        departmentName="";
    }  
    department(String universityName,int totalStudents,int noOfClasses,String departmentName)
    {
        super(universityName,totalStudents);  //use of super keyword to pass parameters to parent class constructor
        this.departmentName = departmentName;
        this.noOfClasses = noOfClasses;
        universityName="Christ University";
        this.HOD = "JP SIR";
        totalStudents = 0;
        Location = "Bengaluru";
    }
    public void readData() throws IOException
    {
        super.readData();   //use of super keyword to call parent class method
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the Department Name");
        departmentName = br.readLine();
        System.out.println("Enter the name of HOD");
        HOD = br.readLine();
        System.out.println("Enter the total number of classes in " + departmentName);
        noOfClasses = Integer.parseInt(br.readLine());
    }
    public void dispData() throws IOException
    {
        super.dispData(); //use of super keyword to call parent class method
        System.out.println("Name of Department: " + departmentName);
        System.out.println("Name of HOD: " + HOD);
        System.out.println("Total number of classes in " + departmentName +":"+noOfClasses);
    }
}
public class super_this
{
    public static void main(String args[]) throws IOException
    {
        int ch = 0;
        System.out.println("This Java Program Shows the implementation of Super & this\n Please Enter your choice to proceed:\n");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(ch!=3)
        {
            System.out.println("\n\n1.Read and Display Data(Using Constructors)\n2.Read and Display Data(Using IO Functions)\n3. Exit");
            ch = Integer.parseInt(br.readLine());
            department obj2 = new department();
            switch(ch)
            {
                case 1:
                    department obj1 = new department("Christ University",10000,172,"Computer Science");
                    obj1.dispData();
                    break;
                case 2:
                    obj2.readData();
                    obj2.dispData();
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }
        
    }
} 