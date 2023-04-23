package org.jackpot.chain.handle;

import org.jackpot.chain.Request;
import org.jackpot.chain.RequestType;
import org.jackpot.chain.handle.Handler;

public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE_A) {
            System.out.println("ConcreteHandlerA handles "+request.getType().name()+" request");
            nextHandle(request);
        } else {
            System.out.println("ConcreteHandlerA don't handle "+request.getType().name()+" request");
            nextHandle(request);
        }
    }
}
