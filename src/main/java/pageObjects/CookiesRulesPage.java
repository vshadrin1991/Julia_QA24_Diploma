package pageObjects;

import entities.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.baseObjects.BaseLoadedPage;

public class CookiesRulesPage extends BaseLoadedPage<CookiesRulesPage> {
    private final By acceptCookiesRulesButton = By.xpath("//button[@type='submit']");

    public CookiesRulesPage acceptCookies() {
        click(acceptCookiesRulesButton);
        wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(acceptCookiesRulesButton)));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(acceptCookiesRulesButton), "Настройки применены"));
        return me();
    }
//    public CookiesRulesPage chooseProductCategory(Product product) {
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains (text(), '" + product.getCategory() + "')]")));
//        click(By.xpath("//span[contains (text(), '" + product.getCategory() + "')]"));
//        return me();
//    }
//
//    public CookiesRulesPage chooseProductCategory(String category) {
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains (text(), '" + category + "')]")));
//        click(By.xpath("//span[contains (text(), '" + category + "')]"));
//        return me();
//    }
//
}
