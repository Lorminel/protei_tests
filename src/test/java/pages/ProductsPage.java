package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrlStartingWith;

public class ProductsPage {
    private final SelenideElement companyTitle = $(".block-titr-products__title");
    private final String productsPageUrl = "/products";

    @Step("Проверить переход на страницу с информацией о продуктах")
    public ProductsPage checkPageDisplayed() {
        webdriver().shouldHave(currentFrameUrlStartingWith(baseUrl + productsPageUrl));
        companyTitle.shouldHave(text("Продукты"));

        return this;
    }
}
