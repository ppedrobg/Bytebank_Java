
public class testaMetodo {
	 public static void main(String[] args) {
         conta contadoPedro = new conta();
         contadoPedro.saldo = 100;
         contadoPedro.deposita(50);
         System.out.println(contadoPedro.saldo);

         boolean conseguiuRetirar = contadoPedro.saca(20);
         System.out.println(contadoPedro.saldo);
         System.out.println(conseguiuRetirar);

         conta contaDaMarcela = new conta();
         contaDaMarcela.deposita(1000);

         boolean sucessoTransferencia = contaDaMarcela.transfere(300, contadoPedro);
         if(sucessoTransferencia) {
             System.out.println("transferencia com sucesso");
         } else {
             System.out.println("faltou dinheiro");

         }
         System.out.println(contaDaMarcela.saldo);
         System.out.println(contadoPedro.saldo);


         contadoPedro.titular = "pedro henrique";
         System.out.println(contadoPedro.titular);

     }

}
