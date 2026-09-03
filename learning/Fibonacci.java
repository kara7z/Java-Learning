class Fibonacci {
  int[] calcul(int number) {
    int[] res = new int[number];
    res[0] = 0;

    res[1] = 1;

    for (int i = 2; i < number; i++) {
      res[i] = res[i - 1] + res[i - 2];
      System.out.println(res[i]);
    }
    return res;
  }
}
