import java.io.*;
public class stringClass
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Java Application for String Class");
        System.out.println("Please Enter a string to perform the operations on it: \n");
        String sample = br.readLine();
        System.out.println("1. Convert to UPPERCASE\n2. Convert to lowercase\n3. Trim\n4. Starts With\n5. Ends With\n6. CharAt\n7. Find Length\n8. Check if string contains it\n9. Replace\n10. Compare Strings");
        int choice = Integer.parseInt(br.readLine());
        String temp;
        int i;
        String[] str = new String[3];
        switch(choice)
        {
            case 1:
                temp =sample.intern();
                System.out.println("Original String: " +temp+"\nAfter converting into UPPERCASE: " + temp.toUpperCase());
                break;
            case 2:
                temp =sample.intern();
                System.out.println("Original String: " +temp+"\nAfter converting into lowercase: " + temp.toLowerCase());
                break;
            case 3:
                temp =sample.intern();
                System.out.println("Original String: " +temp+"\nAfter trim: " + temp.trim());
                break;
            case 4:
                // temp =sample.intern();
                System.out.println("Enter few strings that starts with 'Ma'");
                for(i=0;i<3;i++)
                {
                    str[i] = br.readLine();
                }
                System.out.println("From the entered strings: ");
                for(i=0;i<3;i++)
                {
                    if(str[i].startsWith("Ma")==true|| str[i].startsWith("ma")==true)
                    {
                        System.out.println(str[i] + " starts with 'Ma'");
                    }
                }
                break;
            case 5:
                System.out.println("Enter few strings that ends with 'ka'");
                for(i=0;i<3;i++)
                {
                    str[i] = br.readLine();
                }
                System.out.println("From the entered strings: ");
                for(i=0;i<3;i++)
                {
                    if(str[i].endsWith("ka")==true)
                    {
                        System.out.println(str[i] + " ends with 'ka'");
                    }
                }
                break;
            case 6:
                System.out.println("Please enter the location of the individual character to be displayed from: " + sample);
                int loc = Integer.parseInt(br.readLine());
                System.out.println(sample.charAt(loc));
                break;
            case 7:
                System.out.println("The length of "+sample+" string is " + sample.length());
                break;
            case 8:
                System.out.println("Enter your paragraph here:");
                String cString = br.readLine();
                System.out.println("Enter your string here");
                String checkString = br.readLine();
                if(cString.contains(checkString))
                {
                    System.out.println("Yes, The above paragraph contains "+checkString);
                } 
                else
                {
                    System.out.println("No, the above paragraph does not contains "+checkString);
                }
                break;
            case 9:
                System.out.println("Enter a paragraph here to replace its particular word with other string ");
                String par = br.readLine();
                System.out.println("Enter the target word to be replaced from the above paragraph ");
                String strplc = br.readLine();
                System.out.println("Enter the replacement string to replace "+strplc+" from the above paragraph ");
                String rplc = br.readLine();
                System.out.println("The string has been updated");
                System.out.println(par.replace(strplc,rplc));
                break;
            case 10:
                System.out.println("Enter the first string here: ");
                String str1 = br.readLine();
                System.out.println("Enter the second string here: ");
                String str2 = br.readLine();
                if(str1.compareTo(str2) == 0 )
                {
                    System.out.println("Both "+str1+" and "+str2+" are same");
                }
                else
                {
                    System.out.println("No " +str1+ " and "+ str2+" are not same");
                }
                break;
        }
    }
}