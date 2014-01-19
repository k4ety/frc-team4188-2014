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
import team4188_2014.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    CorpsJoystick pilotStick, copilotStick;
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton pilotPunch1;
    public JoystickButton pilotRetrieve4;
    public JoystickButton pilotEject6;
    public JoystickButton pilotResetGyro10;
    public JoystickButton pilotRobotOrient11;
    public JoystickButton pilotFieldOrient12;
    public JoystickButton pilotMoveRetriever3;
    public Joystick pilotJoystick;
    public Joystick copilotJoystick;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        pilotJoystick = new CorpsJoystick(1,4,12,-12.0,12.0,1,1.0,-12.0,12.0,1,1.0,-12.0,12.0,2,1.0);
        copilotJoystick = new CorpsJoystick(1,4,12,-1,1,1,1.0,-1,1,1,1.0,-1,1,2,1.0);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
//        copilotJoystick = new Joystick(2);
        
//        pilotJoystick = new Joystick(1);
        
        pilotEject6 = new JoystickButton(pilotJoystick, 6);
        pilotEject6.whileHeld(new EjectBall());
        pilotRetrieve4 = new JoystickButton(pilotJoystick, 4);
        pilotRetrieve4.whileHeld(new RetrieveBall());
        pilotPunch1 = new JoystickButton(pilotJoystick, 1);
        pilotPunch1.whenPressed(new ShootBall());
	    
        // SmartDashboard Buttons
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        pilotResetGyro10 = new JoystickButton(pilotJoystick, 10);
        pilotResetGyro10.whenPressed(new ResetGyro());
        pilotFieldOrient12 = new JoystickButton(pilotJoystick, 12);
        pilotRobotOrient11.whenPressed(new RobotOrient());
        pilotFieldOrient12 = new JoystickButton(pilotJoystick, 12);
        pilotFieldOrient12.whenPressed(new FieldOrient());
        pilotMoveRetriever3 = new JoystickButton(pilotJoystick, 3);
        pilotMoveRetriever3.whenPressed(new ManipulateRetriever());
              
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getpilotJoystick() {
        return pilotJoystick;
    }
    public Joystick getcopilotJoystick() {
        return copilotJoystick;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
