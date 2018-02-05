import java.io.*;
import java.nio.InvalidMarkException;
// Custom Made Exception
class invalidMarksException extends Exception
{
    invalidMarksException(String s)
    {
        super(s);
    }
}
class exceptionTest  //Main Class
{
    //method for custom exception
    static void validate(int marks) throws invalidMarksException
    {
    if(marks>0 && marks<100)
        System.out.print("You are graduated");        
    else   
        throw new invalidMarksException("not valid");    
    
    }
    //usage of throws keyword 
    public static void main(String args[]) throws IOException 
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Testing different Exceptions: \n1. Div by Zero\n2. Array out of bound\n3. NullPointerException\n4. Negative ArraySize Exception\n5. NumberFormat Exception\n6. StringIndexOutOfBoundsException\n7. Custom Exception");
        int choice = Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:
                // Division by zero
                try{
                    int num = 5/0;
                    System.out.println(num);
                }catch(ArithmeticException e)
                {
                    System.out.println(e);
                }
                System.out.println("Out of the try-catch");    
                break;
            case 2:
                //Array out of Bound
                try
                {
                    int arr[] = {4,3,19};
                    System.out.println(arr[3]);

                }catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Array is out of bounds" + e);
                }finally{
                    System.out.println("This is inside finally block and was supposed to be printed anyways!");
                }
                break;
            case 3:
                //Null pointer exception
                try
                {
                    String str =null;
                    System.out.println(str.toString());
                }catch(NullPointerException e)
                {
                    System.out.println("The value reffered is found to be Null " + e);
                }break;
            case 4:
                //Negative ArraySize Exception
                int arrSize = -8;    //Negative Value here...
                try {
                    int[] myArray = new int[arrSize];
                }catch (NegativeArraySizeException ex) {
                    System.out.println("Can't create array of negative size");
                }
                break;
            case 5:
            // NumberFormat Exception
                try{
                    int n = Integer.parseInt("This is not a number");
                    System.out.println(n);
                }catch(NumberFormatException e)
                {
                    System.out.println("Number format exception occurred");
                }    
                break;
            case 6:
            // StringIndexOutOfBounds Exception
                try{
                    String str="something in the string";
                    char c = str.charAt(2);
                    c = str.charAt(90);
                    System.out.println(c); 
                }catch(StringIndexOutOfBoundsException e)
                {
                    System.out.println("StringIndexOutOfBoundsException!!");
                }
                break;
            case 7:
                // Custom Made Exception
                try{
                    validate(11);
                }catch(Exception m){
                    System.out.println("Exception occured: "+m);
                }
                break;
        }
        
    }
}   