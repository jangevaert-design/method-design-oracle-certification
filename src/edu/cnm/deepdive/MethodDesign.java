package edu.cnm.deepdive;

public class MethodDesign {

  public void jump() {}

//void public jump2() {} 1) identifier is expected and 2) we don't have a return type on the correct place.

  void jump3() {}//doesn't specify the access modifier which means it uses the default one or
  //also called package-private but compiles.

  public final void jump4() {}

  public static final void jump5() {} //we have two optional specifiers but a static method cannot
  //be final. From syntax perspective this method will compile.

  public final static void jump6() {}//the order doesn't matter for the specifiers as long as the return
  //type is just in front of the method name.

  //public modifier void jump7() {} will not compile because modifier is not a key word.

  //public String void jump8() {} two return types so won't compile.

  final public void jump9() {} //will compile but is not good practice

}
