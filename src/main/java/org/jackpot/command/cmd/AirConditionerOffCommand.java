package org.jackpot.command.cmd;

import org.jackpot.command.manufacturer.AirConditioner;

/**
 * 开空调命令
 */
public class AirConditionerOffCommand implements Command{

    private AirConditioner airConditioner;

    public AirConditionerOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.off();
    }

    @Override
    public void undo() {
        airConditioner.on();
        airConditioner.refrigeration();
        airConditioner.SweepTheWind();
    }
}
