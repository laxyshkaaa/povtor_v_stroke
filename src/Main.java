import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите какую нибудь  строку: ");
        String input = in.nextLine();

        Pattern pattern = Pattern.compile("\\b(\\w+)\\b(?=.*\\b\\1\\b)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find())
        {
            input = input.replaceAll("\\b" + matcher.group() + "\\b", "<strong>" + matcher.group() + "</strong>");
        }
        System.out.println(input);
    }
}