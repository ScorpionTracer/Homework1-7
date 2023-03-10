public class MainClass {
  public static void main(String[] args) {
    var catOne = new Cat("Barsik", 5, false);
    var plateOne = new Plate(105);
    System.out.println(plateOne.toString());
    if (catOne.checkPlate(catOne.getAppetite(), plateOne.getFood())) {
      catOne.eat(plateOne);
      catOne.setFullAppetite(true);
    }
    System.out.println(plateOne.toString());
    var catArray = new Cat[3];
    catArray[0] = new Cat("Pidor", 15, false);
    catArray[1] = new Cat("Nepidor", 7, false);
    catArray[2] = new Cat("Superpidor", 30, false);
    var plateTwo = new Plate(50);
    for (Cat cat : catArray) {
      if (cat.checkPlate(cat.getAppetite(), plateTwo.getFood())) {
        cat.eat(plateTwo);
        cat.setFullAppetite(true);
      }
      System.out.format("Cat %s fullappetite: %b\n", cat.getName(), cat.isFullAppetite());
    }
    plateTwo.addFood(10);
    System.out.println(plateTwo.toString());
    var catUltrapidor = new Cat("Ultrapidor",100,false);
    catUltrapidor.eat(plateTwo);
  }
}
