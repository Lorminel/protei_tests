package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.SearchBarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    SearchBarComponent searchBarComponent = new SearchBarComponent();
    private final SelenideElement mainPageBlock = $(".block-maintitr"),
            searchInput = $("#edit-search--2"),
            productsButton = $(".block-maintitr__content"),
            companyButton = $(".block-content-front-titr-full__field-links-item[href='https://protei.ru/company']"),
            mapTab = $("svgMap__tab");


    @Step("Открыть главную страницу")
    public MainPage openPage() {
        open("/");
        mainPageBlock.shouldHave(text("Научно-Технический Центр ПРОТЕЙ"));

        return this;

    }

    @Step("Открыть строку поиска по сайту")
    public MainPage openSearchBar() {
        searchBarComponent.openSearchInput();

        return this;
    }

    @Step("Закрыть строку поиска по сайту нажатием на кнопку")
    public MainPage closeSearchBarByButton() {
        searchBarComponent.closeSearchInputByButton();

        return this;
    }

    @Step("Закрыть строку поиска по сайту нажатием на любое место на главной странице")
    public MainPage closeSearchBarByPageClick() {
        searchBarComponent.closeSearchInputByClickingOnThePage();

        return this;
    }

    @Step("Выполнить поиск по сайту по запросу {searchInput}")
    public MainPage searchOnWebsite(String searchInput) {
        searchBarComponent.searchOnWebsite(searchInput);

        return this;
    }

    @Step("Нажать на кнопку О компании")
    public MainPage pressCompanyButton() {
        mainPageBlock.$(byText("О компании")).click();

        return this;
    }

    @Step("Нажать на кнопку Наши продукты")
    public MainPage pressProductsButton() {
        mainPageBlock.$(byText("Наши продукты")).click();

        return this;
    }

    @Step("Проверить, что после закрытия строки поиска пользователь возвращается на главную страницу")
    public MainPage checkSearchInputIsClosed() {
        searchInput.shouldNotBe(visible);
        mainPageBlock.shouldHave(text("Научно-Технический Центр ПРОТЕЙ"));

        return this;
    }


}
