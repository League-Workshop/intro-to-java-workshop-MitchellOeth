package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
Robot Mitch=new Robot();	
Mitch.miniaturize();
Mitch.setSpeed(100);
Mitch.penDown();
Mitch.setPenColor(Color.BLUE);
Mitch.move(100);
Mitch.turn(90);		

	}
}
