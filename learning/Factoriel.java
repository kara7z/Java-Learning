class Factoriel {

  int factoriel(int number) {
    int result = 1;
    if (number > 1) {
      for (int i = 1; i <= number; i++) {
        result *= i;
      }
    } else {
      result = -1;
    }
    return result;
  }
}
