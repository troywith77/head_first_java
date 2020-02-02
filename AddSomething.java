public class AddSomething {
  // instance variables is automatically initialized with a value
  // int -> 0
  // boolean -> false
  // object -> null
  public int a;
  public int b = 100;

  public static void main(String[] args) {
    AddSomething adder = new AddSomething();
    adder.add();
  }

  public void add() {
    int z = a + b;
    // int z;
    // here z is a local variable, it doesn't have a default value
    System.out.println("a + b = " + z);
  }
}