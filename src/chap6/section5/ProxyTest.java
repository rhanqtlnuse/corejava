package chap6.section5;

import java.lang.reflect.*;
import java.util.Random;

public class ProxyTest {
    public static void main(String[] args) {
        Object[] ducks = new Object[5];
        for (int i = 0; i < ducks.length; i++) {
            MallardDuck duck = new MallardDuck(i * 4.5 + 3);
            InvocationHandler handler = new FlyHandler(duck);
            // 为什么默认null不可以？
            Object proxy = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {FlyBehavior.class}, handler);
            ducks[i] = proxy;
        }

        int index = new Random().nextInt(ducks.length);
        FlyBehavior d = (FlyBehavior) ducks[index];
        d.fly();
    }
}

interface FlyBehavior {
    void fly();
}

class MallardDuck implements FlyBehavior {
    private double weight;

    public MallardDuck(double weight) {
        this.weight = weight;
    }

    @Override
    public void fly() {
        System.out.println("mallard duck flying...");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return getClass().getName() + "[" + "weight=" + weight + "]";
    }
}

class FlyHandler implements InvocationHandler {
    private Object target;

    public FlyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy called");
        System.out.print(target);
        System.out.print("." + method.getName() + "(");
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i != args.length - 1) {
                    System.out.print(",");
                }
            }
        }
        System.out.println(")");

        return method.invoke(target, args);
    }
}
