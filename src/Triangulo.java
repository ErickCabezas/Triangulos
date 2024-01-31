public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoa, double ladob, double ladoc) {
        this.ladoA = ladoa;
        this.ladoB = ladob;
        this.ladoC = ladoc;
    }

    public static boolean esTriangulo(double ladoa, double ladob, double ladoc){
        //a+b>c,b+c>a,c+a>b
        return ladoa+ladob>ladoc && ladob+ladoc>ladoa && ladoc+ladoa>ladob;
    }

    public String tipoDeTriangulo(){
        String tipo="Escaleno";
        if(ladoA==ladoB && ladoB==ladoC){
            tipo="Triangulo Equilatero";
            return tipo;
        }
        if(ladoA==ladoB || ladoB==ladoC || ladoA==ladoC ){
            tipo="Triangulo Isósceles";
            return tipo;
        }
        return tipo;
    }

    public double areaDeTriangulo(){
        double area=0;
        double semiperimetro=(ladoA+ladoB+ladoC)/2;
        area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
        return area;
    }







}
