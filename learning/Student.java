class Student {
  String Name;
  int grad1, grad2;

  Student(String Name, int grad1, int grad2) {
    this.grad1 = grad1;
    this.grad2 = grad2;
    this.Name = Name;
  }

  double arg_grade() {
    return (grad1 + grad2) / 2;
  }

  void show() {
    System.out.println(this.Name + ", Avg grade: " + arg_grade());
  };
}
