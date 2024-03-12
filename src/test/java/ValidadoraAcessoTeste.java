import br.com.fiap.ValidadoraAcesso;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidadoraAcessoTeste {

    ValidadoraAcesso validadoraAcesso;

    @Before
    public void SetUp(){
        validadoraAcesso = new ValidadoraAcesso();
    }

    @Test
    public void TesteAcessoInvalido(){
        String acessoInvalido = "40187026041";
        assertFalse(validadoraAcesso.validaAcesso(acessoInvalido));
    }

    @Test
    public void TesteAcessoValido(){
        String acessoValido = "03022301065";
        assertTrue(validadoraAcesso.validaAcesso(acessoValido));
    }

}
