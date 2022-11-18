package hw2.PC;



public class Main {
    public static void main(String[] args) {
      Laptop laptop = new Laptop();
      Workstation workstation = new Workstation();
      Ultrabook ultrabook = new Ultrabook();
      laptop.setProcessor("AMD");
      System.out.println(laptop.getProcessor());
      workstation.setRam("joihtrnk");
      System.out.println(workstation.getRam());
      ultrabook.setTouchpad(true);
      System.out.println(ultrabook.isTouchpad());
    }
}
