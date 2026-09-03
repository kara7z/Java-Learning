class Pgcd {
  int calculPgcd(int number1, int number2) {
    int minN = (number1 < number2 ? number1 : number2);
    int pgcd = 0;
    for (int i = 1; i <= minN; i++) {
      if (number1 % i == 0 && number2 % i == 0) {
        pgcd = i;
      }
    }
    return pgcd;

  }
}
