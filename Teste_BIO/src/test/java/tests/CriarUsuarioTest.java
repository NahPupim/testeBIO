package tests;

import br.com.alura.leilao.lance.LancesPage;
import br.com.alura.leilao.page_objects.CriarUsuarios;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CriarUsuarioTest {

    private CriarUsuarios criarUsuarios;

    @BeforeEach
    public void beforeEach() {
        this.criarUsuarios = new CriarUsuarios();
    }

    @AfterEach
    public void afterEach() {
        this.criarUsuarios.fechar();
    }

    @Test
    synchronized public void cadastraNovousuario() throws InterruptedException {
        String Nome = " zzzulaide";
        String UltimoNome = "leandro";
        String Email = "zzulaide@gmail.com";
        String Endereço = "rua 52";
        String Universidade = "Fatec zl";
        String Profissão = "programador";
        String Genero = "masculino";
        String idade = "25";
        criarUsuarios.preencherFormularioDeCadastro(Nome, UltimoNome,Email,Endereço, Universidade, Profissão, Genero , idade);
        criarUsuarios.efetuarCadastro();
        String msg = criarUsuarios.pegamessagem();

        Assert.assertEquals("Usuário Criado com sucesso", msg);


    }

  //  @Test
    public void validaDadosCadastrados() {
       // paginaDeLogin.preencherFormularioDeLogin("invalido", "1233");
        //paginaDeLogin.efetuarLogin();

        //Assert.assertNull(paginaDeLogin.getNomeUsuarioLogado());
        //Assert.assertTrue(paginaDeLogin.isPaginaAtual());
        //Assert.assertTrue(paginaDeLogin.isMensagemDeLoginInvalidoVisivel());
    }

    //@Test
    public void validaCriacaoDeUsuario() {
        //LancesPage paginaDeLances = new LancesPage();

        //Assert.assertFalse(paginaDeLances.isPaginaAtual());
        //Assert.assertFalse(paginaDeLances.isTituloLeilaoVisivel());

        //paginaDeLances.fechar();
    }

}
