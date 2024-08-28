import java.util.Scanner;

public class Programa {
    public static void main(String args[]) {
        while (true) {
            System.out.println(
                    "Este programa gera imagens 2D de formas geometricas usando #'s\nPara selecionar a forma geometrica que você quer imprimir digite o numero conforme a tablea abaixo:\n1 - Retângulo;\n2 - Triângulo;\nem breve mais.\ndigite uma opção inexistente para sair do programa.");
            Scanner input = new Scanner(System.in);
            int escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu Retângulo, agora, digite os lados do retângulo.");
                    System.out.print("lado 1: ");
                    double lado1 = input.nextDouble();
                    System.out.print("lado 2: ");
                    double lado2 = input.nextDouble();
                    Quadrilatero R1 = new Quadrilatero(lado1, lado2);
                    R1.gerarRetangulo();
                    break;
                case 2:
                    System.out.println("Você escolheu Triângulo, agora, digite as medidas do triângulo.");
                    System.out.print("Base: ");
                    double base = input.nextDouble();
                    System.out.print("altura: ");
                    double altura = input.nextDouble();
                    Triangulo T1 = new Triangulo(base, altura);
                    T1.gerarTrianguloRetangulo();
                    break;
                default:
                    System.out.println("saindo...");
                    input.close();
                    return;

            }
        }
    }
}
