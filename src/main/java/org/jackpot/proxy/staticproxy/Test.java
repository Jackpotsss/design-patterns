package org.jackpot.proxy.staticproxy;

import org.jackpot.proxy.UserService;
import org.jackpot.proxy.UserServiceImpl;

public class Test {

    public static void main(String[] args) {
        UserService proxyUserService = new ProxyUserService(new UserServiceImpl());
        proxyUserService.save();
    }
}
