package com.javaseleniumtemplate.tests;


import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.DownloadPage;
import org.junit.Assert;
import org.junit.Test;

public class DownloadIssuesTests extends TestBase {
    //Objects
    DownloadPage downloadPage;
    LoginFlows loginFlows;

    //Tests
    @Test
    public void efetuarDownloadCsvExport() {

        //Objects instances
        downloadPage = new DownloadPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String usuario = "victor.melo";
        String senha = "genjutsuda23";
        String name = "victor.melo.csv";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        downloadPage.clicarViewIssues();
        downloadPage.clicarCsvExport();
        downloadPage.clicarSummary();
        downloadPage.verificarArquivo(name);

        Assert.assertTrue(downloadPage.verificarArquivo(name));
    }
}
