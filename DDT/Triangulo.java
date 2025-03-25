public class Triangulo {
    private int ladoA, ladoB, ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    /**
     * Verifica se as medidas dos lados satisfazem a condição de existência do triângulo
     */
    public boolean existe() {
        return (ladoA < ladoB + ladoC && ladoA > Math.abs(ladoB - ladoC)) &&
               (ladoB < ladoA + ladoC && ladoB > Math.abs(ladoA - ladoC)) &&
               (ladoC < ladoA + ladoB && ladoC > Math.abs(ladoA - ladoB));
    }

    /**
     * Retorna true se o triângulo é equilátero (todos os lados iguais) e
     * se ele existe.
     */
    public boolean isEquilatero() {
        return existe() && (ladoA == ladoB && ladoB == ladoC);
    }

    /**
     * Retorna true se o triângulo é isósceles (apenas dois lados iguais) e
     * se ele existe.
     */
    public boolean isIsosceles() {
        return existe() &&
               ((ladoA == ladoB && ladoA != ladoC) ||
                (ladoA == ladoC && ladoA != ladoB) ||
                (ladoB == ladoC && ladoB != ladoA));
    }

    /**
     * Retorna true se o triângulo é escaleno (todos os lados diferentes) e
     * se ele existe.
     */
    public boolean isEscaleno() {
        return existe() && (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC);
    }
}
