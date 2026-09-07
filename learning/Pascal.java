import java.util.ArrayList;

class Pascal {
  ArrayList<String> langs = new ArrayList<>();

  void addLanguages(ArrayList<String> languages) {
    langs.addAll(languages);

  }

  void showLanguages() {
    System.out.println(langs);
  }

  void addInFront(String langue) {
    langs.add(0, langue);
  }
}
