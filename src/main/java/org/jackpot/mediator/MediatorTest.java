package org.jackpot.mediator;

public class MediatorTest {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        user1.setMediator(chatRoom);
        user2.setMediator(chatRoom);
        user1.send("Hello, Bob!");
        user2.send("Hi, Alice!");
    }
}
