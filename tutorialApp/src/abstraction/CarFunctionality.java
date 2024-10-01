package abstraction;

public class CarFunctionality implements Car{

	@Override
	public void carEngine() {
		System.out.println("Engine Works Done and Ready to Start...!!!");
	}

	@Override
	public void carAC() {
		System.out.println("AC Work is Completed and ready to use....!!!");
	}

}
