package chap13.section5;

import java.util.Arrays;
import java.util.BitSet;

public class BitSetTest {
     public static void main(String[] args) {
         BitSet b = new BitSet(32);
         b.set(1);
         b.set(3);
         b.set(5);
         System.out.println(Arrays.toString(b.toByteArray()));
     }
}
