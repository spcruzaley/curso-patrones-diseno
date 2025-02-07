package com.patrones.comportamiento.command;

import com.patrones.comportamiento.command.comandos.Command;
import com.patrones.comportamiento.command.comandos.CommitCommand;
import com.patrones.comportamiento.command.comandos.PullCommand;
import com.patrones.comportamiento.command.comandos.PushCommand;
import com.patrones.comportamiento.command.service.Receptor;
import com.patrones.comportamiento.command.service.VersionControlClient;

public class GitDemo {

    public static void main(String[] args) {
        Receptor receptor = new Receptor("http://github.com/spcruzaley");
        Command commit = new CommitCommand(receptor, "Primer commit");
        Command push = new PushCommand(receptor);
        Command pull = new PullCommand(receptor);

        VersionControlClient client = new VersionControlClient();
        client.setCommitCommand(commit);
        client.setPushCommand(push);
        client.setPullCommand(pull);

        client.ejecutarCommit();
        client.ejecutarPush();
        client.ejecutarCommit();
        client.ejecutarPush();
    }
}
