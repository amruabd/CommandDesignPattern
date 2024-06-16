public class StopTheCar extends Command{

  Car car;
  StopTheCar(Car car){
    this.car = car;
  }
  public void execute(){
    car.stopTheCar();
    System.out.println("Car stopped");
  }
}
