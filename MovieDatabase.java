import java.io.*;
import java.util.Scanner;
class Movie
{
    private String movieName;
    private Integer rating;
    private Integer release;
    private String genre;
    private long movieBudget;
    private float runtime;
    
    public static Integer count=0;
    public static Integer rank[] = new Integer[10];    //global varibales
    public Movie()             //Default Constructor̥
    {
        movieName ="UNASSIGNED";
        rating = 0;
        runtime = 90;
        release = 2017;
    }
    public Movie(String Name,Integer ratings, long Budget)  //Parameterized Constructor
    {
        movieName = Name;
        rating = ratings;
        movieBudget = Budget;
    }
    public Movie(Integer rel, String gen)    //Parameterized Constructor
    {
        release = rel;
        genre = gen;
    }

    public void recheck(Integer i) throws IOException
    {
        if(rank[count] == rank[i])
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            Integer rankNew;
            System.out.println("Give a unique Rank It is same as movie " + i);
            rankNew = Integer.parseInt(br.readLine());
            recheck(i);
        }
    }
    public void read() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Welcome to Intelligent Movie Database\n You are Requested to Contribute in order to use database\n");
        System.out.println("Enter The Movie Name\n");
        movieName = br.readLine();
        System.out.println("Enter Your Rating for " + movieName);
        rating = Integer.parseInt(br.readLine());
        System.out.println("Enter " +movieName + "'s "+ "Release Year ");
        release = Integer.parseInt(br.readLine());
        System.out.println("Enter the genre for " + movieName);
        genre = br.readLine();
        System.out.println("Do You know the budget for " + movieName + " ?(0/1)");
        Integer input;
        input = Integer.parseInt(br.readLine());
            if(input == 1)
            {
                System.out.println("That's Great, Please Enter the budget for " + movieName);
                movieBudget = Integer.parseInt(br.readLine());
            }
            else if(input == 0)
            {
                System.out.println("Not an issue, Let's Proceed ahead!");
                movieBudget = 0;
            }
         if(count>1)
            {
                
                System.out.println("Give a rank to "+movieName +" unique from previous entered movies");
                rank[count] = Integer.parseInt(br.readLine()); 
                for(int i=0;i<10;i++) // To check uniqueness of rank
                {
                    if(i!=count)
                    {
                        recheck(i);
                    }
                    
                }    
            } 
         else if(count<1)
                {
                    System.out.println("Please Give a rank(under 10) to " + movieName);
                    rank[count] = Integer.parseInt(br.readLine());
                }
         System.out.println("Please Enter " + movieName +"'s runtime(in mins)" );
         runtime = Float.valueOf(br.readLine()).floatValue();       

    }
    public void display()
    {
        String budget = "UNAVAILABLE";
        System.out.println("Movie Name : " + movieName);
        System.out.println("Your Rating: " + rating);
        System.out.println("Release Year: " + release);
        System.out.println("Movie Genre: " +genre);
        if(movieBudget == 0)
        {
            System.out.println("Budget: " +budget);    
        }
        else
        {
            System.out.println("Budget: " +movieBudget);    
        }
        System.out.println("Movie Rank: " + rank[count]);
        System.out.println("Movie Runtime: " + runtime);
    }
    public int search(String Name)    //function overloading
    {
        if(movieName == Name)
        {
            return 1;
        }
        else
        {
            return 0;
        } 
    } 
    public int search( int year)    //function overloading
    {
        if(release==year)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    } 
    public int search(float time)   //function overloading
    {
        if(time==runtime)
            return 1;
        else
            return 0;
    }

}
public class MovieDatabase
{
        public static void main(String args[]) throws IOException
        {
            Movie obj[] = new Movie[7];
            for(int i=0;i<5;i++)
            {
                obj[i] = new Movie();
            }
            obj[5] = new Movie("Joker",7,456000);    //Parameterized Constructor
            obj[6] = new Movie(2017,"Sci-Fi");      //Parameterized Constructor
            Integer input=0;
            Integer choice=0;
            System.out.println("This is a Intelligent Movie Database where you can enter movie details and Display Details based on your filters");
            while(input!=4){
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);                        
                System.out.println("\nPlease Select Any option:\n\n 1. Enter Movie Details \n 2. Display Movie Details \n 3. Search Movie by attribute\n 4.Exit");
                input = Integer.parseInt(br.readLine());
                switch(input)
                {
                    case 1:
                        System.out.println("Select Any One: ");
                        for(Integer i=0;i<7;i++)
                        {
                            System.out.println("Movie "+ (i+1));
                        }
                        choice = Integer.parseInt(br.readLine());
                        obj[choice-1].read();
                        
                        break;
                    case 2:
                        System.out.println("Select Any One: ");
                        for(Integer i=0;i<7;i++)
                        {
                            System.out.println("Movie "+ (i+1));
                        }
                        choice = Integer.parseInt(br.readLine());
                        obj[choice-1].display();
                        break;
                    case 3:
                        System.out.println("1. Search \n2. Search by Year\n3.Search by runtime");
                        choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                            case 1:
                            System.out.println("Enter Movie Name");
                            String Name;
                            Name = br.readLine();
                            int result=0;
                            int i=0;
                            // for(i=0;i<5;i++)̥
                            // {̥
                            //     result = obj[i].search(Name);
                            //     if(result==0)
                            //     {

                            //     }
                            //     if(res̥ult==1)
                            //     {
                            //         break̥;
                            //     }
                            // }
                            while(result==1)
                            {
                                if(i<7)
                                {
                                    result = obj[i].search(Name);
                                    i++;
                                }
                                else if(i==7)
                                {
                                    break;
                                }
                            }
                                System.out.println("Your Movie Has been Found ");
                                obj[i].display();
                                break;
                            case 2:
                            System.out.println("Enter Movie Release Year");
                            Integer yYear;
                            yYear = Integer.parseInt(br.readLine());
                            result =0;
                            i =0;
                            while(result==1)
                            {
                                if(i<7)
                                {
                                    result = obj[i].search(yYear);
                                    i++;
                                }
                                else if(i==7)
                                {
                                    break;
                                }
                            }
                                System.out.println("Your Movie Has been Found ");
                                obj[i].display();
                                break;
                            case 3:
                            System.out.println("Enter Movie Release Year");
                            Float rtime;
                            rtime = Float.valueOf(br.readLine()).floatValue();  
                            result = 0;
                            i =0;
                            while(result==1)
                            {
                                if(i<7)
                                {
                                    result = obj[i].search(rtime);
                                    i++;
                                }
                                else if(i==7)
                                {
                                    break;
                                }
                            }
                                System.out.println("Your Movie Has been Found ");
                                obj[i].display();
                                break;    


                        }
                        break;
                    case 4:
                        System.exit(0);
                        break;
                }
            }
        
        }
}