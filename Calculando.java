package Aula28_08;

public class Calculando implements Calculos {
	
	@Override
	public double somar() {
	return 1+2;
	}
	@Override
	public double sub() {
	return 1-2;
	}
	@Override
	public double mult() {
	return 1*2;
	}
	@Override
	public int div() {
	return 1/2;
}
	@Override
	public int exp() {
		return 2*2*2;
	}
}
