import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SignInNegative {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/ProgramData/SeleniumStuff/chromedriver.exe");
        // Open browser.
        ChromeDriver cd = new ChromeDriver();

        // Go to Fubo QA.
        cd.get("https://qa.fubo.tv/sandbox/geolocation");

        // Input value USA.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(new String[]{"USA"});

        // Input ZipCode.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys(new String[]{"94124"});

        // Click on Spoof.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/div[1]")).click();

        // Wait until QA MLP download.
        Thread.sleep(20000);

        // Click on Sign In button.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/button[1]/div[1]/span[1]")).click();

        // Input Email.
        cd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(new String[]{"test@dummy.com"});

        // Input password.
        cd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(new String[]{"12345678"});

        // Click Sign In button.
        cd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/button[1]/div[1]/span[1]")).click();

        //Wait fot error message
        Thread.sleep(5000);

        // Get Error message
        String errormessage = cd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]")).getText();

        String correcterror = "That email and password combination is not valid. Please try again.";

        // Compare error.
        if (errormessage.equals(correcterror)) {
            cd.close();
        } else {
            System.out.println("Something Wrong");
        }
    }
}