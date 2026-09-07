import java.util.ArrayList;
import java.util.List;

class Troiseme {
   ArrayList<String> langues = new ArrayList<>(List.of("PHP", "Java", "C++", "Python"));
  
  String getThird(){
    return langues.get(2);
  }
}
