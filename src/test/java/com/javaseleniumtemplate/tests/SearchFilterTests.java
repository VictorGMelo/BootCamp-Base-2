package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.SearchFilterPage;
import org.junit.Assert;
import org.junit.Test;

public class SearchFilterTests extends TestBase {
    //Objects
    SearchFilterPage searchFilterPage;
    LoginFlows loginFlows;

    //Tests
    @Test
    public void searchFilter() {

        //Objects instances
        searchFilterPage = new SearchFilterPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String usuario = "victor.melo";
        String senha = "genjutsuda23";
        String mensagemEsperada = "Teste Victor";
        String searchfield = "Teste Victor";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        searchFilterPage.clicarViewIssues();
        searchFilterPage.preencherSearchField(searchfield);
        searchFilterPage.clicarApplyFilter();



        Assert.assertTrue(searchFilterPage.retornaResultSearch().contains(mensagemEsperada));
    }
}
