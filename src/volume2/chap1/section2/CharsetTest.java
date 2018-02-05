package volume2.chap1.section2;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

public class CharsetTest {
    public static void main(String[] args) {
        Charset cset = Charset.forName("UTF-8");
        Set<String> aliases = cset.aliases();
        for (String alias : aliases) {
            System.out.println(alias);
        }

        Map<String, Charset> charsets = cset.availableCharsets();
        for (Map.Entry<String, Charset> entry : charsets.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
