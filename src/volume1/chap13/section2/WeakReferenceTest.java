package chap13.section2;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class WeakReferenceTest {
    public static void main(String[] args) {
        Car car = new Car(1000000.0, "black");
        // dead
        WeakReference<Car> weakReference = new WeakReference<>(car);
        // dead
//        WeakReference<Car> weakReference = new WeakReference<>(new Car(10000.0, "black"));
        while (true) {
            // 这个语句导致不会回收
//            System.out.println(car);
            if (weakReference.get() != null) {
                System.out.println("alive");
            } else {
                System.out.println("dead");
                break;
            }
        }

        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        WeakReference<Car> weakReference1 = new WeakReference<>(new Car(100000, "1, 1, 1"), referenceQueue);
        WeakReference<Car> weakReference2 = new WeakReference<>(new Car(200000, "2, 2, 2"), referenceQueue);
        WeakReference<Car> weakReference3 = new WeakReference<>(new Car(300000, "3, 3, 3"), referenceQueue);
        while (true) {
            if (weakReference1.get() == null
                    && weakReference2.get() == null
                    && weakReference3.get() == null) {
                break;
             }
        }
        System.out.println(referenceQueue.poll() != null);
        System.out.println(referenceQueue.poll() != null);
        System.out.println(referenceQueue.poll() != null);
    }
}

class Car {
    private double price;
    private String color;

    public Car(double price, String color) {
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[" + "price=" + price + ",color=" + color + "]";
    }
}
