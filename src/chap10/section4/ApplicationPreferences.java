package chap10.section4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.prefs.Preferences;

public class ApplicationPreferences {
    public static void main(String[] args) {
        Properties settings = new Properties();
        settings.put("width", "200");
        settings.put("title", "hello world");

        try {
            FileOutputStream out = new FileOutputStream("settings.property");
            settings.store(out, "comment");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            FileInputStream in = new FileInputStream("settings.property");
            Properties settings2 = new Properties();
            settings2.load(in);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String userDirectory = System.getProperty("user.home");
        System.out.println(userDirectory);

        Properties systemProperties = System.getProperties();
        try {
            FileOutputStream out = new FileOutputStream("sys_properties.property");
            systemProperties.store(out, "comment");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

//        Preferences node = Preferences.userNodeForPackage(ArrayList.class);
//        try {
//            node.exportNode(System.out);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        try {
            Preferences node = Preferences.userNodeForPackage(ArrayList.class);
            node.importPreferences(System.in);
            node.exportNode(System.out);
        } catch (Exception ex) {

        }
    }
}