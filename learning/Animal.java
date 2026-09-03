public class Animal {
  String Name;
  int Age;

  Animal(String Name, int Age) {
    this.Name = Name;
    this.Age = Age;
  };

  void Greeting() {
    System.out.println("this is " + this.Name + ", A good Animal and his Age is " + this.Age);
  }
}
