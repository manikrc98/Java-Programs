import java.awt.*;
import java.awt.event.*;
public class registrationForm extends Frame implements WindowListener{
    registrationForm(){  
        addWindowListener(this);  
          
        setSize(400,600);  
        setLayout(null);  
        setVisible(true);  
    }     
    public static void main(String[] args) {
            registrationForm rf = new registrationForm();
            // LABELS
            Label l1,l2,l3,l4,l5,l6,l7,l8;
            l1 = new Label("First Name: ");
            l1.setBounds(50,100, 100,30);  
            l2 = new Label("Last Name: ");
            l2.setBounds(50,130, 100,30);
            l3 = new Label("Hobbies: ");
            l3.setBounds(50,160, 80,30);
            l4 = new Label("Gender: ");
            l4.setBounds(50,220, 80,30);
            l5 = new Label("Language: ");
            l5.setBounds(50,290, 80,30);
            l6 = new Label("Address: ");
            l6.setBounds(50,350, 80,30);
            rf.add(l1);
            rf.add(l2);
            rf.add(l3);
            rf.add(l4);
            rf.add(l5);
            rf.add(l6);

            // TEXT FIELD
            TextField t1,t2;  
            t1=new TextField();  
            t1.setBounds(80,100, 200,30);  
            t2=new TextField();  
            t2.setBounds(80,130, 200,30);  
            rf.add(t1); rf.add(t2);  
            
            // CHECKBOXES
            Checkbox checkbox1 = new Checkbox("Sports");  
            checkbox1.setBounds(140,160,150,50);  
            Checkbox checkbox2 = new Checkbox("Designing", true);  
            checkbox2.setBounds(140,190,150,50);  
            rf.add(checkbox1);  
            rf.add(checkbox2);  

            //Checkbox Group(Radio buttons)
            CheckboxGroup cbg = new CheckboxGroup();  
            Checkbox checkBoxg1 = new Checkbox("Male", cbg, false);    
            checkBoxg1.setBounds(140,220, 100,50);    
            Checkbox checkBoxg2 = new Checkbox("Female", cbg, true);    
            checkBoxg2.setBounds(140,250, 100,50);    
            rf.add(checkBoxg1);    
            rf.add(checkBoxg2);    

            // LIST
            Choice c=new Choice();  
            c.setBounds(140,280, 50,50);  
            c.add("C");  
            c.add("C++");  
            c.add("Java");  
            c.add("PHP");  
            c.add("Android");  
            rf.add(c);
            
            // TextAREA
            TextArea area=new TextArea();  
            area.setBounds(140,350, 150,50);  
            rf.add(area);  

            // BUTTON
            Button b=new Button("Submit");  
            b.setBounds(150,450,80,30);  
            rf.add(b);  

        }
        public void windowActivated(WindowEvent arg0) {  
            System.out.println("activated");  
        }  
        public void windowClosed(WindowEvent arg0) {  
            System.out.println("closed");  
        }  
        public void windowClosing(WindowEvent arg0) {  
            System.out.println("closing");  
            dispose();  
        }  
        public void windowDeactivated(WindowEvent arg0) {  
            System.out.println("deactivated");  
        }  
        public void windowDeiconified(WindowEvent arg0) {  
            System.out.println("deiconified");  
        }  
        public void windowIconified(WindowEvent arg0) {  
            System.out.println("iconified");  
        }  
        public void windowOpened(WindowEvent arg0) {  
            System.out.println("opened");  
        }  
}