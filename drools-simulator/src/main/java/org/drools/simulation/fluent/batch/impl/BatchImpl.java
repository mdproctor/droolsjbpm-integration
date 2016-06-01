package org.drools.simulation.fluent.batch.impl;

import org.drools.core.command.impl.GenericCommand;
import org.drools.simulation.fluent.batch.Batch;
import org.kie.api.command.Command;

import java.util.ArrayList;
import java.util.List;

public class BatchImpl implements Batch {

    private List<Command> commands = new ArrayList<Command>();

    public BatchImpl() {
    }

    public void addCommand(Command cmd) {
        this.commands.add(cmd);
    }

    @Override
    public List<Command> getCommands() {
        return commands;
    }
}
