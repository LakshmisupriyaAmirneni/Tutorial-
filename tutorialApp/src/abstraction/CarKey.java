package abstraction;

public class CarKey {
	
	public Car enterIntoCar() {
		Car car=new CarFunctionality();
		return car;
	}
	
	public static void main(String[] args) {
		CarKey carKey=new CarKey();
		Car car = carKey.enterIntoCar();
		car.carEngine();
		car.carAC();
	}
}
