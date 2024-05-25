import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parUm = in.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parDois = in.nextInt();

        in.close();
        
        try {
            contar(parUm, parDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parUm, int parDois) throws ParametrosInvalidosException {
        if (parUm > parDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parDois - parUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
