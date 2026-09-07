import java.util.ArrayList;
import java.util.List;

class Languages {
  ArrayList<String> langues = new ArrayList<>(List.of("PHP", "Java", "C++", "Python"));

  void showLanguages() {
    System.out.println(langues);
    langues.remove("PHP");
    for (String l : langues) {
      System.out.println(l);
    }
  }
}
