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




}
