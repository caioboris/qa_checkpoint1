import org.junit.Before;
import org.junit.Test;
import br.com.fiap.CodigoPessoaFisica;

import static org.junit.Assert.*;

public class CodigoPessoaFisicaTeste {

    CodigoPessoaFisica cpf;

    @Before
    public void SetUp(){
        cpf = new CodigoPessoaFisica();
    }

    @Test
    public void TesteCpfInvalido(){
        String cpfInvalido = "111.444.777-05";
        assertFalse(cpf.validaCPF(cpfInvalido));
    }

    @Test
    public void TesteCpfValido(){
        String cpfValido = "525.342.068-18";
        assertTrue(cpf.validaCPF(cpfValido));
    }

    @Test
    public void TesteRemoveCaracteresEspeciais(){
        String valorComCaracteresEspeciais = "111.444.777-05";
        assertEquals("11144477705", cpf.removeCaracteresEspeciais(valorComCaracteresEspeciais));
    }
}
