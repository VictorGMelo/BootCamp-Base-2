package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;

    //Tests
    @Test
    public void efetuarLoginEmailValido() {

        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = "victor.melo";
        String senha = "genjutsuda23";
        String mensagemEsperada = "Victor";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemSucessoLogin().contains(mensagemEsperada));
    }
}
