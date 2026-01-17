package basic;

class AbstractExample {
	public static void main(String[] args) {
		ArithmaticOperation feature = new Implimentation();
		double op = feature.square(5);
		System.out.println(op);
	}
}
abstract class ArithmaticOperation {
	public abstract double square(double num);
}
class Implimentation extends ArithmaticOperation {
	@Override
	public double square(double num) {
		double output = num * num;
		return output;
	}
}