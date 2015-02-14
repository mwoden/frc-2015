package org.usfirst.frc.team166.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team166.robot.RobotMap;

/**
 *
 */
public class LimitSwitchLift extends Lift {

	DigitalInput carriageLimit = new DigitalInput(RobotMap.Switch.CarriageRCLiftLimit);

	public LimitSwitchLift(int motorChannel, int pcm, int brakeChannel, int encoderChannelA, int encoderChannelB,
			int boundaryLimitChannel, String subsystem) {
		super(motorChannel, pcm, brakeChannel, encoderChannelA, encoderChannelB, boundaryLimitChannel, subsystem);
		LiveWindow.addSensor(subsystem, "Carriage Switch", carriageLimit);
	}

	public boolean areLiftsInContact() {
		return carriageLimit.get();
	}
}
