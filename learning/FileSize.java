import java.io.File;

class FileSize {

  long SizeOfFile(String fileName) {
    String fileFullPath = new File(fileName).getAbsolutePath();
    File file = new File(fileFullPath);
    if (file.isFile() && file.exists()) {
      return file.length();
    } else {
      return -1;
    }
  }
}
