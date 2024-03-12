import br.com.fiap.LogCPF;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LogCPFTeste {

    LogCPF logCPF;

    @Before
    public void SetUp(){
        logCPF = new LogCPF();
    }

    @Test
    public void TesteLogRetornoPositivo(){
        assertEquals("Seu CPF é válido para acesso ao sistema",logCPF.log(true));
    }

    @Test
    public void TesteLogRetornoNegativo(){
        assertEquals("Seu CPF é inválido para acesso ao sistema",logCPF.log(false));
    }

}
