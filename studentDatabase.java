import java.io.*;
import java.util.concurrent.PriorityBlockingQueue;
class university
{
    String universityName;
    private int totalStudents;
    private String Location; 
    university()
    {
        universityName="Christ University";
        totalStudents = 0;
        Location = "Bengaluru";
    }
    university(String universityName)
    {
        this.universityName = universityName;
    }
    university(String universityName,int totalStudents)
    {
        this(universityName);   // constructor chaining - Calling default constructor from parameterized constructor
        this.totalStudents = totalStudents;
    }
    public void readUniversityData() throws IOException
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
    public void displayUniversityData() throws IOException
    {
        System.out.println("Universtiy Name: " + universityName);
        System.out.println("University Location: " + Location);
        System.out.println("Total Number of students: " + totalStudents);
    }
}
class department extends university //single inheritence
{
    String departmentName;
    String HOD;
    int noOfClasses;
    department()
    {
        super();    //invokes constructor of base class
        noOfClasses = 0;
        departmentName="";
    }  
    department(String universityName,int totalStudents,int noOfClasses,String departmentName)
    {
        super(universityName,totalStudents);  //passes parameter to base class
        this.departmentName = departmentName;
        this.noOfClasses = noOfClasses;
    }
    public void readDepartmentData() throws IOException
    {
        readUniversityData();
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the Department Name");
        departmentName = br.readLine();
        System.out.println("Enter the name of HOD");
        HOD = br.readLine();
        System.out.println("Enter the total number of classes in " + departmentName);
        noOfClasses = Integer.parseInt(br.readLine());
    }
    public void dispDepartmentData() throws IOException
    {
        displayUniversityData();
        System.out.println("Name of Department: " + departmentName);
        System.out.println("Name of HOD: " + HOD);
        System.out.println("Total number of classes in " + departmentName +":"+noOfClasses);
    }
}
//university->students
class Students extends university //1st level inheritance for multilevel inheritance
{
    String studentName;
    long studentID;
    int studentAge;
    Students()
    {
        super();  //invokes constructor of base class
        studentName= "";
        studentID = 0;
        studentAge = 18;
    } 
    Students(String studentName,Long studentID)
    {
        studentName = this.studentName;
        studentID = this.studentID;
    }
    Students(String universityName,int totalStudents,String studentName,int studentAge)
    {
        super(universityName,totalStudents); //passes parameter to base class
        studentName = this.studentName;
        studentAge = this.studentAge;
    }
    public void inputStudentData() throws IOException
    {
        readUniversityData();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the Name of the student: ");
        studentName = br.readLine();
        System.out.println("Enter the ID of " + studentName + ": ");
        studentID = Integer.parseInt(br.readLine());
        System.out.println("Enter the Age of " + studentName + ": ");
        studentAge = Integer.parseInt(br.readLine());
    }
    public void displayStudentData() throws IOException
    {
        displayUniversityData();
        System.out.println("Name of the student: " + studentName);
        System.out.println("ID of " + studentName + ": " + studentID);
        System.out.println("Age of " + studentName + ": " + studentAge);
    }
}
//university->students->marks
class Marks extends Students //2nd level inheritance for multilevel inheritance
{
    Integer mark1,mark2,mark3;
    long total;
    long average;
    Marks()
    {
        super();
        mark1 = 50;
        mark2 = 50;
        mark3 = 50;
    }
    Marks(Integer mark1,Integer mark2,Integer mark3)
    {
        mark1 = this.mark1;
        mark2 = this.mark2;
        mark3 = this.mark3;
    }
    Marks(String studentName, Long studentID,Integer mark1,Integer mark2,Integer mark3)
    {
        super(studentName,studentID);
        mark1 = this.mark1;
        mark2 = this.mark2;
        mark3 = this.mark3;
    }
    public void inputMarksData() throws IOException
    {
        inputStudentData();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter Mark1 of"+ studentName);
        mark1 = Integer.parseInt(br.readLine());
        System.out.println("Enter Mark2 of"+ studentName);
        mark2 = Integer.parseInt(br.readLine());
        System.out.println("Enter Mark3 of"+ studentName);
        mark3 = Integer.parseInt(br.readLine());
    }
    public void displayMarksData() throws IOException
    {
        displayStudentData();
        System.out.println("Mark 1 : " + mark1);
        System.out.println("Mark 2 : " + mark2);
        System.out.println("Mark 3 : " + mark3);
        total = mark1+mark2+mark3;
        average = (total/3);
        System.out.println("Total marks : " + total);
        System.out.println("Average marks : " + average);
    }
}
public class studentDatabase
{
    public static void main(String args[]) throws IOException
    {
        //univerity -> department - single inhertince
        int input=0;
        int choice=0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(input!=3)
        {
            System.out.println("1.Invoke Single Inheritance Object\n2. Invoke Multilevel Inheritance");
            input = Integer.parseInt(br.readLine());
            switch(input)
            {
                case 1:
                        System.out.println("1.Object with Parameterized constructors\n2.New Object");
                        choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                            case 1:
                                department d1 = new department("Christ College",16000,279,"Computer Science");  
                                d1.dispDepartmentData();    
                                break;
                            case 2:
                                department d2 = new department();
                                d2.readDepartmentData();
                                d2.dispDepartmentData();
                                break;
                            case 3:
                                System.exit(0);
                                break;
                        }
                        
                    break;
                case 2:
                    //university->students->marks - multiLevel inheritence                
                    Marks m1 = new Marks();
                    m1.inputMarksData();
                    m1.displayMarksData();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
        
    }
}