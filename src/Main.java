import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em centímetros: ");
        double altura = scanner.nextDouble();

        IMCCalculadora calculadora = new IMCCalculadora(peso, altura);
        double imc = calculadora.imc();

        IMCClassificador classificador = new IMCClassificador();
        String classificacao = classificador.classificar(imc);

        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
