
public class testaMetodo {
	 public static void main(String[] args) {
         conta contaDoPedro = new conta();
         contaDoPedro.saldo = 100;
         contaDoPedro.deposita(50);
         System.out.println(contaDoPedro.saldo);

         boolean conseguiuRetirar = contaDoPedro.saca(20);
         System.out.println(contaDoPedro.saldo);
         System.out.println(conseguiuRetirar);

         conta contaDaMarcela = new conta();
         contaDaMarcela.deposita(1000);

         boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPedro);
         if(sucessoTransferencia) {
             System.out.println("transferencia com sucesso");
         } else {
             System.out.println("faltou dinheiro");

         }
         System.out.println(contaDaMarcela.saldo);
         System.out.println(contaDoPedro.saldo);


         contaDoPedro.titular = "pedro henrique";
         System.out.println(contaDoPedro.titular);

     }

}
