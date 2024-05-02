package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;
import pages.SearchContentPage;

@Owner("dtsvetkova")
@Tag("protei_tests")
@Feature("Поиск по сайту")
public class SearchTests extends TestBase {

    MainPage mainPage = new MainPage();
    SearchContentPage searchContentPage = new SearchContentPage();

    @Story("Закрытие строки поиска")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка закрытия строки поиска при нажатии на соответствующую кнопку")
    @Test
    void searchInputClosedByButtonTest() {
        mainPage.openPage()
                .openSearchBar()
                .closeSearchBarByButton()
                .checkSearchInputIsClosed();
    }

    @Story("Закрытие строки поиска")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка закрытия строки поиска при нажатии на любое место на странице")
    @Test
    void searchInputClosedByPageClickTest() {
        mainPage.openPage()
                .openSearchBar()
                .closeSearchBarByPageClick()
                .checkSearchInputIsClosed();
    }

    @ValueSource(strings = {
            "LTE",
            "DPI",
            "USSD",
            "Кодеки"})
    @Story("Выполнение поиска по сайту")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка работы поиска по сайту после ввода запроса на главной странице")
    @ParameterizedTest(name = "(Запрос {0})")
    void searchByTextFromMainPage(String searchData) {
        mainPage.openPage()
                .openSearchBar()
                .searchOnWebsite(searchData);
        searchContentPage.checkSearchResults(searchData);
    }
}
