package parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class login {
    @Test
    public void loginfunction() throws IOException {
        Properties prop = new Properties();
        FileInputStream src = new FileInputStream("C:\\Users\\syful\\eclipse-workspace\\GlobalVariables\\src\\parameters\\datadriver.properties");
        prop.load(src);
        System.out.println(prop.getProperty("username"));
        System.setProperty("webdriver.chrome.driver","C:\\Users\\syful\\eclipse-workspace\\GlobalVariables\\lib\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(prop.getProperty("url"));


    }
}
