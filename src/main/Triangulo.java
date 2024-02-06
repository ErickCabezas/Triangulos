package main;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoa, double ladob, double ladoc) {
        this.ladoA = ladoa;
        this.ladoB = ladob;
        this.ladoC = ladoc;
    }

    public static boolean esTriangulo(double ladoa, double ladob, double ladoc) throws ExcepcionNoEsTriangulo {
        if(ladoa + ladob > ladoc && ladob + ladoc > ladoa && ladoc + ladoa > ladob){
            return true;
        }else{
            throw new ExcepcionNoEsTriangulo("Los lados proporcionados no forman un triangulo");
        }
        //a+b>c,b+c>a,c+a>b
    }

    public String tipoDeTriangulo() {
        String tipo = "Escaleno";

        if (ladoA == ladoB && ladoB == ladoC) {
            tipo = "Equilatero";
        }else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            tipo = "Isósceles";
        }

        areaDeTriangulo();
        return tipo;
    }

    public double areaDeTriangulo() {
        double area = 0;
        double semiperimetro = (ladoA + ladoB + ladoC) / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
        return area;
    }


}
