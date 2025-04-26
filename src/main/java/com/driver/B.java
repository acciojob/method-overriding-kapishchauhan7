package com.driver;
class B extends A {
   public String meth() {
    return "Method is overridden in Extended class B";
  }
  public String printA() {
    return super.meth();
  }
}
