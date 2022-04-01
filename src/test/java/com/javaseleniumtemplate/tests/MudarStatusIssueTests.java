package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.MudarStatusIssuePage;
import org.junit.Assert;
import com.javaseleniumtemplate.bases.TestBase;
import org.junit.Test;

public class MudarStatusIssueTests extends TestBase {
    //Objects
    MudarStatusIssuePage mudarStatusIssuePage;
    LoginFlows loginFlows;

    //Tests
    @Test
    public void mudarStatus() {

        //Objects instances
        mudarStatusIssuePage = new MudarStatusIssuePage();
        loginFlows = new LoginFlows();

        //Parameteres
        String usuario = "victor.melo";
        String senha = "genjutsuda23";
        String mensagemEsperada = "resolved";


        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mudarStatusIssuePage.clicarViewIssues();
        mudarStatusIssuePage.clicarLinkIssue();
        mudarStatusIssuePage.clicarButtonEdit();
        mudarStatusIssuePage.clicarSelectStatus();
        mudarStatusIssuePage.clicarButtonUpdate();


        Assert.assertTrue(mudarStatusIssuePage.retornaStatusResolved().contains(mensagemEsperada));
    }
}
