package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.*;

public class CompraDispositivoMovilSteps {

    NavegarToPage navegarToPage = new NavegarToPage();
    YourStorePage yourStorePage = new YourStorePage();
    SearchPage searchPage = new SearchPage();
    AgregarCompraPage agregarCompraPage = new AgregarCompraPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Given("^que estoy en la pagina de inicio de la tienda en linea (.+)$")
    public void queEstoyEnLaPaginaDeInicioDeLaTiendaEnLineaHttpOpencartAbstractaUs(String url) {
        navegarToPage.navegateToUrl(url);
        Assert.assertEquals("Your Store", navegarToPage.busquedaTextoYourStore());
    }

    @And("escribo {string} en el campo de busqueda")
    public void escriboEnElCampoDeBusqueda(String marca) {
        yourStorePage.inputTxtSearch(marca);
    }

    @When("^hago clic en el boton Buscar$")
    public void hagoClicEnElBotonBuscar() {
        yourStorePage.clicBtnSearch();
    }

    @And("^selecciono el modelo iPhone$")
    public void seleccionoElModeloIPhone() {
        Assert.assertTrue(searchPage.busquedaTextoSearch().contains("Search Criteria"));
        searchPage.seleccionarProducto();
    }

    @Then("^se muestra la pagina del producto iPhone$")
    public void seMuestraLaPaginaDelProductoIPhone() {
        Assert.assertTrue(searchPage.busquedaTexto_Descripcion().contains("iPhone is a revolutionary new mobile"));
    }

    @When("^hago clic en el boton Agregar al carrito$")
    public void hagoClicEnElBotonAgregarAlCarrito() {
        agregarCompraPage.clickBtnAddToCart();
    }

    @Then("^se agrega iPhone al carrito de compras$")
    public void seAgregaIPhoneAlCarritoDeCompras() {
        Assert.assertTrue(agregarCompraPage.busquedaTexto().contains("Success: You have added"));
    }

    @When("^accedo al carrito de compras$")
    public void accedoAlCarritoDeCompras() {
        shoppingCartPage.clickCartTotal();
        shoppingCartPage.clickViewCart();
        Assert.assertTrue(shoppingCartPage.busquedaTextoiftCertificate().contains("Use Gift Certificate"));
    }

    @Then("^veo iPhone en el carrito$")
    public void veoIPhoneEnElCarrito() {
        Assert.assertTrue(shoppingCartPage.busquedaProducto().contains("iPhone"));
    }

    @When("^hago clic en el boton Remover$")
    public void hagoClicEnElBotonEliminar() {
        shoppingCartPage.clickBtnRemove();
    }

    @Then("^se elimina iPhone del carrito de compras$")
    public void seEliminaIPhoneDelCarritoDeCompras() {
        Assert.assertTrue(shoppingCartPage.busquedaTextoConfirmacionEliminacion().contains("Your shopping cart is empty!"));
        shoppingCartPage.clickBtnContinue();
    }
}