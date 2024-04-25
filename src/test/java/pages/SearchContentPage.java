package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.SearchBarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchContentPage {

    private final SelenideElement searchContent = $(".view-searching-search__content");

    @Step("Выполнить поиск по сайту по запросу {searchInput}")
    public SearchContentPage checkSearchResults(String searchInput) {
        searchContent.shouldHave(text(searchInput));

        return this;
    }
}
