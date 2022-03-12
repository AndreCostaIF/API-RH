package br.com.aula.CRUDCliente;

import static org.junit.jupiter.api.Assertions.assertTrue;

import br.com.aula.CRUDCliente.model.*;
import org.junit.jupiter.api.Test;

public class FeriasTest {
    private Sector sector = new Sector("TI");
    private Cargo cargo = new Cargo("Suporte", 1500, sector) ;
    private Usuario usuario = new Usuario("eduarda", "teste");
    private Funcionario funcionario = new Funcionario("Eduarda", "12345678978", "123456", "31/05/2001", "01/02/2021", "superior", cargo, "123456", usuario);
    private Ferias ferias = new Ferias(funcionario, "10/01/2022","10/02/2022");
    @Test
    public void deveInformarSeJaPodeTerFerias(){
        assertTrue(ferias.jaPodeTerFerias(funcionario));
    }
}
