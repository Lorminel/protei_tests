package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AboutCompanyPage;
import pages.MainPage;
import pages.ProductsPage;

@Owner("dtsvetkova")
@Tag("protei_tests")
@Feature("Главная страница")
public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();
    ProductsPage productsPage = new ProductsPage();
    AboutCompanyPage aboutCompanyPage = new AboutCompanyPage();

    @Story("Переход к другим разделам сайта с главной страницы")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка перехода на страницу продуктов компании с главной страницы сайта")
    @Test
    void openProductsFromMainPageTest() {
        mainPage.openPage()
                .pressProductsButton();
        productsPage.checkPageDisplayed();
    }

    @Story("Переход к другим разделам сайта с главной страницы")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка перехода на страницу информации о компании с главной страницы сайта")
    @Test
    void openCompanyInfoFromMainPageTest() {
        mainPage.openPage()
                .pressCompanyButton();
        aboutCompanyPage.checkPageDisplayed();
    }


}
