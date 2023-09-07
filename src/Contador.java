import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();

        try {
			//chamando o método contendo a lógica de contagem
            contar(primeiroParametro, segundoParametro);
		}catch (Exception e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");            
        } finally {
            System.out.println(" ");
            System.out.println("Fim");
        }

        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
		
		//realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
	}
}

class ParametrosInvalidosException extends RuntimeException {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
