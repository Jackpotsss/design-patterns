package org.jackpot.chain.handle;

import org.jackpot.chain.Request;
import org.jackpot.chain.RequestType;

public class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE_C) {
            System.out.println("ConcreteHandlerC handles "+request.getType().name()+" request");
            nextHandle(request);
        } else {
            System.out.println("ConcreteHandlerC don't handle "+request.getType().name()+" request");
            nextHandle(request);
        }
    }
}
