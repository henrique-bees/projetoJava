public class Triangulo {
    private double altura;

    public Triangulo(double b, double h) {

        this.altura = h;
    }

    public double getAltura() {
        return this.altura;
    }

    public void gerarTrianguloRetangulo() {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
