package Week3;

public class Complex {
	private double real, virtual;

	public Complex() {

	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getVirtual() {
		return virtual;
	}

	public void setVirtual(double virtual) {
		this.virtual = virtual;
	}

	public Complex(double real, double virtual) {
		this.real = real;
		this.virtual = virtual;
	}
}
