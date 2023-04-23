package org.jackpot.chain;

public class Request {
    private RequestType type;
    private String content;

    public Request(RequestType type, String content) {
        this.type = type;
        this.content = content;
    }

    public RequestType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }


}
