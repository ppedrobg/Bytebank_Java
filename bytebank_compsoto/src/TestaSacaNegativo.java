
public class TestaSacaNegativo {
	public static void main(String[] args) {
		conta conta = new conta();
		conta.deposita(100);
		System.out.println(conta.saca(200));
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo());
	}

}
