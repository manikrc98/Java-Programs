import java.io.*;
import java.io.Serializable;
class employee implements Serializable{
            String employeeName;
            int empId;
            String Designation;
            String Location;
            int salary;
            String employeeDetails; 
            employee()
            {
                this.employeeName ="UNDEFINED";
                this.empId = 0;
                this.Designation = "UNDEFINED";
                this.Location = "UNDEFINED";
                this.salary = 0;
            }
            employee(String employeeName,int empId,String Designation,String Location,int salary)
            {
                this.employeeName = employeeName;
                this.empId = empId;
                this.Designation = Designation;
                this.Location = Location;
                this.salary = salary;
            }
}
class employeFileData
{
    public static void main(String[] args) throws IOException{
        int choice,mainChoice;
        String inputfileName;
        String outputfileName;
        employee obj = new employee();
        employee obj1 = new employee();
        while(true)
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("\nPlease Choose your option[MAIN MENU]: \n1. Read & Retrieve Data from file\n2. Read & Write Data from object file");
            mainChoice = Integer.parseInt(br.readLine());
            switch(mainChoice)
            {
                case 1:
                    System.out.println("Please Choose your option: \n1. Write employee details into files\n2. Read employee details from file\n3. Exit");
                    choice = Integer.parseInt(br.readLine());
                    switch(choice)
                    {
                        case 1:   //To write employee details into file
                            System.out.println("Please Enter the name of new employee: ");
                            obj.employeeName = br.readLine();
                            System.out.println("Please Enter the Employee Id: ");
                            obj.empId = Integer.parseInt(br.readLine());
                            System.out.println("Please Enter the Employee's Designation: ");
                            obj.Designation = br.readLine();
                            System.out.println("Please Enter the location of Employee: ");
                            obj.Location = br.readLine();
                            System.out.println("Please Enter the salary of Employee: ");
                            obj.salary = Integer.parseInt(br.readLine());
                            obj.employeeDetails = obj.employeeName + "\n" + obj.empId + "\n" + obj.Designation + "\n" + obj.Location + "\n" + obj.salary;
                            byte contentInBytes[] = obj.employeeDetails.getBytes();
                            System.out.println("Please Enter the name of the file to store the employee details into: ");
                            outputfileName = br.readLine();
                            FileOutputStream output = new FileOutputStream(outputfileName);
                            output.write(contentInBytes);
                            output.close();
                            break;
                        case 2: //To read employee details from file
                            int i;
                            System.out.println("Please enter the filename to read employee details from: ");
                            inputfileName = br.readLine();
                            FileInputStream input = new FileInputStream(inputfileName);
                            do{
                                i = input.read();
                                if(i!=-1)System.out.print((char)i);
                            }while(i!=-1);
                            input.close();
                            // InputStream input = new BufferedInputStream(new FileInputStream(inputfileName));
                            // byte[] buffer = new byte[256];
                            
                            // try {
                            //     for (int length = 0; (length = input.read(buffer)) != -1;) {
                            //         System.out.write(buffer, 0, length);
                            //     }
                            // } finally {
                            //     input.close();
                            // }
                            break;
                        case 3:
                            continue;
                    }
                    break;
                case 2:
                    System.out.println("Please Choose your option: \n1. Write employee details into Object\n2. Read employee details from Object\n3. Exit");
                    choice = Integer.parseInt(br.readLine());
                    switch(choice)
                    {
                        case 1: //To write employee details into object
                            System.out.println("Please Enter the details of employee to save it in object: \n");
                            System.out.println("Please Enter the name of new employee: ");
                            obj1.employeeName = br.readLine();
                            System.out.println("Please Enter the Employee Id: ");
                            obj1.empId = Integer.parseInt(br.readLine());
                            System.out.println("Please Enter the Employee's Designation: ");
                            obj1.Designation = br.readLine();
                            System.out.println("Please Enter the location of Employee: ");
                            obj1.Location = br.readLine();
                            System.out.println("Please Enter the salary of Employee: ");
                            obj1.salary = Integer.parseInt(br.readLine());
                            obj1.employeeDetails = obj1.employeeName + "\n" + obj1.empId + "\n" + obj1.Designation + "\n" + obj1.Location + "\n" + obj1.salary;
                            
                            System.out.println("Please Enter the name of the object to save the employee details into: ");
                            String objectName = br.readLine();
                            
                            FileOutputStream fout = new FileOutputStream(objectName + ".ser");
                            ObjectOutputStream out = new ObjectOutputStream(fout);
                            out.writeObject(obj1);
                            out.flush();
                            out.close();
                            break;
                        case 2: //To write employee details from object
                            System.out.println("Please Enter the name of the object to save the employee details into: ");
                            String objecOtName = br.readLine();
                            try{
                                FileInputStream fin = new FileInputStream(objecOtName + ".ser");
                                ObjectInputStream in = new ObjectInputStream(fin);
                    
                                employee obj3 = (employee) in.readObject();  //retrieving object details into 3rd object

                                System.out.println("Please Select an option: \n1. Display Employee Name \n2. Display Employee ID \n3. Display Employee Designation \n4. Display Employee Location \n5. Display Employee Salary\n6. Display All\n7. Exit");
                                int detail = Integer.parseInt(br.readLine());
                                switch(detail)
                                {
                                    case 1:
                                     System.out.println(obj3.employeeName);
                                     break;
                                    case 2:
                                     System.out.println(obj3.empId);
                                     break;
                                    case 3:
                                    System.out.println(obj3.Designation);
                                    break;
                                    case 4:
                                     System.out.println(obj3.Location);
                                     break;
                                     case 5:
                                     System.out.println(obj3.salary);
                                     break;
                                     case 6:
                                     System.out.println(obj3.employeeDetails);
                                     break;
                                     case 7:
                                     continue;

                                }
                                in.close();
                                }
                                catch (ClassNotFoundException e) {
                                    e.printStackTrace();
                                }
                    }
                    
                case 3:
                    System.exit(0);
                    break;
            } 
            
        }
    }
}