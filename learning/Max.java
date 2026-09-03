import java.util.ArrayList;

class Max {
  ArrayList<Integer> Numbers;

  Max(ArrayList<Integer> Numbers) {
    this.Numbers = Numbers;
  }

  int maxNumber() {
    int max = this.Numbers.get(0);
    for (int i = 0; i < this.Numbers.size(); i++) {
      if (max < this.Numbers.get(i)) {

        max = this.Numbers.get(i);
      }
    }
    return max;
  }
}
