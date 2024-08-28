package Aula28_08;

public class Compuabjetos {

	public static void main(String[] args) {
		Computador2 gamer = new Computador2();
		Computador2 home = new Computador2();
		
		System.out.println("Computador Gamer");
		gamer.ligar();
		gamer.reiniciar();
		gamer.desligar();
		gamer.carregandoSistema();
		System.out.println("----------------------------------");
		
		System.out.println("Computador Home");
		home.ligar();
		home.reiniciar();
		home.desligar();
		home.carregandoSistema();
	}

}
