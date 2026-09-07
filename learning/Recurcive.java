class Recurcive {
  boolean exec(String word) {
    boolean isRecursive = true;
    char c1, c2;

    for (int i = 0, j = word.length() - 1; i <= j; i++, j--) {
      c1 = word.charAt(i);
      c2 = word.charAt(j);

      if (c1 != c2) {
        isRecursive = false;
      }
    }
    return isRecursive;
  }
}
