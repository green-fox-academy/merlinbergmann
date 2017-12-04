// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

public class CopyFile {
  public static void main(String[] args) {

    String fileName1;
    String fileName2;
    
    Boolean copySuccess;

    fileName1 = getFileName();
    fileName2 = getFileName();
    copyFile(fileName1, fileName2);
    copySuccess = checkIfCopied();
  }

  private static Boolean checkIfCopied() {
  }

  private static void copyFile(String fileName1, String fileName2) {
  }

  private static String getFileName() {
  }
}
