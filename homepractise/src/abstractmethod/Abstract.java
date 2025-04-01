package abstractmethod;

public abstract class Abstract {
abstract void sound();
void show()
{
	System.out.println("the animals is:");
}
}

class lion extends Abstract{

	@Override
	void sound() {
		System.out.println( "lion is roar:");
	}
	
}
 
class tiger extends Abstract{

	@Override
	void sound() {
		System.out.println("the tiger is owww:");
	}
	
}
