// GUI FORM FOR READING THE DETAILS OF A BOOK
// WITH ATLEAST ONE CONTROL OF EACH TYPE MENTIONED IN THE QUESTION
// AND IMPLEMENT EVENT HANDLING ON IT.

// FULLY DESIGNED BOOK REGISTRATION FORM WITH DATA VALIDATION
import java.awt.*;  
import java.awt.event.*;  
class eventHandling extends Frame implements ActionListener{  
TextField tf;  
eventHandling(){  
  
//create components  
tf=new TextField();  
tf.setBounds(60,50,170,20);  
Button b=new Button("click me");  
b.setBounds(100,120,80,30);  
  
//register listener  
b.addActionListener(this);//passing current instance  
  
//add components and set size, layout and visibility  
add(b);add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
tf.setText("Welcome");  
}  
public static void main(String args[]){  
new eventHandling();  
}  
}  