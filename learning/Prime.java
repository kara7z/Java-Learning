class Prime {
  boolean isPrime(int number) {
    boolean isPrime = true;
    for (int i = 1; i <= number / 2; i++) {
      if ((number % i == 0 && i != 1) || number <= 1) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }
}
