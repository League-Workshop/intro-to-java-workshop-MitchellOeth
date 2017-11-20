package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Mitch=new Robot();
		Mitch.hide();
		
		// 5. Set your robot's pen to the down position
		Mitch.penDown();
		// 3. Set the robot to go at max speed (10)
		Mitch.setSpeed(10);
		// 4. Do the following (steps 6-8) 75 times
		int M=0;
		while(M<75) {
			System.out.print(M);
		
			// 7. Change the pen color to random
		Mitch.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			Mitch.move(5*M);
			// 2. Turn the robot 1/7 of 360 degrees to the right
		Mitch.turn(360/7);
			// 8. Set the pen width to i
		Mitch.setPenWidth(M); 
	M++;
	}

}
}