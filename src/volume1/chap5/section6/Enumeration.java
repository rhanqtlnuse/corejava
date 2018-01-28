package chap5.section6;

public class Enumeration {
    public static void main(String[] args) {
        Size[] sizes = Size.values();
        for (Size s : sizes) {
            System.out.println(s);
        }
        System.out.println(Size.LARGE.toString());
        System.out.println(Enum.valueOf(Size.class, "SMALL"));
        System.out.println(Size.valueOf("SMALL"));
        System.out.println(Size.LARGE.ordinal());

        System.out.println(Size.MEDIUM.getAbbreviation());

        System.out.println(Size.MEDIUM.compareTo(Size.SMALL));
        System.out.println(Size.MEDIUM.compareTo(Size.LARGE));
        System.out.println(Size.MEDIUM.compareTo(Size.MEDIUM));
    }
}
