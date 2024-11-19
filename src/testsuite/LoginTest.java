//Write down the following test in the ‘LoginTest’ class
//1. userSholdLoginSuccessfullyWithValid
//Credentials()
//* Enter “standard_user” for the username
//* Enter “secret_sauce” for the password
//* Click on the ‘Login’ button
//* Verify the text “Products”
//2. verifyThatSixProductsAreDisplayedOnPage()
//* Enter “standard_user” for the username
//* Enter “secret_sauce” for the password
//* Click on the ‘Login’ button
//* Verify that six products are displayed
//on page
package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseURL = "https://www.saucedemo.com/";

    @Before
    public void setup() {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String expectedText = "Products";
        WebElement products = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
        String actualText = products.getText();
        Assert.assertEquals("Text not displayed", actualText, expectedText);
    }
        @Test
        public void verifyThatSixProductsAreDisplayedOnPage() {
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            String expectedText1 = "Sauce Labs Backpack";
            WebElement Sauce = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
            String actualText1 = Sauce.getText();
            Assert.assertEquals("Text not displayed", actualText1, expectedText1);

            String expectedText2 = "Sauce Labs Bike Light";
            WebElement bikeLight = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
            String actualText2 = bikeLight.getText();
            Assert.assertEquals("Text not displayed", actualText1, expectedText1);

            String expectedText3 = "Sauce Labs Bolt T-Shirt";
            WebElement Bolt = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
           String actualText3 = Bolt.getText();
           Assert.assertEquals("Text not displayed", actualText3, expectedText3);

            String expectedText4 = "Sauce Labs Fleece Jacket";
            WebElement jacket = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
            String actualText4 = jacket.getText();
            Assert.assertEquals("Text not displayed", actualText4, expectedText4);

            String expectedText5 = "Sauce Labs Onesie";
            WebElement onesie = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
            String actualText5 = onesie.getText();
            Assert.assertEquals("Text not displayed", actualText5, expectedText5);

            String expectedText6 = "Test.allTheThings() T-Shirt (Red)";
            WebElement all = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
            String actualText6 = all.getText();
            Assert.assertEquals("Text not displayed", actualText6, expectedText6);
       }
    }

