package com.dtarasiuk.paterns.behavioral.command;

public class CommandRunner {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();

        Command turnOnnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);

        remoteControl.setCommand(turnOnnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();

    }
}
