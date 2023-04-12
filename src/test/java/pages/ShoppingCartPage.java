package pages;

import org.openqa.selenium.By;
import utils.BasePage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingCartPage extends BasePage {

    Logger logger = Logger.getLogger("CheckoutPage");

    //Se crea constructor
    public ShoppingCartPage() {
        super(driver);
    }

    //Se crean elementos
    private final By CLICK_CART_TOTAL = By.id("cart-total");
    private final By CLICK_VIEWCART = By.xpath("//*[contains(text(),'View Cart')]");
    private final By BUSQUEDA_TEXTO_SHOPPINGCART = By.xpath("//h1[contains(text(),'Use Gift Certificate')]");
    private final By BUSQUEDA_PRODUCTO = By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.table-responsive table.table.table-bordered tbody:nth-child(2) tr:nth-child(1) td.text-left:nth-child(2) > a:nth-child(1)");
    private final By BTN_REMOVER_PRODUCTO = By.cssSelector("#content > form > div > table > tbody > tr > td:nth-child(4) > div > span > button.btn.btn-danger");
    private final By BUSQUEDA_TEXTO_PRODUCTOELIMINADO = By.xpath("//*[@id='content']/p[contains(text(),'Your shopping cart is empty')]");
    private final By BTN_CONTINUE = By.xpath("//*[contains(text(),'Continue')]");

    //Se da click CartTotal
    public void clickCartTotal() {
        try {
            click(CLICK_CART_TOTAL);
        } catch (Exception e) {
            logger.log(Level.INFO, "El WebElement CLICK_CART_TOTAL No se encontro", e);
        }
    }

    //Se da click Checkout
    public void clickViewCart() {
        try {
            click(CLICK_VIEWCART);
        } catch (Exception e) {
            logger.log(Level.INFO, "El WebElement CLICK_VIEWCART No se encontro", e);
        }
    }

    //Se busca texto Use Gift Certificate
    public String busquedaTextoiftCertificate() {
        return obtenerTexto(BUSQUEDA_TEXTO_SHOPPINGCART);
    }

    //Se busca producto
    public String busquedaProducto() {
        return obtenerTexto(BUSQUEDA_PRODUCTO);
    }

    //Se da click Boton Remove
    public void clickBtnRemove() {
        try {
            click(BTN_REMOVER_PRODUCTO);
        } catch (Exception e) {
            logger.log(Level.INFO, "El WebElement BTN_REMOVER_PRODUCTO No se encontro", e);
        }
    }

    //Se busca mensaje de confirmacion de eliminacion de producto
    public String busquedaTextoConfirmacionEliminacion() {
        return obtenerTexto(BUSQUEDA_TEXTO_PRODUCTOELIMINADO);
    }

    //Se da click Boton Continue
    public void clickBtnContinue() {
        try {
            click(BTN_CONTINUE);
        } catch (Exception e) {
            logger.log(Level.INFO, "El WebElement BTN_CONTINUE No se encontro", e);
        }
    }
}
