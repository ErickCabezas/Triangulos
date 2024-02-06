package test;

import main.ExcepcionNoEsTriangulo;
import main.Triangulo;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TrianguloTest {
    @Test
    public void testEquilatero() {
        Triangulo t = new Triangulo(3, 3, 3);
        assertEquals("Equilatero", t.tipoDeTriangulo());
    }

    @Test
    public void testIsosceles() {
        Triangulo t = new Triangulo(5, 5, 3);
        assertEquals("Isósceles", t.tipoDeTriangulo());
    }

    @Test
    public void testEscaleno() {
        Triangulo t = new Triangulo(3, 4, 5);
        assertEquals("Escaleno", t.tipoDeTriangulo());
    }

    /*test de es triangulo*/

    @Test
    public void testEsTriangulo() throws ExcepcionNoEsTriangulo {
        Assert.assertTrue(Triangulo.esTriangulo(3, 4, 5));
    }

    @Test

    public void testNoEsTriangulo(){

        double a=3,b=4, c=10 ;

        String resultadoEsperado = "Los lados proporcionados no forman un triangulo";

        ExcepcionNoEsTriangulo resultadoObtenido

                = assertThrows(ExcepcionNoEsTriangulo.class, () -> Triangulo.esTriangulo(a,b,c));

        assertEquals(resultadoEsperado, resultadoObtenido.getMessage());
    }

    @Test
    public void testArea() {
        Triangulo t = new Triangulo(3, 4, 5);
        assertEquals(6, t.areaDeTriangulo(), 0.1);
    }

    @Test
    public void testArea2() {
        Triangulo t = new Triangulo(3, 3, 3);
        assertEquals(3.897, t.areaDeTriangulo(), 0.1);
    }

}

