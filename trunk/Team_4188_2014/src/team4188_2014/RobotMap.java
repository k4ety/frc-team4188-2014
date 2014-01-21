// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package team4188_2014;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static boolean fieldOrientMode = false; 
    public static boolean retrieverRetracted = false;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DoubleSolenoid shooterDoubleSolenoid;
    public static DoubleSolenoid gateDoubleSolenoid;
    public static DoubleSolenoid retrieverDoubleSolenoid;
    public static Compressor Compressor;
    public static CANJaguar drivetrainfrontLeft;
    public static CANJaguar drivetrainfrontRight;
    public static CANJaguar drivetrainrearLeft;
    public static CANJaguar drivetrainrearRight;
    public static RobotDrive drivetrainRobotDrive;
    public static Gyro drivetraingyro;
    public static Encoder drivetrainfrontLeftEncoder;
    public static Encoder drivetrainfrontRightEncoder;
    public static Encoder drivetrainrearLeftEncoder;
    public static Encoder drivetrainrearRightEncoder;
    public static CANJaguar retrieverballCollect;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Relay retrieverRelay;
    public static void init() {
        retrieverDoubleSolenoid = new DoubleSolenoid(1, 5, 6);  
        gateDoubleSolenoid = new DoubleSolenoid(1, 7, 8);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        shooterDoubleSolenoid = new DoubleSolenoid(1, 3, 4);      
	
        
        Compressor = new Compressor(1, 1, 1, 2);
	
        
        try { 
            drivetrainfrontLeft = new CANJaguar(11);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            drivetrainfrontRight = new CANJaguar(12);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            drivetrainrearLeft = new CANJaguar(13);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            drivetrainrearRight = new CANJaguar(14);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        drivetrainRobotDrive = new RobotDrive(drivetrainfrontLeft, drivetrainrearLeft,
              drivetrainfrontRight, drivetrainrearRight);
	
        drivetrainRobotDrive.setSafetyEnabled(false);
        drivetrainRobotDrive.setExpiration(0.1);
        drivetrainRobotDrive.setSensitivity(0.5);
        drivetrainRobotDrive.setMaxOutput(1.0);
        drivetrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        drivetrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        drivetraingyro = new Gyro(1, 1);
	LiveWindow.addSensor("Drivetrain", "gyro", drivetraingyro);
        drivetraingyro.setSensitivity(0.007);
        drivetrainfrontLeftEncoder = new Encoder(1, 2, 1, 3, false, EncodingType.k4X);
	LiveWindow.addSensor("Drivetrain", "frontLeftEncoder", drivetrainfrontLeftEncoder);
        drivetrainfrontLeftEncoder.setDistancePerPulse(1.0);
        drivetrainfrontLeftEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        drivetrainfrontLeftEncoder.start();
        drivetrainfrontRightEncoder = new Encoder(1, 4, 1, 5, true, EncodingType.k4X);
	LiveWindow.addSensor("Drivetrain", "frontRightEncoder", drivetrainfrontRightEncoder);
        drivetrainfrontRightEncoder.setDistancePerPulse(1.0);
        drivetrainfrontRightEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        drivetrainfrontRightEncoder.start();
        drivetrainrearLeftEncoder = new Encoder(1, 6, 1, 7, false, EncodingType.k4X);
	LiveWindow.addSensor("Drivetrain", "rearLeftEncoder", drivetrainrearLeftEncoder);
        drivetrainrearLeftEncoder.setDistancePerPulse(1.0);
        drivetrainrearLeftEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        drivetrainrearLeftEncoder.start();
        drivetrainrearRightEncoder = new Encoder(1, 8, 1, 9, true, EncodingType.k4X);
	LiveWindow.addSensor("Drivetrain", "rearRightEncoder", drivetrainrearRightEncoder);
        drivetrainrearRightEncoder.setDistancePerPulse(1.0);
        drivetrainrearRightEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        drivetrainrearRightEncoder.start();
        try { 
            retrieverballCollect = new CANJaguar(15);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        retrieverRelay = new Relay(1,2);
    }
}
