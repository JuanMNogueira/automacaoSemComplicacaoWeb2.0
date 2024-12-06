package br.com.chornosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


    public class TesteWeb {
        ChromeDriver driver;
        @Before
    public void inicializateste(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.chronosacademy.com.br");
    }
    @Test
    public void primeiroTeste(){

        WebElement txtTitulo = driver.findElement(By.xpath("//section[2]//h4"));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.", titulo);
        driver.quit();
    }
    @After
    public void finalizaTeste(){
        driver.quit();
    }
}
