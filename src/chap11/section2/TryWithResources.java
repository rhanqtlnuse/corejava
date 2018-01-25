package chap11.section2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String tmp;
            while ((tmp = reader.readLine()) != null) {
                System.out.println(tmp);
            }
        } catch (Exception ex) {
            System.out.println("catch block executed");
        } finally {
            System.out.println("finally executed");
        }
    }
}