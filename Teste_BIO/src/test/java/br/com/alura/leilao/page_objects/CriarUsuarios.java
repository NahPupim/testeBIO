package br.com.alura.leilao.page_objects;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CriarUsuarios {

    private static final String URL_LOGIN = "https://automacaocombatista.herokuapp.com/users/new";

    private WebDriver browser;

    public CriarUsuarios() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        this.browser = new FirefoxDriver();
        this.browser.navigate().to(URL_LOGIN);
    }

    public void preencherFormularioDeCadastro(String username, String lastname,String Email, String Endereço,String Universidade, String Profissão,String Genero, String idade ) {


        browser.findElement(By.id("user_name")).sendKeys(username);
        browser.findElement(By.id("user_lastname")).sendKeys(lastname);

        browser.findElement(By.id("user_email")).sendKeys(Email);
        browser.findElement(By.id("user_address")).sendKeys(Endereço);

        browser.findElement(By.id("user_profile")).sendKeys(Profissão);

        browser.findElement(By.id("user_university")).sendKeys(Universidade);
        browser.findElement(By.id("user_gender")).sendKeys(Genero);

        browser.findElement(By.id("user_age")).sendKeys(idade);

    }

    public void efetuarCadastro() {
        browser.findElement(By.name("commit")).submit();
    }

    public String pegamessagem()throws InterruptedException{


        try {
            WebDriverWait pera = new WebDriverWait(browser,10);
            pera.until(ExpectedConditions.visibilityOfElementLocated(By.id("notice")));
            return browser.findElement(By.id("notice")).getText();
        } catch (NoSuchElementException e) {
            return null;
        }

    }




    public void fechar() {
        this.browser.quit();
    }


}
