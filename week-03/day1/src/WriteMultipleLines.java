// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {



  public static void main(String[] args) {

    String word;
    String path;
    int numberOfLines;
    path = getWord();
    word = getWord();
    numberOfLines = getNumber();

    writeFile(path, word, numberOfLines);

  }

  private static void writeFile(String path, String word , int numberOfLines) {

    List<String> multiLine = new ArrayList();
    for (int i = 0; i < numberOfLines; i++) {
      multiLine.add(word);
    }

    try {
      Path filePath = Paths.get(path);
      Files.write(filePath, multiLine);
      System.out.println(Files.readAllLines(filePath));
      } catch (Exception e) {
        System.out.println("Oops!");
      }

    }


  private static int getNumber() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number that defines how often you'd like to add your word!");
    return scanner.nextInt();
  }

  private static String getWord() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the word you would like to add to your list");
    return scanner.nextLine();
  }


}
