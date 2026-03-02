public class UC6 {

    public static void main(String[] args) {

        String[] o = generateO();
        String[] p = generateP();
        String[] s = generateS();

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "   " + p[i] + "   " + s[i]);
        }
    }

    public static String[] generateO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    public static String[] generateP() {
        return new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
    }

    public static String[] generateS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
}