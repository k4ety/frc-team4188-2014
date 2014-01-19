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
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import team4188_2014.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Retriever extends Subsystem {
    private static final double PNEUMATIC_DELAY_SECONDS = 0.1;
    private static final double MAX_VOLT_RETRIEVER = 5.0;
    boolean RETRIEVER_FORWARD = false;
    boolean RETRIEVER_REVERSE = true;
    Compressor compressor = RobotMap.Compressor;
    DoubleSolenoid retrieverDoubleSolenoid = RobotMap.retrieverDoubleSolenoid;
    Relay retrieverSpike = RobotMap.retrieverRelay;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    CANJaguar ballCollect = RobotMap.retrieverballCollect;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void init(){
        retrieverSpike.set(Relay.Value.kOff);
        compressor.start();
//        try{
//            ballCollect.configMaxOutputVoltage(MAX_VOLT_RETRIEVER);
//            ballCollect.configNeutralMode(CANJaguar.NeutralMode.kCoast);
//           } catch (CANTimeoutException ex) {ex.printStackTrace();}
    }
    
    public void retrieve(){
        retrieverSpike.set(Relay.Value.kForward);
        RETRIEVER_FORWARD = true;
//        try{
//            ballCollect.setVoltageRampRate(0.0);
//            ballCollect.setX(speedr);
//        } catch (CANTimeoutException ex) {ex.printStackTrace();}
    }
    
    public void eject(){
        retrieverSpike.set(Relay.Value.kReverse);
        RETRIEVER_REVERSE = true;
//        try{
//            ballCollect.setVoltageRampRate(0.0);
//            ballCollect.setX(-speede);
//        } catch (CANTimeoutException ex) {ex.printStackTrace();}    
    }
    
    public void retractRetriever(){
        retrieverDoubleSolenoid.set(DoubleSolenoid.Value.kReverse);    
        Timer.delay(PNEUMATIC_DELAY_SECONDS);
        retrieverDoubleSolenoid.set(DoubleSolenoid.Value.kOff);  
        RobotMap.retrieverRetracted= true;
    }
    
    public void deployRetriever(){
        retrieverDoubleSolenoid.set(DoubleSolenoid.Value.kForward);    
        Timer.delay(PNEUMATIC_DELAY_SECONDS);
        retrieverDoubleSolenoid.set(DoubleSolenoid.Value.kOff);  
        RobotMap.retrieverRetracted = false;

    }
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
