package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
        Robot LaxMax=new Robot();
	    LaxMax.penDown();
        for (int i = 0; i < 8; i++) {
			
        	LaxMax.move(100);
        	LaxMax.turn(45);
		}
		
	}
}
