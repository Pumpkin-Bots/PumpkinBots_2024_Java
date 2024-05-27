package frc.robot.inputs;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class HIDDevice {

    public final Trigger buttonB;
    public final Trigger leftTrigger;

    /** XboxController Object for Controller; contains all Xbox Controller Functions */
    private final CommandXboxController controller;

    public HIDDevice(int port) {
        controller = new CommandXboxController(port);

        buttonB = controller.b();
        leftTrigger = controller.leftTrigger();
    }

    public double getLeftStickX() {
        return controller.getLeftX();
    }

    public double getLeftStickY() {
        return controller.getLeftY();
    }
}
