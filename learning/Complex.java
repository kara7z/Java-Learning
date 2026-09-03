class Complex {
  double reel1, imaginair1;
  double reel2, imaginair2;

  Complex(double r1, double i1, double r2, double i2) {
    this.reel1 = r1;
    this.imaginair1 = i1;
    this.reel2 = r2;
    this.imaginair2 = i2;
  }

  void Somme() {
    double r = this.reel1 + this.reel2;
    double i = this.imaginair1 + this.imaginair2;
    char space = ' ';
    char sing;
    if (i > 0) {
      sing = '+';
    }
    else{
      sing= '-';
    }
    System.out.println("La somme est " + r + space + sing + space + Math.abs(i) + "i");
  }
}
