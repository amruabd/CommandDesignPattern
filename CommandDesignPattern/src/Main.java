/*
* You are tasked with designing a simple car control application that can issue commands to control a car. The car can
* perform the following actions:
* start, stop, and change speed.
* Your task is to implement this functionality using the Command Design Pattern.
*/


/*
* Command Design Pattern Components
1. Invoker (Class that has a method to execute commands) (Done)
2. Receiver (Car class) (Done)
3. Command interface with execute method
4. Commands classes (one per command)
* */

public class Main {
  public static void main(String[] args) {
    Car myCar = new Car();
    Invoker invoker = new Invoker();

    // Start the car
    Command startCommand = new StartTheCar(myCar);
    invoker.setCommand(startCommand);
    invoker.executeCommand();

    // Change speed
    Command changeSpeedCommand = new ChangeSpeed(myCar, 60);
    invoker.setCommand(changeSpeedCommand);
    invoker.executeCommand();

    // Stop the car
    Command stopCommand = new StopTheCar(myCar);
    invoker.setCommand(stopCommand);
    invoker.executeCommand();
  }
}
