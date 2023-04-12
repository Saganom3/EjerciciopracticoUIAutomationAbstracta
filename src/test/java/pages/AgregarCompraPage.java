package pages;

import org.openqa.selenium.By;
import utils.BasePage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgregarCompraPage extends BasePage {

    Logger logger = Logger.getLogger("AgregarCompraPage");

    //Se crea constructor
    public AgregarCompraPage() {
        super(driver);
    }

    //Se crean elementos
    private final By BTN_ADDCART = By.id("button-cart");
    private final By BUSQUEDA_TEXTO = By.xpath("//*[contains(text(),'Success: You have added ')]");

    //Se da click Boton Add to Cart
    public void clickBtnAddToCart() {
        try {
            click(BTN_ADDCART);
        } catch (Exception e) {
            logger.log(Level.INFO, "El WebElement BTN_ADDCART No se encontro", e);
        }
    }

    //Se busca texto
    public String busquedaTexto() {
        return obtenerTexto(BUSQUEDA_TEXTO);
    }
}
