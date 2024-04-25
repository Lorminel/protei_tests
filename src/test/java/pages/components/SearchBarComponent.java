package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchBarComponent {

    private final SelenideElement searchButton = $(".block-search__button"),
            searchInputCloser = $(".block-search__closer"),
            navigationBar = $(".region-navigation__container"),
            searchInput = $("#edit-search");

    public void openSearchInput() {
        searchButton.click();
    }

    public void closeSearchInputByButton() {
        searchInputCloser.click();
    }

    public void closeSearchInputByClickingOnThePage() {
        navigationBar.click();
    }

    public void searchOnWebsite(String searchText) {
        searchInput.setValue(searchText).pressEnter();
    }
}
