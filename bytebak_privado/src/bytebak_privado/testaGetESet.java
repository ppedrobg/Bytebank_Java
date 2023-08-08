package bytebak_privado;

public class testaGetESet {
	
	public static void main(String[] args) {
		conta conta = new conta();
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
	}

}