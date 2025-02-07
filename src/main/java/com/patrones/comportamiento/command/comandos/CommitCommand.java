package com.patrones.comportamiento.command.comandos;

import com.patrones.comportamiento.command.service.Receptor;

// Comando concreto para hacer "commit"
public class CommitCommand implements Command {
    private final Receptor receptor;
    private final String message;

    public CommitCommand(Receptor receptor, String message) {
        this.receptor = receptor;
        this.message = message;
    }

    @Override
    public void execute() {
        receptor.commit(message);
    }
}
