package util;

import java.util.Scanner;

public class Utility {

    public void runWordComparison() {
        System.out.println("START");
        String word;
        String anotherWord = addItemFromKeybord();
        do {
            word = anotherWord;
            anotherWord = addItemFromKeybord();
        } while (!anotherWord.equals(word));
        System.out.println("END");
    }

    private String addItemFromKeybord() {

        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
