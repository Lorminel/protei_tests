package tests;

import com.codeborne.selenide.WebDriverRunner;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {


    @Step("Открыть страницу https://protei.ru")
    @BeforeAll
    static void beforeAll() {

        WebDriverProvider webDriverProvider = new WebDriverProvider();
        webDriverProvider.config();
    }

    @Step("Закрыть страницу, сохранить видео, скриншот и логи браузера")
    @AfterEach
    void afterEach() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        if (!WebDriverRunner.isFirefox()) {
            Attach.browserConsoleLogs();
        }
        Attach.addVideo();
        closeWebDriver();
    }
}
