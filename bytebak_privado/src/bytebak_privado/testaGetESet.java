package bytebak_privado;

public class testaGetESet {
	
	public static void main(String[] args) {
		conta conta = new conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		cliente pedro = new cliente();
		//conta.titular = pedro;
		pedro.setNome("Pedro Henrique");
		
		conta.setTitular(pedro);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		
	}

}