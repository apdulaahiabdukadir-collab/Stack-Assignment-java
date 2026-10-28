import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Solution solution = new Solution();
        BonusSolution bonus = new BonusSolution();

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        String result = solution.removeDuplicates(s);

        System.out.println("After removing pairs: " + result);

        System.out.print("Enter a string for bonus: ");
        String s2 = input.nextLine();

        String bonusResult = bonus.removeTriples(s2);

        System.out.println("After removing triples: " + bonusResult);

        input.close();
    }
}