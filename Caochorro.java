package Aula28_08;

public class Caochorro extends AnimalsAbs{
	
	@Override
	public void dormir() {
		System.out.println("Dorminon");
	}
	@Override
	public void caminhar() {
		System.out.println("Caminhandon");
	}
	@Override
	public void correr() {
		System.out.println("Correndon");
	}
	@Override
	public void emitirSom() {
		System.out.println("Latindo");
	}
}
