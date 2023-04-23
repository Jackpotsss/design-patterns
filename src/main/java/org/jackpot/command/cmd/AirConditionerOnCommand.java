package org.jackpot.command.cmd;

import org.jackpot.command.manufacturer.AirConditioner;

/**
 * 开空调命令
 */
public class AirConditionerOnCommand implements Command{

    private AirConditioner airConditioner;

    public AirConditionerOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.on();
        airConditioner.refrigeration();
        airConditioner.SweepTheWind();
    }

    @Override
    public void undo() {
        airConditioner.off();
    }
}
