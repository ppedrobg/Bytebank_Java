package bytebak_privado;

public class TestaValores {

	public static void main(String[] args) {
		conta conta = new conta(1337, 24226);
		
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1232123);

	}

}
