import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.fpt.ivs.at.core.object.UIObject;
import com.fpt.ivs.at.core.utilities.KeywordAssertion;
import com.fpt.ivs.at.core.utilities.WebDriverUtilities;

public class Hello {
    RemoteWebDriver driver = WebDriverUtilities.getDriver();
    public String test() {
        return "Hello World!!";
    }

    public void sendKey(UIObject target, String key){
        WebElement element = target.convertToWebElement(driver);
        element.sendKeys(key);
    }

    public void verifyElementVisible(UIObject target){
        WebElement element = target.convertToWebElement(driver);
        KeywordAssertion.assertConditionFulfilled(element.isDisplayed());
    }

    public String getTextFromElement(UIObject target){
        WebElement element = target.convertToWebElement(driver);
        return element.getText();
    }
}