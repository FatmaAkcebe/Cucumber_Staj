package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Locale;

import static StepDefinitions._01_US_Steps.driver;

public class GWD {
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getDriver() {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (threadBrowserName.get() == null)
            threadBrowserName.set("chrome");


        if (threadDriver.get() == null) {
            switch (threadBrowserName.get()) {
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                default:
                    threadDriver.set(new ChromeDriver());
                    break;
            }

            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }

        return threadDriver.get();
    }

    public static void quitDriver() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit();

            WebDriver hattaki = threadDriver.get();
            hattaki = null;
            threadDriver.set(hattaki);
        }

    }

}