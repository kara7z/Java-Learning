import java.util.ArrayList;

class Languages {
  ArrayList<String> languages = new ArrayList<>();

  void showLanguges() {
    for (String l : languages) {
      System.out.println(l);
    }
  }

  void addLanguage(String language) {
    languages.add(language);
  }

  void addLanguages(String[] Languages) {
    for (String l : Languages) {
      languages.add(l);
    }
  }
}
