import java.util.ArrayList;

public class Main {
  static public void main(String args[]) {
    Animal rabbit1 = new Animal("Rabbit", 23);
    rabbit1.Greeting();
    Somme somme = new Somme(12, 24);
    System.out.println(somme.Sum());
    Student student1 = new Student("kara oussama", 20, 15);
    student1.show();
    Complex complex1 = new Complex(-1, -4, -2, -3);
    complex1.Somme();
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(23);
    numbers.add(42);
    numbers.add(12);
    numbers.add(15);
    numbers.add(35);
    numbers.add(62);
    numbers.add(25);
    Max maxCalc = new Max(numbers);
    int maxNumber = maxCalc.maxNumber();
    System.out.println("Max number is: " + maxNumber);
    char character = 'A';
    Ascii ascii = new Ascii(character);
    System.out.println("Decimal value of " + character + " is: " + ascii.Decimal());
    FileSize fileSize = new FileSize();
    long Sizefile = fileSize.SizeOfFile("./Animal.java");
    System.out.println("The size of this file is : " + Sizefile + " Byte");
    Pgcd pgcd = new Pgcd();
    int p = pgcd.calculPgcd(11, 22);
    System.out.println("The pgcd of this 2 numbers is: " + p);

    Prime prime = new Prime();
    boolean isPrimeNum = prime.isPrime(2);
    if (isPrimeNum) {
      System.out.println("That number is a Prime number");
    } else {
      System.out.println("That number is Not Prime number");
    }
    Factoriel factoriel = new Factoriel();
    int res = factoriel.factoriel(5);
    System.out.println("Factoriel result of this number is " + res);
    Fibonacci fibonacci = new Fibonacci();
    fibonacci.calcul(6);
    Recurcive recurcive = new Recurcive();
    boolean isRecurcive = recurcive.exec("javavaj");
    System.out.println(isRecurcive);
    Languages languages = new Languages();
    languages.addLanguage("java");
    languages.addLanguage("PHP");
    languages.addLanguage("Python");
    languages.addLanguage("C++");
    String[] langs = {"Go","Rust","JavaScript","TypeScript"};
    languages.addLanguages(langs);
    languages.showLanguges();
  }
}
