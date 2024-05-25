package frc.robot.subsystems;

import frc.robot.commands.GetAngle;
import frc.robot.commands.GetPower;

import edu.wpi.first.wpilibj.XboxController;

public class Xbox {
    public static XboxController xbox = new XboxController(0);
    public static double leftY = xbox.getLeftY();
    public static double leftX = xbox.getLeftX();
    public static double leftStickPower = GetPower.getPower(leftY, leftX);
    public static double leftStickAngle = GetAngle.getControllerAngle(leftX, leftY);
    public static boolean leftStickDrift = (leftStickPower > 0.07);
    
    public static boolean leftStickDriftB() {
        return leftStickPower > 0.07;
    }
}
