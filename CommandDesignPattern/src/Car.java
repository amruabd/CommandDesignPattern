public class Car {
  int speed;
  String carName;
  boolean isCarOn;

  Car(){
    carName = " ";
    speed = 0;
    isCarOn = false;
  }

  public void startTheCar(){
    this.isCarOn = true;
  }

  public void stopTheCar(){
    this.isCarOn = false;
  }

  public void changeSpeed(int speed){
    this.speed = speed;
  }

  public void setCarName(String carName){
    this.carName = carName;
  }
}
