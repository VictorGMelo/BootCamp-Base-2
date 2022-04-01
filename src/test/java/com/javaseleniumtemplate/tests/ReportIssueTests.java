package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.ReportIssuePage;
import org.junit.Assert;
import org.junit.Test;

public class ReportIssueTests extends TestBase {
    //Objects
    ReportIssuePage reportIssuePage;
    LoginFlows loginFlows;

    //Tests
    @Test
    public void reportIssue() {

        //Objects instances
        reportIssuePage = new ReportIssuePage();
        loginFlows = new LoginFlows();

        //Parameteres
        String usuario = "victor.melo";
        String senha = "genjutsuda23";
        String mensagemEsperada = "Operation successful";
        String summary = "Teste Prova Base 2 Victor";
        String description = "Descrição do teste";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        reportIssuePage.clicarReportIssue();
        reportIssuePage.clicarSelectProject();
        reportIssuePage.clicarSelectCategory();
        reportIssuePage.preenhcerSummary(summary);
        reportIssuePage.preencherDescription(description);
        reportIssuePage.clicarSubmitProject();


        Assert.assertTrue(reportIssuePage.retornaMensagemSucessoReportIssue().contains(mensagemEsperada));
    }
}


