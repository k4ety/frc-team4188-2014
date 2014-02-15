// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package team4188_2014.commands;
import edu.wpi.first.wpilibj.command.Command;
import team4188_2014.Robot;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import team4188_2014.RobotMap;
/**
 *
 */
public class  ManualDrive extends Command {
    Joystick pilotStick = Robot.oi.pilotJoystick;
    private boolean in = false;
    public ManualDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        
    }
    // Called just before this Command runs the first time
    protected void initialize() {
  
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //drive with shooter forward
        if(!RobotMap.fieldOrientMode){
            Robot.drivetrain.driveWithJoystick(-pilotStick.getX(), -pilotStick.getY(), pilotStick.getTwist(), pilotStick.getThrottle(), 0);
        }
        
        else {
            Robot.drivetrain.driveWithJoystick(pilotStick.getX(), pilotStick.getY(), pilotStick.getTwist(), pilotStick.getThrottle(), RobotMap.drivetraingyro.getAngle());
        }
        
        Robot.drivetrain.getEncoderValues();
        SmartDashboard.putBoolean("Limit Switch", Robot.shooter.getGateLatch());
        SmartDashboard.putBoolean("FieldOrient", RobotMap.fieldOrientMode);
        SmartDashboard.putBoolean("Shooter In", Robot.shooter.isRetracted());
        SmartDashboard.putBoolean("Shooter Out", Robot.shooter.isExtended());
        SmartDashboard.putBoolean("Retriever In", Robot.retriever.isRetracted());
        SmartDashboard.putBoolean("Retriever Out", Robot.retriever.isDeployed());
    }
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
    // Called once after isFinished returns true
    protected void end() {
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}