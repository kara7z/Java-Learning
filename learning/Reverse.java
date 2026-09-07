import java.util.ArrayList;
import java.util.List;

class Reverse {

  ArrayList<Integer> Numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));

  // method 1
  void reverse1() {
    ArrayList<Integer> reversed = new ArrayList<>();
    for (Integer i : Numbers) {
      System.out.println(i);
      reversed.add(Numbers.get(Numbers.size() - i));
    }
    for (int i = 0; i < Numbers.size(); i++) {
      Numbers.set(i, reversed.get(i));
    }
    System.out.println(Numbers);
  }

  // method 2
  void reverse() {
    ArrayList<Integer> temp = new ArrayList<>(Numbers);
    for (int i = 0; i < Numbers.size(); i++) {
      Numbers.set(i, temp.get(Numbers.size() - i - 1));
    }
    System.out.println(Numbers);
  }

  // method 3
  void reverse2() {
    ArrayList<Integer> temp = new ArrayList<>(Numbers);
    for (int i = Numbers.size() - 1, j = 0; i >= 0; i--, j++) {
      Numbers.set(j, temp.get(i));
    }
    System.out.println(Numbers);
  }
}
