package com.patrones.comportamiento.command.comandos;

import com.patrones.comportamiento.command.service.Receptor;

// Comando concreto para hacer "push"
public class PushCommand implements Command {
    private final Receptor receptor;

    public PushCommand(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public void execute() {
        receptor.push();
    }
}
