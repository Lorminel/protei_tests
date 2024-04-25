package data;

public enum Contacts {
    ADDRESS("Адрес:", "194044, Россия, г. Санкт-Петербург, Большой Сампсониевский пр., д.60A, Бизнес-центр \"ТЕЛЕКОМ\""),
    PHONE("Телефон:", "+7 (812) 449-47-27"),
    EMAIL("E-mail:", "sales@protei.ru");

    public String getLabel() {
        return label;
    }

    public String getContent() {
        return content;
    }

    private final String label;

    Contacts(String label, String content) {
        this.label = label;
        this.content = content;
    }

    private final String content;

}
