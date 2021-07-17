import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println(choice.replaceAll("word", "letter"));
    }
}
