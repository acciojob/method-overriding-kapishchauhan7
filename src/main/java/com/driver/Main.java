package com.driver;

public class Main {
  public static void main(String... s) {
    B b = new B();
    b.printA();
    b.meth();
  }
}

class B extends A {
   public String meth() {
    return "Method is overridden in Extended class B";
  }
  public String printA() {
    return super.meth();
  }
}
