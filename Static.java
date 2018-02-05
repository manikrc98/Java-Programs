import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.*;
class gym
{
    
    static String gymName; //static variable
    static int scustId; //static variable
    static int count=0; //static variable

    private String custName; 
    private int age;
    private float weight;
    private float height;
    private int custId;
    static     //static block to initialize default values to static data members
    {
        gymName  = "02 Fitness Gym";
        scustId = 171100;
    }
    gym()
    {
        scustId++;
        custId=scustId;
    }
    //Static Method to Change Value of Static Data Member
    public static void changeGym() throws IOException  
    {
        InputStreamReader isr = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the name of your new gym: ");
        gymName = br.readLine();
        System.out.println("Gym name changed to " + gymName);
    }
    public void read() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Please Enter Your Name: ");
        custName = br.readLine();
        System.out.println(custName + " Please Enter Your Age: ");
        age = Integer.parseInt(br.readLine());
        System.out.println(custName + " Please Enter Your weight(in KGs): ");
        weight = Float.parseFloat(br.readLine());
        System.out.println(custName + " Please Enter Your Height(in metres): ");
        height = Float.parseFloat(br.readLine());
        System.out.println("Your Details Have been Successfully updated " + custName + "! ");
    }
    public void bmi()
    {
        
        System.out.println("Your Weight: " + weight);
        System.out.println("Your Height: " + height);
        System.out.println("Your BMI:  " + (weight/height)/height + "m2");
    }
    public void display() throws IOException
    {
        System.out.println("Your Name: " + custName);
        System.out.println("Your Details are Displayed Below: \n");
        System.out.println("Your Gym ID(Static Member): " + custId);
        System.out.println("Your Age: " + age);
        System.out.println("Your Weight: " + weight);
        System.out.println("Your Height: " + height+"\n\n");
    }

}
public class Static{
    
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        gym obj[] = new gym[10];
        int choice,ch,i=0;
        boolean loop=true;
        while(loop)
        {
            
            System.out.println("\nWelcome to " + gym.gymName);  ////calling static member directly using class
            System.out.println("\n 1. Register New Customer\n 2. Display All Customer \n 3. Change Gym Name(Static Member)\n 4. Exit");
            choice = Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                    boolean lp =true;
                    obj[i] = new gym();
                    while(lp)
                    {
                        System.out.println("\n 1. Read Details\n 2. Display Details\n 3. Calculate BMI \n 4. Go Back To Previous Menu");
                        ch = Integer.parseInt(br.readLine());
                        switch(ch)
                        {
                            case 1:
                                obj[i].read();
                                obj[i].count++; //calling static member using instance of class(object)
                                break;
                            case 2:
                                obj[i].display();
                                break;
                            case 3:
                                obj[i].bmi();
                                break;
                            case 4:
                                lp =false;
                                break;
                        }
                    }
                    i++;
                    break;
                case 2:
                    for(i=0;i<gym.count;i++)
                    {
                        obj[i].display();
                    }
                    break;
                case 3:
                    gym.changeGym();
                    break;
                case 4:
                    loop = false;
                    break;
            }
     
        }
        
    }
}