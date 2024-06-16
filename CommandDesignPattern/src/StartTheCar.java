public class StartTheCar extends Command{

  Car car;
  StartTheCar(Car car){
    this.car = car;
  }

  public void execute(){
    car.startTheCar();
    System.out.println("The car started successfully ");
  }
}
