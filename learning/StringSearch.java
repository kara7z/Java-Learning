import java.util.ArrayList;
import java.util.List;

class StringSearch {
  ArrayList<String> languages = new ArrayList<>(List.of("PHP", "Java", "C++", "Python"));

  boolean Search(String name) {
    for (int i = 0; i < languages.size(); i++) {
      if (languages.get(i) == name)
        return true;
    }
    return false;
  }
}
