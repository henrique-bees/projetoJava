class Quadrilatero {
    private double lado1;
    private double lado2;

    public Quadrilatero(double l1, double l2) {
        this.lado1 = l1;
        this.lado2 = l2;
    }

    public double getLado1() {
        return this.lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void gerarRetangulo() {
        for (int i = 1; i <= this.lado1; i++) {
            for (int j = 1; j <= this.lado2; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}