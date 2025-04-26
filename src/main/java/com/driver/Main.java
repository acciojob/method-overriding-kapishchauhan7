package com.driver;

public class Main {
  public static void main(String... s) {
    B b = new B();
    b.printA();
    b.meth();
  }
}

class A {
  public String meth() {
    return "Invoking method from class A";
  }
}

class B extends A {
   public String meth() {
    return "Method is overridden in Extended class B";
  }
  public String printA() {
    super.meth();
  }
}
