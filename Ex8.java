import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ex8 extends JFrame{
 String Username,Password,Uname;
 public Ex8(String event){
 JFrame frame = new JFrame(event+" Page...");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(600, 400);
 GridLayout gl=new GridLayout(10,1);
 Font f= new Font("Courier", Font.BOLD, 25);
 // Roll Number
 JPanel rollNumberPanel = new JPanel();
 rollNumberPanel.setLayout(new FlowLayout());
 JLabel rollNumberLabel = new JLabel(" Roll Number:");
 JTextField rollNumberField = new JTextField(20);
 rollNumberLabel.setFont(f);
 rollNumberField.setFont(f);
 
 // Name
 JPanel namePanel = new JPanel();
 namePanel.setLayout(new FlowLayout());
 JLabel nameLabel = new JLabel(" Name:");
 JTextField nameField = new JTextField(20);
 nameLabel.setFont(f);
 nameField.setFont(f);
 // Branch
 JPanel branchPanel = new JPanel();
 branchPanel.setLayout(new FlowLayout());
 JLabel branchLabel = new JLabel(" Branch:");
 String[] branches = {"IT", "CE", "ME", "EE"};
 JComboBox<String> branchComboBox = new JComboBox<>(branches);
 branchComboBox.setBounds(100,30,100,20);
 branchLabel.setFont(f);
 branchComboBox.setFont(f);
 // Class
 JPanel classPanel = new JPanel();
 classPanel.setLayout(new FlowLayout());
 JLabel classLabel = new JLabel(" Class:");
 String[] classes = {"FY", "SY", "TY", "BE"};
 JComboBox<String> classComboBox = new JComboBox<>(classes);
 classComboBox.setBounds(250,30,100,20);
 classLabel.setFont(f);
 classComboBox.setFont(f);
 JPanel UsernamePanel = new JPanel();
 UsernamePanel.setLayout(new FlowLayout());
 JLabel usrname = new JLabel(" Username:");
 usrname.setFont(f);
 JTextField username = new JTextField(20);
 username.setFont(f);
 JLabel pswrd = new JLabel(" Password:");
 pswrd.setFont(f);
 //JTextField password = new JTextField(20);
 JPasswordField password = new JPasswordField(); 
 password.setFont(f);
 JButton submitButton = new JButton("Submit");
 submitButton.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 if(event=="Registration"){
 String rollNumber = rollNumberField.getText();
 String name = nameField.getText();
 
 String branch = (String) branchComboBox.getSelectedItem();
 String selectedClass = (String) classComboBox.getSelectedItem();
 String un=username.getText();
 String ps=password.getText();
 Username=un;
 Password=ps;
 Uname=name;
 
 // You can process the registration data here (e.g., save it to a database).
 // For now, we'll just display the entered data.
 JOptionPane.showMessageDialog(frame, " "+ name
 + "Your "+event+" is Successfull.... " );
 String login="Login";
 frame.setVisible(false);
 new Ex8(login);
 }
 else{
 String un=username.getText();
 String ps=password.getText();
 String msg="";
 //Username,Password,Uname
 if(un==Username && ps==Password){
 msg="Successfull...";
 }else{
 msg="Unsuccessfull...";
 }
 msg="Successfull...";
 String name = nameField.getText();
 JOptionPane.showMessageDialog(frame, " Rahnor Lothbruck You "+event+" is "+msg );
 frame.setVisible(false);
 } 
 }
 });
 if(event=="Registration"){
 
 frame.add(rollNumberLabel);
 frame.add(rollNumberField);
 frame.add(nameLabel);
 frame.add(nameField); 
 frame.add(classLabel);
 frame.add(classComboBox);
 frame.add(branchLabel);
 frame.add(branchComboBox);
 frame.add(usrname);
 frame.add(username);
 frame.add(pswrd);
 frame.add(password);
 frame.add(submitButton);
 }else{
 
 frame.add(usrname);
 frame.add(username);
 frame.add(pswrd);
 frame.add(password);
 frame.add(submitButton);
 }
 frame.setLayout(gl);
 frame.setVisible(true);
 }
public static void main(String[] args) {
 Ex8 form=new Ex8("Registration");
}
}
