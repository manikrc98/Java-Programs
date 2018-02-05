import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Math;
public class mathFunctions
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(isr);
        int input;
        while(true)
        {
            System.out.println("Java Application for Mathematic Functions\n");
            System.out.println("\n\n1. Generate a random number");
            System.out.println("2. Find the power of x raised to y");
            System.out.println("3. Find the absolute value of given number");
            System.out.println("4. Find the cube root of given number");
            System.out.println("5. Find the base 10 Log of given number");
            System.out.println("6. Find the greatest number between two given number");
            System.out.println("7. Find the smallest number between two given number");
            System.out.println("8. Round the number to its closest value");
            System.out.println("9. Find the Square root of given number");
            System.out.println("10. Find the Ceil of given number\n11. Exit");        
            input = Integer.parseInt(br.readLine());
            double x,y;
            switch(input)
            {
                case 1:
                    System.out.println("The random generated number is " + Math.round(Math.random()*100));
                    break;
                case 2:
                    System.out.println("Please Enter the value of X: ");
                    x = Double.parseDouble(br.readLine());
                    System.out.println("Please Enter the value of Y: ");
                    y = Double.parseDouble(br.readLine());
                    System.out.println("The value of " + x + " raised to " + y + " is " + Math.pow(x, y));
                    break;
                case 3:
                    System.out.println("Please Enter a number here: ");
                    x = Double.parseDouble(br.readLine());
                    System.out.println("The absolute value of " + x + " is " + Math.abs(x));
                    break;
                case 4:
                    System.out.println("Please Enter a number here: ");
                    x = Double.parseDouble(br.readLine());
                    System.out.println("The cube root of " + x + " is " + Math.cbrt(x));
                    break;
                case 5:
                    System.out.println("Please Enter a number here: ");
                    x = Double.parseDouble(br.readLine());
                    System.out.println("The base 10 log of " + x + " is " + Math.log(x));
                    break;
                case 6:
                    System.out.println("Please Enter the value of X: ");
                    x = Double.parseDouble(br.readLine());
                    System.out.println("Please Enter the value of Y: ");
                    y = Double.parseDouble(br.readLine());
                    System.out.println("The greater number between " + x + " and " + y + " is " + Math.max(x, y));
                    break;
                case 7:
                    System.out.println("Please Enter the value of X: ");
                    x = Double.parseDouble(br.readLine());
                    System.out.println("Please Enter the value of Y: ");
                    y = Double.parseDouble(br.readLine());
                    System.out.println("The smallest number between " + x + " and " + y + " is " + Math.min(x, y));
                    break;
                case 8:
                    System.out.println("Please Enter a number here: ");
                    x = Double.parseDouble(br.readLine());
                    System.out.println("The round of " + x + " is " + Math.round(x));
                    break;
                case 9:
                    System.out.println("Please Enter a number here: ");
                    x = Double.parseDouble(br.readLine());
                    System.out.println("The cube root of " + x + " is " + Math.sqrt(x));
                    break;
                case 10:
                    System.out.println("Please Enter a number here: ");
                    x = Double.parseDouble(br.readLine());
                    System.out.println("The Ceil of " + x + " is " + Math.ceil(x));
                    break;
                case 11:
                    System.exit(0);
                    break;
            }
    
        }
        
    }
}