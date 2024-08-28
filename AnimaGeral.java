package Aula28_08;

public class AnimaGeral {

	public static void main(String[] args) {
		Lobsx lob = new Lobsx();
		Leao le = new Leao();
		Tigre tri = new Tigre();
		Caochorro cao = new Caochorro();
		Gatx gat = new Gatx();
		
		lob.setNome("Lobo");
		lob.setSexo("M");
		lob.setRaca("Sla");

		le.setNome("Leão");
		le.setSexo("F");
		le.setRaca("N sei");

		tri.setNome("Trigue");
		tri.setSexo("M");
		tri.setRaca("Branco");

		cao.setNome("Cãochorro");
		cao.setSexo("F");
		cao.setRaca("Puddle");

		gat.setNome("Gato");
		gat.setSexo("F");
		gat.setRaca("Siames");

		System.out.println("------------LOBO------------");
		System.out.println(lob.getNome());
		System.out.println(lob.getSexo());
		System.out.println(lob.getRaca());
		lob.dormir();
		lob.caminhar();
		lob.correr();
		lob.emitirSom();
		
		System.out.println("------------LEAO------------");
		System.out.println(le.getNome());
		System.out.println(le.getSexo());
		System.out.println(le.getRaca());
		le.dormir();
		le.caminhar();
		le.correr();
		le.emitirSom();

		System.out.println("------------TIGRE-----------");
		System.out.println(tri.getNome());
		System.out.println(tri.getSexo());
		System.out.println(tri.getRaca());
		tri.dormir();
		tri.caminhar();
		tri.correr();
		tri.emitirSom();

		System.out.println("----------CACHORRO---------");
		System.out.println(cao.getNome());
		System.out.println(cao.getSexo());
		System.out.println(cao.getRaca());
		cao.dormir();
		cao.caminhar();
		cao.correr();
		cao.emitirSom();

		System.out.println("------------GATO------------");
		System.out.println(gat.getNome());
		System.out.println(gat.getSexo());
		System.out.println(gat.getRaca());
		gat.dormir();
		gat.caminhar();
		gat.correr();
		gat.emitirSom();

	}

}
