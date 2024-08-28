package Aula28_08;

public class PrincipalV {

	public static void main(String[] args) {
		Carrow car = new Carrow();
		Onibus bus = new Onibus();
		
		System.out.println("-------ONIBUS-------");
		bus.acelerar();
		bus.frear();
		bus.ligar();
		bus.virar();
	
		System.out.println("-------CARRO-------");
		car.acelerar();
		car.frear();
		car.ligar();
		car.virar();
	}

}
