package pages;

import org.openqa.selenium.By;
import utils.BasePage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class YourStorePage extends BasePage {

    Logger logger = Logger.getLogger("SearchPage");

    //Se crea constructor
    public YourStorePage() {
        super(driver);
    }

    //Se crean elementos
    private final By TXT_SEARCH = By.name("search");
    private final By BTN_SEARCH = By.cssSelector("#search > span > button > i");

    //Se Ingresa busqueda
    public void inputTxtSearch(String texto) {
        try {
            escribir(TXT_SEARCH, texto);
        } catch (Exception e) {
            logger.log(Level.INFO, "El WebElement TXT_SEARCH No se encontro", e);
        }
    }

    //Clic boton buscar
    public void clicBtnSearch() {
        try {
            click(BTN_SEARCH);
        } catch (Exception e) {
            logger.log(Level.INFO, "El WebElement TXT_SEARCH No se encontro", e);
        }
    }


}
