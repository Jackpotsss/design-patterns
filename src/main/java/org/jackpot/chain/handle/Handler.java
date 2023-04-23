package org.jackpot.chain.handle;

import org.jackpot.chain.Request;

public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void nextHandle(Request request){
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    public abstract void handleRequest(Request request);
}
