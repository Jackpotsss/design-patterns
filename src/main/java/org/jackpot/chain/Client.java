package org.jackpot.chain;

import org.jackpot.chain.handle.ConcreteHandlerA;
import org.jackpot.chain.handle.ConcreteHandlerB;
import org.jackpot.chain.handle.ConcreteHandlerC;
import org.jackpot.chain.handle.Handler;

public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        Request request1 = new Request(RequestType.TYPE_A, "request1");
        Request request2 = new Request(RequestType.TYPE_B, "request2");
        Request request3 = new Request(RequestType.TYPE_C, "request3");

        handlerA.handleRequest(request1);
//        handlerA.handleRequest(request2);
//        handlerA.handleRequest(request3);
    }
}

