package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;


public class DownloadPage extends PageBase {
    //Mapping
    By menuButtonViewIssues = By.xpath("//td[@class='menu']//a[text()='View Issues']");
    By buttonCsvExport = By.xpath("//td[@class='form-title']//a[text()='CSV Export']");
    By menuButtonSummary = By.xpath("//td[@class='menu']//a[text()='Summary']");


    //Actions
    public void clicarViewIssues() {
        waitForElement(menuButtonViewIssues);
        click(menuButtonViewIssues);
    }

    public void clicarSummary() {
        waitForElement(menuButtonViewIssues);
        click(menuButtonViewIssues);
    }

    public void clicarCsvExport() {
        waitForElement(buttonCsvExport);
        click(buttonCsvExport);
    }

    public boolean verificarArquivo(String name) {
        return checkFileByNameLocal(name);
    }
}

