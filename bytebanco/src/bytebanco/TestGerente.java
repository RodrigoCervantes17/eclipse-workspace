package bytebanco;

public class TestGerente {

	public static void main(String[] args) {
		//Gerente Juancho = new Gerente();
		Gerente Juancho = new Gerente();
		
		Juancho.setSalario(5000.0);
		Juancho.setContraseña(529423);
		System.out.println(Juancho.autenticar(529423));
		System.out.println(Juancho.getBonificacion());
}
}
