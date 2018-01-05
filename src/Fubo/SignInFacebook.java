package Fubo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInFacebook {
    public static void main(String[] args) throws InterruptedException {
        // for Chrome.
        System.setProperty("webdriver.chrome.driver", "D:/ProgramData/SeleniumStuff/chromedriver.exe");

        // email value:
        String testEmail = "alex.qa.org@gmail.com";

        // Array for sending values
        String[] myArray = {testEmail};

        // Open browser.
        ChromeDriver cd = new ChromeDriver();

        // Open Spoofing
        cd.get("https://qa.fubo.tv/sandbox/geolocation");

        // Wait until webside with spoofing download.
        Thread.sleep(2000);

        // Input Value USA
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/form/div/div[2]/div[1]/input")).sendKeys(new String[]{"USA"});

        // Input Current Postal Code
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/form/div/div[2]/div[2]/input")).sendKeys(new String[]{"94124"});

        // Click on 'Spoof' button.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/form/div/div[3]/button[1]/div")).click();

        // Wait.
        Thread.sleep(2000);

        // Click 'Sign In' button.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[2]/div[5]/div/button/div/span")).click();

        // Wait.
        Thread.sleep(2000);

        // Click 'Sign In With Facebook' button.
        cd.findElementByCssSelector("body > div.ReactModalPortal > div > div > div > div.modal-content.modal-small > div.modal-body > div > div > div:nth-child(1) > button:nth-child(1)").click();

        // Wait.
        Thread.sleep(5000);

        // Store the current window handle
        String winHandleBefore = cd.getWindowHandle();

        // Switch to new window opened
        for (String winHandle : cd.getWindowHandles()) {
            cd.switchTo().window(winHandle);
            System.out.println("Window switch");
            System.out.println(cd.getTitle());
            if (cd.getTitle().contains("Log into Facebook")) {
                Thread.sleep(3000);
                cd.findElement(By.id("email")).sendKeys(myArray);
                System.out.println("Email found");
                cd.findElement(By.id("pass")).sendKeys(new String[]{"test123456789"});
                System.out.println("Password found");
                Thread.sleep(3000);
                cd.findElement(By.id("loginbutton")).click();
                Thread.sleep(10000);

            }
        }

        // Switch back to original browser (first window)
        cd.switchTo().window(winHandleBefore);

        // Click on 'Menu' button.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/div/span[2]/svg/path")).click();

        // Wait.
        Thread.sleep(2000);

        // Click on 'My Account' button.
        cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/a[1]/span")).click();

        // Wait.
        Thread.sleep(2000);

        // Get information from 'My Profile' about user email.
        String useremail = cd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/span")).getText();

        // Display user email.
        System.out.println("User email is: " + useremail);

        // Compare emails:
        if (testEmail.equals(useremail)) {
            // emails are the same
            System.out.println("Emails are equals");
        } else {
            System.out.println("Emails are different");
            // emails are different
        }


    }

}
