package tests;

import data.Contacts;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pages.ContactsPage;

@Owner("dtsvetkova")
@Tag("protei_tests")
@Feature("Контакты и обратная связь")
public class ContactsTests extends TestBase {

    ContactsPage contactsPage = new ContactsPage();

    @Story("Форма обратной связи")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверить, что все поля формы являются обязательными для заполнения")
    @Tag("protei_tests")
    @Test
    void requiredFeedbackFormFieldsTest() {
        contactsPage.openPage()
                .openFeedbackForm()
                .checkRequiredFields();
    }

    @EnumSource(Contacts.class)
    @Story("Контакты на сайте")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверить, в каждом поле контактов указано соответствующее значение")
    @ParameterizedTest(name = "(Поле {0})")
    void companyContactsTest(Contacts contacts) {
        contactsPage.openPage()
                .checkContacts(contacts.getLabel(), contacts.getContent());
    }

}
