package utilities;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.Select;




public class ReusableMethods {
    private static int timeout = 5;
    public static void selectByVisibleText(MobileElement element, String text) {
        Select objSelect = new Select(element);
        objSelect.selectByVisibleText(text);
    }
    public static void click(MobileElement element) {
          }
    public static void waitAndClick(MobileElement element) throws InterruptedException {

        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {

            }
        }
    }
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
