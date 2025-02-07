package com.patrones.comportamiento.command.service;

import com.patrones.comportamiento.command.comandos.Command;

// Invocador
public class VersionControlClient {
    private Command commitCommand;
    private Command pushCommand;
    private Command pullCommand;

    public VersionControlClient() {
    }

    public void setCommitCommand(Command command) {
        this.commitCommand = command;
    }

    public void setPushCommand(Command command) {
        this.pushCommand = command;
    }

    public void setPullCommand(Command command) {
        this.pullCommand = command;
    }

    public void ejecutarCommit() {
        commitCommand.execute();
    }

    public void ejecutarPush() {
        pushCommand.execute();
    }

    public void ejecutarPull() {
        pullCommand.execute();
    }
}
