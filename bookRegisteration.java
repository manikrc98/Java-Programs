import java.awt.*;
import java.awt.event.*;
public class bookRegisteration extends Frame implements WindowListener{
    bookRegisteration(){  
        addWindowListener(this);  
          
        setSize(400,600);  
        setLayout(null);  
        setVisible(true);  
    }     
    public static void main(String[] args) {
            bookRegisteration rf = new bookRegisteration();
            // LABELS
            
            Label l0,l1,l2,l3,l4,l5,l6;
            l0 = new Label("Registration Form");
            l0.setBounds(150,60, 150,30);
            l0.setForeground(Color.white);
            l1 = new Label("First Name: ");
            l1.setBounds(50,100, 100,30);  
            l2 = new Label("Last Name: ");
            l2.setBounds(50,130, 100,30);
            l3 = new Label("Hobbies: ");
            l3.setBounds(50,170, 80,30);
            l4 = new Label("Gender: ");
            l4.setBounds(50,230, 80,30);
            l5 = new Label("Language: ");
            l5.setBounds(50,290, 80,30);
            l6 = new Label("Address: ");
            l6.setBounds(50,350, 80,30);
            
            Font myFont = new Font("Calibiri",Font.BOLD,20);
            l0.setFont(myFont);
            l1.setForeground(Color.white);
            l2.setForeground(Color.white);
            l3.setForeground(Color.white);
            l4.setForeground(Color.white);
            l5.setForeground(Color.white);
            l6.setForeground(Color.white);

            // MENU
            MenuBar mb = new MenuBar();  
            
            Menu menu = new Menu("Edit");  
            Menu submenu = new Menu("Clear");    
            MenuItem i2 = new MenuItem("Change");  
            MenuItem i3 = new MenuItem("Exit");  
            MenuItem i4 = new MenuItem("Single");  
            MenuItem i5 = new MenuItem("All");  
            
            Menu menu2 = new Menu("Help");  

            menu.add(i2);  
            menu.add(i3);  
            submenu.add(i4);  
            submenu.add(i5);  
            menu.add(submenu);  
            mb.add(menu); 
            mb.add(menu2);
            rf.setMenuBar(mb);  


            //Popup Menu
            PopupMenu popupmenu = new PopupMenu("Edit");   
            MenuItem cut = new MenuItem("Cut");  
            cut.setActionCommand("Cut");  
            MenuItem copy = new MenuItem("Copy");  
            copy.setActionCommand("Copy");  
            MenuItem paste = new MenuItem("Paste");  
            paste.setActionCommand("Paste");      
            popupmenu.add(cut);  
            popupmenu.add(copy);  
            popupmenu.add(paste);        
            
            rf.add(l0);
            rf.add(l1);
            rf.add(l2);
            rf.add(l3);
            rf.add(l4);
            rf.add(l5);
            rf.add(l6);
            rf.addMouseListener(new MouseAdapter() {  
                public void mouseClicked(MouseEvent e) {              
                    popupmenu.show(rf , e.getX(), e.getY());  
                }                 
             });  
             rf.add(popupmenu);
            // TEXT FIELD
            TextField t1,t2;  
            t1=new TextField();  
            t1.setBounds(80,100, 200,30);  
            t2=new TextField();  
            t2.setBounds(80,130, 200,30);  
            rf.add(t1); rf.add(t2);  
            
            // CHECKBOXES
            Font chkFont = new Font("Courier", Font.ITALIC,12);
            
            Checkbox checkbox1 = new Checkbox("Sports");  
            checkbox1.setBounds(140,160,150,50);  
            checkbox1.setFont(chkFont);
            checkbox1.setForeground(Color.lightGray);
            
            Checkbox checkbox2 = new Checkbox("Designing", true);  
            checkbox2.setBounds(140,190,150,50);
            checkbox2.setFont(chkFont);
            checkbox2.setForeground(Color.lightGray);
            
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
            rf.setBackground(Color.LIGHT_GRAY);

            // Choice
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
            area.setBounds(140,350, 220,100);  
            rf.add(area);  

            // BUTTON
            Button b=new Button("Submit");  
            b.setBounds(150,500,110,30);
            b.setFont(myFont);  
            b.setBackground(Color.WHITE);
            b.setForeground(new Color(53, 129, 184));
            rf.add(b);  

            // ICON
            Image icon = Toolkit.getDefaultToolkit().getImage("/home/mchugh/Downloads/Java-Programs/icon.png");  
            rf.setIconImage(icon);  

            rf.setBackground(new Color(53, 129, 184));
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