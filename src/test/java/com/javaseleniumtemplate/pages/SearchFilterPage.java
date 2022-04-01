package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class SearchFilterPage extends PageBase {
    //Mapping
    By menuButtonViewIssues = By.xpath("//td[@class='menu']//a[text()='View Issues']");
    By searchField = By.xpath("//input[@name='search']");
    By buttonApplyFilter = By.xpath("//input[@value='Apply Filter']");
    By filterApply = By.xpath("//td[contains(text(),'Teste Victor')]");

    //Actions
    public void clicarViewIssues() {
        waitForElement(menuButtonViewIssues);
        click(menuButtonViewIssues);
    }

    public void preencherSearchField(String searchfield) {
        sendKeys(searchField, searchfield);
    }

    public void clicarApplyFilter() {
        waitForElement(buttonApplyFilter);
        click(buttonApplyFilter);
    }

    public String retornaResultSearch() {
        waitForElement(filterApply);
        return getText(filterApply);
    }
}
