package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrivetrainSubsystem;

public class ZeroGyro extends CommandBase {
    private final DrivetrainSubsystem drive;
    
    public ZeroGyro(DrivetrainSubsystem driveSub) { 
        drive = driveSub;
    }

    @Override
    public void initialize() {
        drive.zeroGyroscope();
    }
}
