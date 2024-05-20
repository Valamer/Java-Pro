import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UserInteraction {
    static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("Please choose one of the following options:");
        System.out.println("1. Analyse text file");
        System.out.println("2. Change configurations");
        System.out.println("3. Exit");
        while (true) {
            String choice = scanner.next();
            switch (choice) {
                case "1" -> {
                    analyseText();
                    menu();
                }
                case "2" -> {
                    changeConfigs();
                    menu();
                }
                case "3" -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid choice. Please, enter number 1, 2 or 3.");
                }
            }
        }
    }

    public static void changeConfigs () {
        File configs = new File("Config.txt");
        configs.delete();
        System.out.println("Enter how many most usable words to display");
        FileOperations.writeToFile(configs.getPath(),scanner.nextInt() + "");
        System.out.println("Ignore words with length less then 2 characters (in top of most usable words)?");
        FileOperations.writeToFile(configs.getPath(),scanner.nextBoolean() + "");
    }

    public static void analyseText () {
        System.out.println("Please enter the name of the text file, or type \"back\" to return:");
        String input = scanner.next();
        if (input.equals("back") || input.equals("b")) { return; }
        try {
            TextProcessing.analyse(input);
        } catch (FileNotFoundException e) {
            System.out.println("File not exists. Please try again.");
            analyseText();
        } catch (IOException e) {
            System.out.println("Something went wrong during reading file");
            analyseText();
        }
    }
}
