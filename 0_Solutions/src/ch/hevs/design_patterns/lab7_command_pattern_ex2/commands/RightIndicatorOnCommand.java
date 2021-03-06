package ch.hevs.design_patterns.lab7_command_pattern_ex2.commands;


import ch.hevs.design_patterns.lab7_command_pattern_ex2.Log;
import ch.hevs.design_patterns.lab7_command_pattern_ex2.receiver.RightIndicator;

/**
 * Lab 7
 * @author scz
 */
public class RightIndicatorOnCommand implements Command {

	RightIndicator rightIndicator;

	public RightIndicatorOnCommand(RightIndicator rightIndicator) {
		this.rightIndicator = rightIndicator;
	}

	public void execute() {
		rightIndicator.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
