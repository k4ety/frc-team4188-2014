// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package team4188_2014.subsystems;
import team4188_2014.RobotMap;
import team4188_2014.commands.*;
import edu.wpi.first.wpilibj.*;
import team4188_2014.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.sun.squawk.util.MathUtils;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 *
 */
public class Drivetrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    CANJaguar frontLeft = RobotMap.drivetrainfrontLeft;
    CANJaguar frontRight = RobotMap.drivetrainfrontRight;
    CANJaguar rearLeft = RobotMap.drivetrainrearLeft;
    CANJaguar rearRight = RobotMap.drivetrainrearRight;
    RobotDrive robotDrive = RobotMap.drivetrainRobotDrive;
    Gyro gyro = RobotMap.drivetraingyro;
    Encoder frontLeftEncoder = RobotMap.drivetrainfrontLeftEncoder;
    Encoder frontRightEncoder = RobotMap.drivetrainfrontRightEncoder;
    Encoder rearLeftEncoder = RobotMap.drivetrainrearLeftEncoder;
    Encoder rearRightEncoder = RobotMap.drivetrainrearRightEncoder;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void init(){   
    }
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new ManualDrive());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void driveWithJoystick(double x, double y, double twist, double throttle, double direction){
        robotDrive.mecanumDrive_Cartesian(x*throttle, -y*throttle, twist*throttle, direction);
    }
    
    public void driveFieldOriented(double x, double y, double twist, double throttle){
        double DIRECTION_FIELD = MathUtils.atan(y/x);
        robotDrive.mecanumDrive_Cartesian(x*throttle, -y*throttle, twist*throttle, DIRECTION_FIELD);
    }
    
    public void driveAuto(double x, double y, double twist, double direction){
        robotDrive.mecanumDrive_Cartesian(x, y, twist, direction);
    }    
    
     public void resetGyro() 
   {
      gyro.reset();
   }
     
     public void getEncoderValues(){
        SmartDashboard.putDouble("Drivetrain",gyro.getAngle());
        SmartDashboard.putDouble("frontLeftEncoder", frontLeftEncoder.getDistance());
        SmartDashboard.putDouble("frontRightEncoder", frontRightEncoder.getDistance());
        SmartDashboard.putDouble("rearLeftEncoder", rearLeftEncoder.getDistance());
        SmartDashboard.putDouble("rearRightEncoder", rearRightEncoder.getDistance());
     }
     
     public double getRightEncoder(){
         return frontRightEncoder.getDistance();
     }
     
     public double getLeftEncoder(){
         return frontLeftEncoder.getDistance();
     }
}
