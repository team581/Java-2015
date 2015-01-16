package org.usfirst.frc.team581.robot.commands;

import org.usfirst.frc.team581.robot.OI;
import org.usfirst.frc.team581.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	public static OI oi; 
	public static Drive drive = new Drive();
	
	public static void init(){
		oi = new OI();
	}

	public CommandBase(String name) {
	    super(name);
	}

	public CommandBase() {
	    super();
	}
	
	
}

