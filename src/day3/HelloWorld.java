package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
String city=JOptionPane.showInputDialog("Where are you from?");
if(city.equals("San Diego")) {
JOptionPane.showMessageDialog(null, "You are cool");
}
else {	
JOptionPane.showMessageDialog(null, "You should move");
	
	
}
	
	//JOptionPane.showMessageDialog(null,"Message");
//String name="Sam";
//JOptionPane.showMessageDialog(null,"Hello"+name);
//String Input=JOptionPane.showInputDialog("Enter your name");
//JOptionPane.showMessageDialog(null, "Hello, "+Input);
}
}
