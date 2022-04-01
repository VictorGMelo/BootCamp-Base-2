package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ValidacaoCampoObrigatorioPage extends PageBase {
    //Mapping
    By menuButtonReportIssue = By.xpath("//td[@class='menu']//a[text()='Report Issue']");
    By buttonSelectProject = By.xpath("//input[@value='Select Project']");
    By buttonSubmitProject = By.xpath("//input[@value='Submit Report']");
    By issueReportado = By.xpath("//p[text()='A necessary field \"Summary\" was empty. Please recheck your inputs.']");

    //Actions
    public void clicarReportIssue() {
        waitForElement(menuButtonReportIssue);
        click(menuButtonReportIssue);
    }

    public void clicarSelectProject() {
        waitForElement(buttonSelectProject);
        click(buttonSelectProject);
    }

    public void clicarSubmitProject() {
        waitForElement(buttonSubmitProject);
        click(buttonSubmitProject);
    }

    public String retornaMensagemErroReportIssue() {
        waitForElement(issueReportado);
        return getText(issueReportado);
    }
}
