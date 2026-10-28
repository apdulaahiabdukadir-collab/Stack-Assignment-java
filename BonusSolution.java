import java.util.Stack;

public class BonusSolution {

    public String removeTriples(String s) {
        Stack<Character> chars = new Stack<>();
        Stack<Integer> counts = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!chars.isEmpty() && chars.peek() == ch) {
                counts.push(counts.pop() + 1);
            } else {
                chars.push(ch);
                counts.push(1);
            }

            if (counts.peek() == 3) {
                chars.pop();
                counts.pop();
            }
        }

        StringBuilder result = new StringBuilder();

        while (!chars.isEmpty()) {
            char ch = chars.pop();
            int count = counts.pop();

            for (int i = 0; i < count; i++) {
                result.append(ch);
            }
        }

        return result.reverse().toString();
    }
}