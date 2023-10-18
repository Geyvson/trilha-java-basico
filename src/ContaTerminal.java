import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a class scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada.

        Scanner scan = new Scanner(System.in);
      
        System.out.println("Por favor, Digite o número da Agência: ");
        String agencia = scan.nextLine();

        System.out.println("Digite o número da Conta: ");
        int conta = scan.nextInt();

        System.out.println("Saldo: ");
        float saldo = scan.nextFloat();

        System.out.println("Seu nome completo: ");
        String nome = scan.next();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já esta disponível para saque");

        scan.close();

    }
}
