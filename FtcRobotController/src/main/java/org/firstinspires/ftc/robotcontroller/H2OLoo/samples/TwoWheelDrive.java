package org.firstinspires.ftc.robotcontroller.H2OLoo.samples;

import com.ftc.waterloo.h2oloobots.DriveTrain;
import com.ftc.waterloo.h2oloobots.H2OLooOpMode;
import com.ftc.waterloo.h2oloobots.TelemetryControl;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Two Wheel Drive TeleOp", group = "H2OLoo Samples")
public class TwoWheelDrive extends H2OLooOpMode {

    @Override
    public void opModeInit() {

        driveTrain.setDriveTrainType(DriveTrain.DriveTrainType.TWO_WHEEL_DRIVE);

    }

    @Override
    public void opModePeriodic() {

        driveTrain.teleOpDrive(
                gamepad1.left_stick_y,
                gamepad1.left_stick_x
        );

    }

}