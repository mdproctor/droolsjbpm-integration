package org.drools.simulation.fluent.batch.impl;


import org.drools.core.command.impl.GenericCommand;
import org.kie.internal.command.Context;

public class GetContextCommand<T> implements GenericCommand<T> {
    private String name;

    public GetContextCommand(String name) {
        this.name = name;
    }

    @Override
    public T execute(Context context) {
        T returned = (T) context.get("returned");
        return returned;
    }
}
