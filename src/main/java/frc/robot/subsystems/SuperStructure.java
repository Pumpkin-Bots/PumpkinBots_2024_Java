package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class SuperStructure {

    public SuperStructure() {

    }

    public Command testCommand() {
        return Commands.runOnce(() -> {
            System.out.println("Called Test Command");
        });
    }
}
