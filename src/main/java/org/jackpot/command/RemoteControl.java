package org.jackpot.command;

import org.jackpot.command.cmd.*;
import org.jackpot.command.manufacturer.AirConditioner;
import org.jackpot.command.manufacturer.Light;
import org.jackpot.command.manufacturer.Stereo;

public class RemoteControl {

    private static Command[] commands = new Command[6];
//    private static Command[] commandsOff = new Command[3];
    private static Command undo;

    static {
        commands[0] = new LightOnCommand(new Light());
        commands[1] = new LightOffCommand(new Light());
        commands[2] = new AirConditionerOnCommand(new AirConditioner());
        commands[3] = new AirConditionerOffCommand(new AirConditioner());
        commands[4] = new StereoOnCommand(new Stereo());
        commands[5] = new StereoOffCommand(new Stereo());
    }

    public static void pressOn(int number){
        undo = commands[number];
        undo.execute();
    }
    public static void undo(){
        undo.execute();
    }

    public static void fullOn(){
        commands[0].execute();
        commands[2].execute();
        commands[4].execute();
    }
}
