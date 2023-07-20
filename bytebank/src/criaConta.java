
public class criaConta {
	public static void main(String[] args) {
        conta primeiraconta = new conta();
        primeiraconta.saldo = 200;
        System.out.println(primeiraconta.saldo);

        primeiraconta.saldo += 100;
        System.out.println(primeiraconta.saldo);


         conta segundaConta = new conta();
         segundaConta.saldo = 300;
        System.out.println("primeira conta tem " + primeiraconta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);

        segundaConta.agencia = 146;
        System.out.println(primeiraconta.agencia);
        System.out.println(primeiraconta.numero);

        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta esta " + "na agencia " + segundaConta.agencia);
        if (primeiraconta == segundaConta){
            System.out.println("mesma conta");
        }else {
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraconta);
        System.out.println(segundaConta);
    }


}
