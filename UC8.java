import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Centralized Character Pattern Storage
    private static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();

        String word = "OOPS";
        renderBanner(word);
    }

    // Method to initialize character patterns
    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    // Render function using nested loops
    private static void renderBanner(String word) {

        int patternHeight = 5;

        for (int row = 0; row < patternHeight; row++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                } else {
                    System.out.print("        ");
                }
            }

            System.out.println();
        }
    }
}