import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class classificadorEleitorTest {

    // Testa idade inválida: menor que 0
    @Test
    public void testIdadeInvalidaMenorQueZero() {
        classificadorEleitor obj = new classificadorEleitor();
        assertEquals("Idade Invalida", obj.classificarEleitor(-1));
    }
    
    // Testa idade inválida: maior que 130
    @Test
    public void testIdadeInvalidaMaiorQue130() {
        classificadorEleitor obj = new classificadorEleitor();
        assertEquals("Idade Invalida", obj.classificarEleitor(131));
    }
    
    // Testa faixa de 0 a 15: Nao Permitido
    @Test
    public void testNaoPermitido() {
        classificadorEleitor obj = new classificadorEleitor();
        assertEquals("Nao Permitido", obj.classificarEleitor(0));
        assertEquals("Nao Permitido", obj.classificarEleitor(10));
        assertEquals("Nao Permitido", obj.classificarEleitor(15));
    }
    
    // Testa faixa 16 e 17: Facultativo
    @Test
    public void testFacultativoPara16e17() {
        classificadorEleitor obj = new classificadorEleitor();
        assertEquals("Facultativo", obj.classificarEleitor(16));
        assertEquals("Facultativo", obj.classificarEleitor(17));
    }
    
    // Testa faixa de 18 a 69: Obrigatorio
    @Test
    public void testObrigatorio() {
        classificadorEleitor obj = new classificadorEleitor();
        // Atenção: teste para 18 pode falhar por conta do ">" em vez de ">=" na condição
        assertEquals("Obrigatorio", obj.classificarEleitor(18));
        assertEquals("Obrigatorio", obj.classificarEleitor(40));
        assertEquals("Obrigatorio", obj.classificarEleitor(69));
    }
    
    // Testa faixa de 70 a 130: Facultativo
    @Test
    public void testFacultativoPara70a130() {
        classificadorEleitor obj = new classificadorEleitor();
        assertEquals("Facultativo", obj.classificarEleitor(70));
        assertEquals("Facultativo", obj.classificarEleitor(100));
        assertEquals("Facultativo", obj.classificarEleitor(130));
    }
}

