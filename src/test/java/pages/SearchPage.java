package pages;

import org.openqa.selenium.By;
import utils.BasePage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchPage extends BasePage {

    Logger logger = Logger.getLogger("SearchPage");

    //Se crea constructor
    public SearchPage() {
        super(driver);
    }

    //Se crean elementos
    private final By BUSCAR_TEXTO_SEARCH = By.xpath("//*[contains(text(),'Search Criteria')]");
    private final By SELECCIONAR_PRODUCTO = By.xpath("//a[contains(text(),'iPhone')]");
    private final By BUSQUEDA_TEXTO_DESCRIPCION = By.xpath("//*[contains(text(),'iPhone is a revolutionary new mobile')]");


    //Se busca texto
    public String busquedaTextoSearch() {
        return obtenerTexto(BUSCAR_TEXTO_SEARCH);
    }

    //Se selecciona producto
    public void seleccionarProducto() {
        try {
            click(SELECCIONAR_PRODUCTO);
        } catch (Exception e) {
            logger.log(Level.INFO, "El WebElement SELECCIONAR_PRODUCTO No se encontro", e);
        }
    }

    //Se busca texto
    public String busquedaTexto_Descripcion() {
        return obtenerTexto(BUSQUEDA_TEXTO_DESCRIPCION);
    }

}
