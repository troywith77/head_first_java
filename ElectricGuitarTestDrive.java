class ElectricGuitar {
  String brand;
  int numOfPickups;
  boolean rockStarUsesIt;

  String getBrand() {
    return brand;
  }

  void setBrand(String aBrand) {
    brand = aBrand;
  }

  int getNumOfPickups() {
    return numOfPickups;
  }

  void setNumOfPickups(int num) {
    numOfPickups = num;
  }

  boolean getRockStarUsesIt() {
    return rockStarUsesIt;
  }

  void setRockStarUsesIt(boolean yesOrNo) {
    rockStarUsesIt = yesOrNo;
  }
}

public class ElectricGuitarTestDrive {
  public static void main (String[] args) {
    ElectricGuitar electricGuitar = new ElectricGuitar();
    electricGuitar.setBrand("YAMAHA");
    System.out.println(electricGuitar.getBrand());
  }
}