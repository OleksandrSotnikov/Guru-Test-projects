import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
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
        Thread.sleep(10000);

        // Click "Sign Up" button.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();

        // Wait until Sign Up download.
        Thread.sleep(10000);

        // Input email.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(new String[]{"autouser1@dummy.com"});

        // Click 'Sign Up' button.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/button[1]/div[1]")).click();

        // Wait until Sign Up download.
        Thread.sleep(10000);

        // Input First Name
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys(new String[]{"FirstNameTest"});

        // Input Last Name
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys(new String[]{"LastNameTest"});

        //Input Password
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).sendKeys(new String[]{"test1234"});

        // Click 'Select Package' button
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/div[1]")).click();

        // Wait until page download.
        Thread.sleep(10000);

        // Choose fubo Premier
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/div[1]/label[1]")).click();

        // Click on 'Go to next step'
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/button[1]/div[1]")).click();

        // Wait until page download.
        Thread.sleep(10000);

        // Click continue to last step (We skip adding addons)
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/button[1]")).click();

        // Wait until page download.
        Thread.sleep(10000);

        // Input Card holder First and Last Name.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(new String[]{"First"});
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(new String[]{"Last"});

        // Input Card Number
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/iframe[1]")).sendKeys(new String[]{"5555 5555 5555 4444"});

        // Input Security Code.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/iframe[1]")).sendKeys(new String[]{"019"});

        // Input Month, Year and ZipCode
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/iframe[1]")).sendKeys(new String[]{"9"});
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/iframe[1]")).sendKeys(new String[]{"19"});
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/input[1]")).sendKeys(new String[]{"94124"});

        // Click 'Start Watching' button.
        cd.findElement(By.xpath("id(\"root\")/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/button[1]")).click();


    }
}