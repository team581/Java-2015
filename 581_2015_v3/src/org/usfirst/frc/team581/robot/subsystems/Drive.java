package org.usfirst.frc.team581.robot.subsystems;

import org.usfirst.frc.team581.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	RobotDrive robotDrive;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	robotDrive = new RobotDrive(RobotMap.leftForwardMotor, RobotMap.leftBackMotor, RobotMap.rightBackMotor, RobotMap.rightForwardMotor);
    	robotDrive.setInvertedMotor(MotorType.kFrontLeft, true);	// invert the left side motors
    	robotDrive.setInvertedMotor(MotorType.kRearLeft, true);		// you may need to change or remove this to match your 
    }
    public void mecDrive(double driveStickX, double driveStickY, double driveRotation){
    	robotDrive.mecanumDrive_Cartesian(driveStickX, driveStickY, driveRotation, 0);
	}
}

