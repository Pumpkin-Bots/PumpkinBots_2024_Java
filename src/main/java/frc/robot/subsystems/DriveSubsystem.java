// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.hardware.Pigeon2;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveSubsystemConstants;
import java.util.function.BooleanSupplier;

public class DriveSubsystem extends SubsystemBase {
  private final TalonFX m_backRightSteerMotor = new TalonFX(DriveSubsystemConstants.kBackRightSteerMotorPort);
  private final TalonFX m_frontRightSteerMotor = new TalonFX(DriveSubsystemConstants.kFrontRightSteerMotorPort);
  private final TalonFX m_frontLeftSteerMotor = new TalonFX(DriveSubsystemConstants.kFrontLeftSteerMotorPort);
  private final TalonFX m_backLeftSteerMotor = new TalonFX(DriveSubsystemConstants.kBackLeftSteerMotorPort);
  private final Pigeon2 m_Pigeon2 = new Pigeon2(DriveSubsystemConstants.kPigeonPort);

  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {}

  /**
   * Example command factory method.
   *
   * @return a command
   */

   /* drives the robot */
  public Command driveRobot() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
          System.err.println("pressed B. driveRobot runonce");
         // Drive.m_backRightSteerMotor.setControl(new DutyCycleOut(0.1));
          
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean leftJoystickTriggered() {
    // Query some boolean state, such as a digital sensor.
    BooleanSupplier sup = () -> true;
    return (sup.getAsBoolean());
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
