import org.junit.Test;
import static org.junit.Assert.*;

public class TrianguloTeste {

    @Test
    public void testExisteTriangulo() {
        // Casos válidos
        Triangulo t1 = new Triangulo(3, 4, 5);
        assertTrue("3,4,5 deve formar um triângulo", t1.existe());

        Triangulo t2 = new Triangulo(4, 4, 7);
        assertTrue("4,4,7 deve formar um triângulo", t2.existe());

        // Casos inválidos
        Triangulo t3 = new Triangulo(1, 2, 10);
        assertFalse("1,2,10 não deve formar um triângulo", t3.existe());

        Triangulo t4 = new Triangulo(1, 1, 2);
        assertFalse("1,1,2 não deve formar um triângulo", t4.existe());
    }

    @Test
    public void testEquilatero() {
        // Casos válidos
        Triangulo t1 = new Triangulo(3, 3, 3);
        assertTrue("3,3,3 deve ser equilátero", t1.isEquilatero());

        Triangulo t2 = new Triangulo(5, 5, 5);
        assertTrue("5,5,5 deve ser equilátero", t2.isEquilatero());

        // Casos inválidos
        Triangulo t3 = new Triangulo(3, 3, 4);
        assertFalse("3,3,4 não deve ser equilátero", t3.isEquilatero());

        Triangulo t4 = new Triangulo(4, 5, 6);
        assertFalse("4,5,6 não deve ser equilátero", t4.isEquilatero());
    }

    @Test
    public void testIsosceles() {
        // Casos válidos
        Triangulo t1 = new Triangulo(3, 3, 4);
        assertTrue("3,3,4 deve ser isósceles", t1.isIsosceles());

        Triangulo t2 = new Triangulo(4, 5, 4);
        assertTrue("4,5,4 deve ser isósceles", t2.isIsosceles());

        Triangulo t3 = new Triangulo(5, 7, 7);
        assertTrue("5,7,7 deve ser isósceles", t3.isIsosceles());

        // Casos inválidos
        Triangulo t4 = new Triangulo(3, 3, 3);
        assertFalse("3,3,3 não deve ser considerado isósceles (é equilátero)", t4.isIsosceles());

        Triangulo t5 = new Triangulo(1, 2, 10);
        assertFalse("1,2,10 não deve ser isósceles (triângulo inexistente)", t5.isIsosceles());
    }

    @Test
    public void testEscaleno() {
        // Casos válidos
        Triangulo t1 = new Triangulo(3, 4, 5);
        assertTrue("3,4,5 deve ser escaleno", t1.isEscaleno());

        Triangulo t2 = new Triangulo(5, 6, 7);
        assertTrue("5,6,7 deve ser escaleno", t2.isEscaleno());

        Triangulo t3 = new Triangulo(2, 3, 4);
        assertTrue("2,3,4 deve ser escaleno", t3.isEscaleno());

        // Casos inválidos
        Triangulo t4 = new Triangulo(3, 3, 4);
        assertFalse("3,3,4 não deve ser escaleno", t4.isEscaleno());

        Triangulo t5 = new Triangulo(3, 3, 3);
        assertFalse("3,3,3 não deve ser escaleno", t5.isEscaleno());

        Triangulo t6 = new Triangulo(1, 2, 10);
        assertFalse("1,2,10 não deve ser escaleno (triângulo inexistente)", t6.isEscaleno());
    }
}
