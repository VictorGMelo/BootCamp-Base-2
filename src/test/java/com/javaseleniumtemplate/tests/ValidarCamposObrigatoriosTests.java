package com.javaseleniumtemplate.tests;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.ValidacaoCampoObrigatorioPage;
import org.junit.Assert;
import org.junit.Test;
import com.javaseleniumtemplate.bases.TestBase;

public class ValidarCamposObrigatoriosTests extends TestBase {
    //Objects
    ValidacaoCampoObrigatorioPage validacaoCampoObrigatorioPage;
    LoginFlows loginFlows;

    //Tests
    @Test
    public void validarCampoObrigatorio(){

        //Objects instances
        validacaoCampoObrigatorioPage = new ValidacaoCampoObrigatorioPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String usuario = "victor.melo";
        String senha = "genjutsuda23";
        String mensagemEsperada = "A necessary field \"Summary\" was empty. Please recheck your inputs.";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        validacaoCampoObrigatorioPage.clicarReportIssue();
        validacaoCampoObrigatorioPage.clicarSelectProject();
        validacaoCampoObrigatorioPage.clicarSubmitProject();


        Assert.assertTrue(validacaoCampoObrigatorioPage.retornaMensagemErroReportIssue().contains(mensagemEsperada));
    }
}
