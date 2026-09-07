import java.util.ArrayList;
import java.util.List;

class RemoveIndex {
  ArrayList<String> langues = new ArrayList<>(List.of("java", "python", "haha", "ja"));

  void removeLanguage(int index) {
    langues.remove(index);
  }

}
