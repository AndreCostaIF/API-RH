package br.com.aula.CRUDCliente;

import br.com.aula.CRUDCliente.model.Cargo;
import br.com.aula.CRUDCliente.model.Funcionario;
import br.com.aula.CRUDCliente.model.Sector;
import br.com.aula.CRUDCliente.model.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class FuncionarioTest {

    private Sector sector = new Sector("TI");
    private Cargo cargo = new Cargo("Suporte", 1500, sector) ;
    private Usuario usuario = new Usuario("eduarda", "teste");
    private Funcionario funcionario = new Funcionario("Eduarda", "12345678978", "123456", "31/05/2001", "03/02/2022", "superior", cargo, "123456", usuario);
    //private Funcionario funcionario1 = new Funcionario("Eduarda", "12345678978", "123456", "31/05/2001", "03/01/2022", "superior", cargo, "123456", usuario);

    @Test
    public void deveCalcularValorDevidoComSucessoTest() throws ParseException {

        Assertions.assertEquals(0, funcionario.valorDevido());

    }

    @Test
    public void deveCalcularDecimoComSucessoTest() throws ParseException {

        Assertions.assertEquals(0, funcionario.calcularDecimoTerceiro());
    }

    @Test
    public void deveCalcularInssComSucessoTest() throws ParseException {

        Assertions.assertEquals(0, funcionario.calcularInss());
    }
}
