package chap11.section2;

import java.io.FileNotFoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;

public class MultiCatch {
    public static void f() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
    public static void g() throws SQLException {
        throw new SQLException();
    }
    public static void h() throws NumberFormatException {
        throw new NumberFormatException();
    }

    public static void main(String[] args) {
        try {
            f();
            g();
            h();
        } catch (FileNotFoundException | SQLException ex) {
            // 多重catch中异常变量是final的
//            ex = new FileNotFoundException();
            // 可以使用再次抛出异常的方式，有两种方式
            // 第一种
//            throw new RemoteException(ex.getMessage());
            // 第二种
//            Throwable rx = new RemoteException("error");
//            rx.initCause(ex);
//            throw rx;
            // 可使用rx.getCause()获得原始异常
        } catch (NumberFormatException ex) {
            // 单重catch中没有这样的限制
            ex = new NumberFormatException();
        }
    }
}
