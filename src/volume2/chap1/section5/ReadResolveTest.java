package volume2.chap1.section5;

import java.io.*;

public class ReadResolveTest {
    public static void main(String[] args) {
        Orientation original = Orientation.HORIZONTAL;
        try (ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("src/volume2/chap1/section5/enum.ser"))) {
            oout.writeObject(original);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream("src/volume2/chap1/section5/enum.ser"))) {
            // 如果没有readResolve，越过访问控制，直接创建新对象
            Orientation saved = (Orientation) oin.readObject();
            System.out.println(saved == original);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

class Orientation implements Serializable {
    public static final Orientation HORIZONTAL = new Orientation(1);
    public static final Orientation VERTICAL = new Orientation(2);

    private int value;

    private Orientation(int value) {
        this.value = value;
    }

    protected Object readResolve() throws ObjectStreamException {
        if (value == 1) {
            return HORIZONTAL;
        } else if (value == 2) {
            return VERTICAL;
        } else {
            return null;
        }
    }
}