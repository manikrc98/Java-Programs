import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class nextPage extends JFrame   //Second page -> (JFrame - swing component, based on awt, mostly used in industries)
{
    nextPage(Login a)
    {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); //alternative of windowlistener
        setTitle("Welcome");
        setSize(400,200);
        a.setVisible(false);
    }
}

class Login extends JFrame implements ActionListener,MouseListener,MouseMotionListener//First Page
{
    Button SUBMIT;
    Panel panel;
    Label l1,l2,l3;
    final TextField text1,text2;
    Login()
    {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        l1 = new Label();
        l1.setText("Username:");
        text1 = new TextField(15);

        l2 = new Label();
        l2.setText("Password:");
        text2 = new TextField(15);//JPasswordField(15);

        SUBMIT = new Button("SUBMIT");

        //panel = new Panel(new GridLayout(3,1));
        panel = new Panel(new FlowLayout());
        panel.add(l1);
        panel.add(text1);
        panel.add(l2);
        panel.add(text2);

        l3 = new Label();  //variable for mouselistener class
        panel.add(l3);
        
        panel.add(SUBMIT);
        add(panel,BorderLayout.CENTER);
        text2.addMouseListener(this);
        text1.addMouseMotionListener(this);
        
        SUBMIT.addActionListener(this);
        setTitle("LOGIN FORM");

        
    }
    public void actionPerformed(ActionEvent ae)  //overriding the method defined in actionlistener 
    {
        String value1 = text1.getText(); //extracting the values from the form text fields
        String value2 = text2.getText(); 
        if(value1.equals("Manik") && value2.equals("abc"))
        {
            nextPage page = new nextPage(this);
            //frame.setVisible(false);
            page.setVisible(true);
            Label label = new Label("Welcome:" + value1);
            page.getContentPane().add(label); 
        }
        else{
            System.out.println("Enter the valid username and password");
            JOptionPane.showMessageDialog(this,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mouseClicked(MouseEvent e)   //overriding abstract methods of mouselistener 
    {
        l3.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) //overriding abstract methods of mouselistener
    {
        l3.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) //overriding abstract methods of mouselistener
    {
        l3.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) //overriding abstract methods of mouselistener
    {
        l3.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) //overriding abstract methods of mouselistener
    {
        l3.setText("Mouse Released");
    }
    public void mouseDragged(MouseEvent e)
    {
        l3.setText("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent e)
    {
        l3.setText("Mouse Moved");
    }
}
public class loginDemo{
    public static void main(String[] args) {
        try{
            Login frame = new Login();
            frame.setSize(600,400);
            frame.setVisible(true);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}