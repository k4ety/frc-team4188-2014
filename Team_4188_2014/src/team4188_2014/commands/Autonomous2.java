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
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous2 extends CommandGroup {
    
    public  Autonomous2() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
     //   addSequential(new RetrieverOut());
        addSequential(new ResetGyro());
        //addSequential(new RetrieverOut());
        //addSequential(new RetrieveBallTime(20));
        
        addParallel(new AutoDrive());
        addSequential(new Wait(3.0));
        //addSequential(new EjectBallTime(10));
        
        addSequential(new ShootBall());
        //addSequential(new Wait(2.0));
        //addSequential(new RetrieveBallTime(30));
        //addSequential(new RetrieverIn());
        //addSequential(new ShootBall());
//        addSequential(new RecognizeTarget());
        //addSequential(new AutoDriveBackwards());
        //addParallel(new RecognizeTarget());
    }
}
