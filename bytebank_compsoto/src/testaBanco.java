
public class testaBanco {

	public static void main(String[] args) {
		cliente pedro = new cliente();
		pedro.nome = "Pedro Henrique";
		pedro.cpf = "222.222.222-22";
		pedro.profissao = "programador";
		
		conta contadoPedro = new conta();
		contadoPedro.deposita(100);
		
		contadoPedro.titular = pedro;
		System.out.println(contadoPedro.titular.nome);
	}

}
