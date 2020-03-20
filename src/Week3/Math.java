package Week3;

public class Math {
	public Complex add(Complex cmp1, Complex cmp2) {
		Complex tmp = new Complex(0,0);
		tmp.setReal(cmp1.getReal() + cmp2.getReal());
		tmp.setVirtual(cmp1.getVirtual() + cmp2.getVirtual());
		return tmp;
	}
	public Complex sub(Complex cmp1, Complex cmp2) {
		Complex tmp = new Complex(0,0);
		tmp.setReal(cmp1.getReal() - cmp2.getReal());
		tmp.setVirtual(cmp1.getVirtual() - cmp2.getVirtual());
		return tmp;
	}
	public Complex mul(Complex cmp1, Complex cmp2) {
		Complex tmp = new Complex(0,0);
		tmp.setReal(cmp1.getReal() * cmp2.getReal() - cmp1.getVirtual() * cmp2.getVirtual());
		tmp.setVirtual(cmp1.getReal() * cmp2.getVirtual() + cmp1.getVirtual() * cmp2.getReal());
		return tmp;
	}
	public Complex div(Complex cmp1, Complex cmp2) {
		Complex tmp = new Complex(0,0);
		tmp.setReal((cmp1.getReal() * cmp2.getReal() + cmp1.getVirtual() * cmp2.getVirtual()) / (cmp2.getReal() * cmp2.getReal() + cmp2.getVirtual() * cmp2.getVirtual()));
		tmp.setVirtual((cmp1.getVirtual() * cmp2.getReal() + cmp1.getReal() * cmp2.getVirtual()) / (cmp2.getReal() * cmp2.getReal() + cmp2.getVirtual() * cmp2.getVirtual()));
		return tmp;
	}
	public void print(Complex cmp) {
		double real = cmp.getReal(), virtual = cmp.getVirtual();
		if(!(real == 0.0 && virtual == 0.0)) System.out.println(real + (virtual >= 0 ? "+" : "") + virtual + "i");
		else System.out.println("Error");
	}
}
