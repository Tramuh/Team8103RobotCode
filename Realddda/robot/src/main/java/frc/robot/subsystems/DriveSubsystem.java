/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class DriveSubsystem extends SubsystemBase {
  /**
   * Creates a new DriveSubsystem.
   */
  PWMVictorSPX leftFront = new PWMVictorSPX(Constants.mLeftFront);
  PWMVictorSPX leftBack = new PWMVictorSPX(Constants.mLeftBack);
  PWMVictorSPX rightFront = new PWMVictorSPX(Constants.mRightront);
  PWMVictorSPX rightBack = new PWMVictorSPX(Constants.mRightBack);


  SpeedControllerGroup leftSide = new SpeedControllerGroup(leftFront, leftBack);
  SpeedControllerGroup rightSide = new SpeedControllerGroup(rightFront, rightBack);

  DifferentialDrive drive = new DifferentialDrive(leftSide, rightSide);


  public DriveSubsystem() {
  
  }

  
  public void manualDrive(double move, double turn) {
    drive.arcadeDrive(move, turn);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
