package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrlStartingWith;

public class AboutCompanyPage {

    private final SelenideElement companyTitle = $(".block-titr-about__title");
    private final String companyPageUrl = "/company";

    @Step("Проверить переход на страницу с информацией о компании")
    public AboutCompanyPage checkPageDisplayed() {
        webdriver().shouldHave(currentFrameUrlStartingWith(baseUrl + companyPageUrl));
        companyTitle.shouldHave(text("О компании НТЦ ПРОТЕЙ"));

        return this;
    }
}
