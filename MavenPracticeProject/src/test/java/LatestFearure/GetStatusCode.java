package LatestFearure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v136.network.Network;
import org.openqa.selenium.devtools.v136.network.model.Response;

import java.util.Optional;

public class GetStatusCode {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();

        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        devTools.addListener(Network.responseReceived(),
                response -> {
                    Response res = response.getResponse();
                    System.out.println("URL: " + res.getUrl());
                    System.out.println("Status Code: " + res.getStatus());
                });
   

        driver.get("https://conduit-api.bondaracademy.com/api/tags");

        driver.quit();
    }
}
