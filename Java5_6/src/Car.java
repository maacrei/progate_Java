public class Car extends Vehicle {
	private int fuel = 50;

	  public int getFuel() {
	    return this.fuel;
	  }

	// superを用いて、以下の重複部分を書き換えてください
	  public void printData() {
	    super.printData(); //　親クラスのメソッド
	    System.out.println("ガソリン量：" + this.getFuel() + "L");
	  }

	  public void charge(int litre) {
	    System.out.println(litre + "L給油します");
	    if (litre <= 0) {
	      System.out.println("給油できません");
	    } else if (litre + this.fuel >= 100) {
	      System.out.println("満タンまで給油します");
	      this.fuel = 100;
	    } else {
	      this.fuel += litre;
	    }
	    System.out.println("ガソリン量：" + this.fuel + "L");
	  }
}
