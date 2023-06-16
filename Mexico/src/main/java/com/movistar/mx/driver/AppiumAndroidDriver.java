package com.movistar.mx.driver;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumAndroidDriver {

    public static AppiumDriver<MobileElement> driver;

    public static AppiumAndroidDriver suNavegador() {
        try {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browserstack.user", "makyra_VtTzLS");
            caps.setCapability("browserstack.key", "oHPdqBs2x2CqYmqyGSK7");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 3");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
            caps.setCapability(MobileCapabilityType.APP, "bs://4e0a173bf491463afb9a1a3f48eb19f4d639abdf");
            caps.setCapability("autoGrantPermissions",true);


            driver = new AppiumDriver<MobileElement>(new URL("https://hub-cloud.browserstack.com/wd/hub"), caps);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new AppiumAndroidDriver();
    }

    public io.appium.java_client.AppiumDriver<MobileElement> onDriver() {
        return driver;
    }

}
