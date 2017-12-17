package Fubo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpoofAndSignIn {
    public static void main(String[] args) throws InterruptedException {
        // Open browser.
        // For FireFox.
        // System.setProperty("webdriver.gecko.driver","D:/ProgramData/SeleniumStuff/geckodriver.exe");

        // for FireFox.
        System.setProperty("webdriver.chrome.driver", "D:/ProgramData/SeleniumStuff/chromedriver.exe");

        // for Chrome.
        ChromeDriver cd = new ChromeDriver();

        // Go to Fubo QA.
        cd.get("https://qa.fubo.tv/sandbox/geolocation");

        // Wait until webside with spoofing download.
        //Thread.sleep(2000);

        // Input value USA.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(new String[]{"USA"});

        // Input ZipCode.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys(new String[]{"94124"});

        // Click on Spoof.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/div[1]")).click();

        // Wait until QA MLP download.
        Thread.sleep(10000);

        // Click on 'Sign In'.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/button[1]/div[1]/span[1]")).click();

        // Input email.
        cd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(new String[]{"test@dummy.com"});

        // Input password.
        cd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(new String[]{"test1234"});

        // Click 'Sign In' button.
        cd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/button[1]/div[1]/span[1]")).click();


    }
}
