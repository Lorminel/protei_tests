package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.FeedbackFormComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ContactsPage {

    FeedbackFormComponent feedbackFormComponent = new FeedbackFormComponent();

    private final SelenideElement contactsTitle = $(".paragraph-contact__field-title"),
            feedbackButton = $(".paragraph-contact__field-link"),
            addressField = $(".paragraph-contact__field-address paragraph-contact__field-address--label-inline"),
            phoneField = $(".paragraph-contact__field-phone paragraph-contact__field-phone--label-inline"),
            emailField = $(".paragraph-contact__field-email paragraph-contact__field-email--label-inline"),
            contactsBlock = $(".paragraph-contact__main");

    @Step("Открыть страницу контактов")
    public ContactsPage openPage() {
        open("/contacts");
        contactsTitle.shouldHave(text(" Научно-Технический Центр ПРОТЕЙ, Головной офис"));

        return this;
    }

    @Step("Открыть форму обратной связи")
    public ContactsPage openFeedbackForm() {
        feedbackButton.click();

        return this;
    }

    @Step("Проверить, что все поля формы являются обязательными для заполнения")
    public ContactsPage checkRequiredFields() {
        feedbackFormComponent.checkRequiredFields();

        return this;
    }

    @Step("Проверить, что в графе {key} указано значение {value}")
    public ContactsPage checkContacts(String key, String value) {
        contactsBlock.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }


}
