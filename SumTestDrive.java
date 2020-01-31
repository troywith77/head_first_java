class Adder {
  void sum(int a, int b) {
    int c = a + b;
    System.out.println("Total is " + c);
  }
}

public class SumTestDrive {
  public static void main (String[] args) {
    Adder adder = new Adder();
    adder.sum(1, 2);
  }
}