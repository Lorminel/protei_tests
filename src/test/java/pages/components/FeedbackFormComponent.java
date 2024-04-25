package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class FeedbackFormComponent {

    private final SelenideElement nameInput = $("input[name='name']"),
            contactsInput = $("input[name='phone']"),
            emailInput = $("input[name='mail']"),
            messageInput = $("textarea[name='message']"),
            checkboxInput = $("input[name='fz152_agreement']");

    public void checkRequiredFields() {
        nameInput.shouldHave(attribute("required"));
        contactsInput.shouldHave(attribute("required"));
        emailInput.shouldHave(attribute("required"));
        messageInput.shouldHave(attribute("required"));
        checkboxInput.shouldHave(attribute("required"));
    }
}
