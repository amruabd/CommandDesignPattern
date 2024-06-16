public class ChangeSpeed extends Command{
  Car car;
  int speed;

  ChangeSpeed(Car car, int speed){
    this.car = car;
    this.speed = speed;
  }

  public void execute(){
    car.changeSpeed(speed);
    System.out.println("changed speed to " + speed + "km/h successfully");
  }
}
