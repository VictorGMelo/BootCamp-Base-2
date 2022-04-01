package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class MudarStatusIssuePage extends PageBase {

    //Mapping
    By menuButtonViewIssues = By.xpath("//td[@class='menu']//a[text()='View Issues']");
    By linkIssue = By.xpath("//td//a[text()='0009228']");
    By buttonEdit = By.xpath("//input[@value='Edit']");
    By selectStatus = By.xpath("//option[text()='resolved']");
    By buttonUpdate = By.xpath("//input[@value='Update Information']");
    By statusResolved = By.xpath("//td[text()='resolved']");

    //Actions
    public void clicarViewIssues() {
        waitForElement(menuButtonViewIssues);
        click(menuButtonViewIssues);
    }

    public void clicarLinkIssue() {
        waitForElement(linkIssue);
        click(linkIssue);
    }

    public void clicarButtonEdit() {
        waitForElement(buttonEdit);
        click(buttonEdit);
    }

    public void clicarSelectStatus() {
        waitForElement(selectStatus);
        click(selectStatus);
    }

    public void clicarButtonUpdate() {
        waitForElement(buttonUpdate);
        click(buttonUpdate);
    }

    public String retornaStatusResolved() {
        waitForElement(statusResolved);
        return getText(statusResolved);
    }

}
