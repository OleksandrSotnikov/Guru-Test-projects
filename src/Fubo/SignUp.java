package Fubo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/ProgramData/SeleniumStuff/chromedriver.exe");

        // Open browser.
        ChromeDriver cd = new ChromeDriver();

        cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // Expand the window.
        cd.manage().window().maximize();

        // Go to Fubo QA.
        cd.get("https://qa.fubo.tv/sandbox/geolocation");

        // Input value USA.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/form/div/div[2]/div[1]/input")).sendKeys(new String[]{"USA"});

        // Input ZipCode.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/form/div/div[2]/div[2]/input")).sendKeys(new String[]{"94124"});

        // Click on Spoof.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/form/div/div[3]/button[1]/div")).click();

        // Wait until QA MLP download.
        //Thread.sleep(5000);

        // Click "Sign Up" button.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/a/span")).click();

        // Wait until Sign Up download.
        //Thread.sleep(5000);

        // Input email.

        String prefix = "aaaa";
        String suffix = "@dummy.com";

        String testEmail = prefix + Math.round(Math.random() * 1000000) + suffix;

        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div/input")).sendKeys(new String[]{testEmail});

        // Click 'Sign Up' button.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div[2]/div/form/div[2]/button/div")).click();

        // Wait until Sign Up download.
        //Thread.sleep(5000);

        // Input First Name
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[3]/div/div/form/div[1]/input")).sendKeys(new String[]{"FirstNameTest"});

        // Input Last Name
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[3]/div/div/form/div[2]/input")).sendKeys(new String[]{"LastNameTest"});

        //Input Password
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[3]/div/div/form/div[3]/div/input")).sendKeys(new String[]{"test1234"});

        // Click 'Select Package' button
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[3]/div/div/form/div[4]/button/div/span")).click();

        // Wait until page download.
        //Thread.sleep(10000);

        // Choose fubo Premier
        //cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/div[1]/label[1]")).click();

        // Click on 'Go to next step'
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[3]/div/div[2]/div[1]/button/div/span")).click();

        // Wait until page download.
        // Thread.sleep(5000);

        // Click continue to last step (We skip adding addons)
        //cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/button[1]")).click();

        // Wait until page download.
        //Thread.sleep(5000);

        // Input Card holder First and Last Name.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[3]/div/div[1]/form/div/div[1]/div/input")).sendKeys(new String[]{"First"});
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[3]/div/div[1]/form/div/div[2]/div/input")).sendKeys(new String[]{"Last"});

        //Integer numberOfFrames = Integer.parseInt(cd.executeScript("return window.length").toString());
        //System.out.println("Number of iframes on the page are " + numberOfFrames);

        cd.switchTo().frame(0);     // entering the iframe

        // Input Card Number
        cd.findElement(By.xpath("//*[@id=\"recurly-hosted-field-input\"]")).sendKeys(new String[]{"5555 5555 5555 4444"});

        cd.switchTo().defaultContent();
        cd.switchTo().frame(1);     // entering the iframe

        // Input Security Code.
        cd.findElement(By.xpath("//*[@id=\"recurly-hosted-field-input\"]")).sendKeys(new String[]{"019"});


        cd.switchTo().defaultContent();
        cd.switchTo().frame(2);     // entering the iframe

        // Input Month
        cd.findElement(By.xpath("//*[@id=\"recurly-hosted-field-input\"]")).sendKeys(new String[]{"9"});

        cd.switchTo().defaultContent();
        cd.switchTo().frame(3);     // entering the iframe

        // Input Year
        cd.findElement(By.xpath("//*[@id=\"recurly-hosted-field-input\"]")).sendKeys(new String[]{"19"});


        cd.switchTo().defaultContent();     // exiting the iframe

        // Input Zip Code
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[3]/div/div[1]/form/div/div[7]/div/input")).sendKeys(new String[]{"94124"});

        // Click 'Start Watching' button.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[3]/div/div[2]/div[1]/button/div/span")).click();

        // Wait
        //Thread.sleep(5000);

        // Click on menu button.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div/span[2]")).click();

        // Click My Account.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/a[1]/span")).click();

        // Wait
        //Thread.sleep(5000);

        // Get information from 'My Profile' about user email.
        String useremail = cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/span")).getText();

        // Click 'Subscription' tab.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[4]/div[2]/div/div[1]/p[2]/span")).click();

        // Wait
        //Thread.sleep(2000);

        // Get information from 'My Subscription'
        String userpackage = cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span")).getText();

        // Display user package
        System.out.println("User package is: " + userpackage);

        // Display user email.
        System.out.println("User email is: " + useremail);

        // Compare emails:
        if (testEmail.equals(useremail)) {
            // emails are the same
            System.out.println("Emails are equals");
            cd.close();
        } else {
            System.out.println("Emails are different");
            // emails are different


        }
    }

}