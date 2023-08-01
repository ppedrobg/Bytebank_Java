
public class testaBanco {

	public static void main(String[] args) {
		cliente pedro = new cliente();
		pedro.nome = "Pedro Henrique";
		pedro.cpf = "222.222.222-22";
		pedro.profissao = "programador";
		
		conta contaDoPedro = new conta();
		contaDoPedro.deposita(100);
		
		contaDoPedro.titular = pedro;
		System.out.println(contaDoPedro.titular.nome);
	}

}
