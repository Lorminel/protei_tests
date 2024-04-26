# Проект по тестированию сайта Научно-Технического Центра ПРОТЕЙ
> <a target="_blank" href="https://protei.ru/">Ссылка на портал</a>

> ![This is an image](/design/images/logo.svg)
____
## **Содержание:**

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Список реализованных проверок</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>
____
<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="design/icons/intellij-original.svg">
<img width="6%" title="Java" src="design/icons/java-original-wordmark.svg">
<img width="6%" title="Selenide" src="design/icons/Selenide.png">
<img width="6%" title="Selenoid" src="design/icons/Selenoid.png">
<img width="6%" title="Allure Report" src="design/icons/Allure_Report.png">
<img width="5%" title="Allure TestOps" src="design/icons/AllureTestOps.png">
<img width="6%" title="Gradle" src="design/icons/gradle-original.svg">
<img width="6%" title="JUnit5" src="design/icons/junit-original-wordmark.svg">
<img width="5%" title="Jira" src="design/icons/jira-original-wordmark.svg">
<img width="6%" title="GitHub" src="design/icons/github-original-wordmark.svg">
<img width="6%" title="Jenkins" src="design/icons/jenkins-original.svg">
</p>

____
<a id="cases"></a>
## <a name="Список реализованных проверок">**Список реализованных проверок:**</a>
#### Список проверок, реализованных в автотестах
- [x] Проверка перехода на страницу информации о компании с главной страницы сайта
- [x] Проверка перехода на страницу продуктов компании с главной страницы сайта
- [x] Проверка соответствия контактов компании на странице "Контакты"
- [x] Проверка того, что все поля формы обратной связи являются обязательными для заполнения
- [x] Проверка работы поиска по сайту после ввода запроса на главной странице
- [x] Проверка закрытия строки поиска при нажатии на любое место на странице
- [x] Проверка закрытия строки поиска при нажатии на соответствующую кнопку
#### Список проверок ручного тестирования
- [x] Проверка смены карты при переключении типов внедрений на главной странице
- [x] Проверка отправки заполненной формы обратной связи

____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="design/icons/jenkins-original.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/26-Lorminel-protei/)</a>

 ![This is an image](/design/images/jenkins.png)

### **Параметры сборки в Jenkins:**

- *TASK* - запуск задачи, по умолчанию запускаются все тесты protei_tests
- *BROWSER* - браузер, по умолчанию chrome
- *BROWSER_SIZE* - размер окна браузера, по умолчанию 1920x1080
- *BROWSER_VERSION* - версия браузера, по умолчанию 120.0
- *REMOTE_URL* - логин, пароль и адрес удаленного сервера Selenoid
____
<a id="console"></a>
## Команды для запуска из терминала


#### Локальный запуск:
```bash  
gradle clean protei_tests
```

#### Удалённый запуск через Jenkins:
```bash  
clean ${TASK} 
"-Dbrowser=${BROWSER}" 
"-Dbrowser_size=${BROWSER_SIZE}" 
"-Dbrowser_version=${BROWSER_VERSION}" 
"-Dremote_url=${REMOTE_URL}"
```
____
<a id="allure"></a>
## <img alt="Allure" height="25" src="design/icons/Allure_Report.png" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/26-Lorminel-protei/allure/)</a>
### По результатам каждого запуска тестов в Jenkins создается Allure отчет с подробной информацией по каждому пройденному тесту.

### Основная страница отчета
![This is an image](/design/images/allure_report2.png)

### Тест-кейсы
![This is an image](/design/images/allure_report.png)

____
<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="design/icons/Allure_Report.png" width="25"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/4202/dashboards">Allure TestOps</a>
### Полная статистика по прохождению тест-кейсов, отчёты и приложения к ним хранятся в Allure TestOps(запрос доступа admin@qa.guru).

### *Allure TestOps Dashboard*
![This is an image](/design/images/allure_dashboard.png)

### *Автоматизированные тест-кейсы*
![This is an image](/design/images/allure_auto.png)

### *Ручные тест-кейсы*
![This is an image](/design/images/allure_manual.png)

____
<a id="jira"></a>
## <img alt="Jira" height="25" src="design/icons/jira-original-wordmark.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-1201">Jira</a>
### Результаты выполнения тестов и информация о выявленных дефектах интегрированы с Atlassian Jira.
![This is an image](/design/images/jira.png)

____
<a id="telegram"></a>
## <img alt="Allure" height="25" src="design/icons/Telegram.png" width="25"/></a> Уведомление в Telegram при помощи бота
### Настроено автоматическое оповещение о результатах сборки Jenkins в Telegram-бот.
![This is an image](/design/images/telegramBot.png)

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="design/icons/Selenoid.png" width="25"/></a> Пример видеозаписи прохождения теста

<img title="Selenoid Video" src="design/images/video.gif" width="550" height="350"  alt="video">   
