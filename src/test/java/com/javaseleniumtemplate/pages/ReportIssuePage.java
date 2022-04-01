package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ReportIssuePage extends PageBase {
    //Mapping
    By menuButtonReportIssue = By.xpath("//td[@class='menu']//a[text()='Report Issue']");
    By buttonSelectProject = By.xpath("//input[@value='Select Project']");
    By selectCategory = By.xpath("//option[text()='[All Projects] 7EI2PODHPN']");
    By inputSummary = By.xpath("//input[@name='summary']");
    By inputDescription = By.xpath("//textarea[@name='description']");
    By buttonSubmitProject = By.xpath("//input[@value='Submit Report']");
    By issueReportado = By.xpath("//div[contains(text(),'Operation')]");

    //Actions
    public void clicarReportIssue() {
        waitForElement(menuButtonReportIssue);
        click(menuButtonReportIssue);
    }

    public void clicarSelectProject() {
        waitForElement(buttonSelectProject);
        click(buttonSelectProject);
    }

    public void clicarSelectCategory() {
        waitForElement(selectCategory);
        click(selectCategory);
    }

    public void preenhcerSummary(String summary) {
        sendKeys(inputSummary, summary);
    }

    public void preencherDescription(String description) {
        sendKeys(inputDescription, description);
    }

    public void clicarSubmitProject() {
        waitForElement(buttonSubmitProject);
        click(buttonSubmitProject);
    }

    public String retornaMensagemSucessoReportIssue() {
        waitForElement(issueReportado);
        return getText(issueReportado);
    }
}
