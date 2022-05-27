class Person {
  public static void printData(String firstName, String lastName, int age) {
    System.out.println("名前は" + firstName + " " + lastName + "です");
    System.out.println("年齢は" + age + "歳です");
    if (age >= 20)
    {
      System.out.println("成年者です");
    } else {
      System.out.println("未成年者です");
    }
  }
}