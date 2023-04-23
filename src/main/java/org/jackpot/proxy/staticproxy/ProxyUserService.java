package org.jackpot.proxy.staticproxy;

import org.jackpot.proxy.UserService;

public class ProxyUserService implements UserService {

    private UserService userService;

    public ProxyUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void save() {
        System.out.println("ProxyUserService record logs");
        userService.save();
    }
}
