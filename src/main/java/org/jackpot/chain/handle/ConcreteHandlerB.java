package org.jackpot.chain.handle;

import org.jackpot.chain.Request;
import org.jackpot.chain.RequestType;

public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE_B) {
            System.out.println("ConcreteHandlerB handles "+request.getType().name()+" request");
            nextHandle(request);
        } else {
            System.out.println("ConcreteHandlerB don't handle "+request.getType().name()+" request");
            nextHandle(request);
        }
    }
}
