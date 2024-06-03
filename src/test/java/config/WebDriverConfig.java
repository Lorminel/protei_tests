package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${env}.properties"})
public interface WebDriverConfig extends Config {
    @Key("baseUrl")
    String getBaseUrl();

    @Key("browser")
    String getBrowser();

    @Key("browserSize")
    String getBrowserSize();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("remoteUrl")
    String getRemoteUrl();
}
