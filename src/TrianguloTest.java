import org.junit.Assert;
import org.junit.Test;

public class TrianguloTest {
    @Test
    public void testEquilatero() {
        Triangulo t = new Triangulo(3, 3, 3);
        Assert.assertEquals("Equilatero", t.tipoDeTriangulo());
    }

    @Test
    public void testIsosceles() {
        Triangulo t = new Triangulo(5, 5, 3);
        Assert.assertEquals("Isósceles", t.tipoDeTriangulo());
    }

    @Test
    public void testEscaleno() {
        Triangulo t = new Triangulo(3, 4, 5);
        Assert.assertEquals("Escaleno", t.tipoDeTriangulo());
    }

    /*test de es triangulo*/

    @Test
    public void testEsTriangulo() {
        Assert.assertTrue(Triangulo.esTriangulo(3, 4, 5));
    }

    @Test
    public void testNoEsTriangulo() {
        Assert.assertFalse(Triangulo.esTriangulo(3, 4, 10));
    }

    /*test de area de triangulo*/

    @Test
    public void testArea() {
        Triangulo t = new Triangulo(3, 4, 5);
        Assert.assertEquals(6, t.areaDeTriangulo(), 0.1);
    }

    @Test
    public void testArea2() {
        Triangulo t = new Triangulo(3, 3, 3);
        Assert.assertEquals(3.897, t.areaDeTriangulo(), 0.1);
    }

}
