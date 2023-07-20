
public class testaReferencias {
	public static void main(String[] args) {
        conta primeiraconta = new conta();
        primeiraconta.saldo = 300;
        System.out.println("saldo da primeira conta " + primeiraconta.saldo);

        conta segundaconta = primeiraconta;

        System.out.println("saldo da segunda conta: " + segundaconta.saldo);

        segundaconta.saldo += 100;
        System.out.println("saldo da segunda conta: " + segundaconta.saldo);

        System.out.println(primeiraconta.saldo);

        if (primeiraconta == segundaconta){
            System.out.println("mesma conta");
        }else {
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraconta);
        System.out.println(segundaconta);




    }

}
