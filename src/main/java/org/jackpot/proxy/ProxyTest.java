package org.jackpot.proxy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;
import org.jackpot.proxy.dynamic.UserServiceProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class ProxyTest {

    public static void byteBuddy() throws Exception {
        UserService userService = new UserServiceImpl();
        Class<? extends UserService> proxyClass = new ByteBuddy()
                .subclass(UserService.class)
                .method(named("toString")).intercept(FixedValue.value("Hello, ByteBuddy!"))
                .method(ElementMatchers.isDeclaredBy(UserService.class).and(ElementMatchers.returns(TypeDescription.ForLoadedType.of(void.class)))).intercept(FixedValue.value(TypeDescription.ForLoadedType.of(void.class)))
                .make()
                .load(UserService.class.getClassLoader()).getLoaded();
        UserService proxy = proxyClass.getDeclaredConstructor().newInstance();
        proxy.save();
    }


    public static void jdkProxy() {
        UserService userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        UserService proxyInstance = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), proxy);
        proxyInstance.save();
    }

    public static void main(String[] args) throws Exception {
//        jdkProxy();
        byteBuddy();
    }
}
