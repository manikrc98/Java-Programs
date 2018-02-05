// DEFINE THE THREAD CLASS AND USE IT IN JAVA 
// Use of THREAD PRIORITY
import java.io.*;
class firstThread extends Thread {
    public void run()
    {
        try{
            for(int i=1;i<11;i+=2)
            {
                System.out.println("Task "+i+" is running in "+ Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(InterruptedException e)
		{
			System.out.println(e);
		}
    }
}
class secondThread implements Runnable {
    public void run()
    {
        try{
            for(int i=0;i<11;i+=2)
            {
                System.out.println("Task "+i+" is running in "+ Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(InterruptedException e)
		{
			System.out.println(e);
		}
    }
}
class thirdThread implements Runnable {
    public void run()
    {
        try{
            for(int i=11;i<16;i++)
            {
                System.out.println("Task "+i+" is running in "+ Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(InterruptedException e)
		{
			System.out.println(e);
		}
        
    }
}

public class multiThread {
 
    public static void main(String args[]) throws IOException
    {
        firstThread ft = new firstThread(); //By extending thread class
        
        secondThread st = new secondThread(); //By implementing runnable interface
        Thread t2 = new Thread(st);
        
        thirdThread tt = new thirdThread();
        Thread t3 = new Thread(tt);

        System.out.println("firstThread priority: " + ft.getPriority());
        System.out.println("secondThread priority: " + t2.getPriority());
        System.out.println("thirdThread priority: " + t3.getPriority());
        
        ft.start();
        t2.start();
        t3.start();

        ft.setPriority(1);
        t2.setPriority(9);
        t3.setPriority(4);
        
        System.out.println("firstThread priority: " + ft.getPriority());
        System.out.println("secondThread priority: " + t2.getPriority());
        System.out.println("thirdThread priority: " + t3.getPriority());
    }
}