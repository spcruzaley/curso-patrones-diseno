package com.patrones.comportamiento.command.comandos;

import com.patrones.comportamiento.command.service.Receptor;

// Comando concreto para hacer "pull"
public class PullCommand implements Command {
    private final Receptor receptor;

    public PullCommand(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public void execute() {
        receptor.pull();
    }
}
