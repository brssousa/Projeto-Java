
public class Condicional {

	public static void main(String[] args) {
		int idade = 13;
		int pessoas = 2;
		boolean acompanhado = pessoas >= 2;
		
		if (idade >= 18 || acompanhado) {
			
			System.out.println("Ola, voce pode entrar");
			
		} else {
			
			System.out.println("Desculpe, mas voce não pode entrar.");
			
		}

	}

}
