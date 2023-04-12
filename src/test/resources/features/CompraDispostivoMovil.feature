Feature: Compra de un iPhone en el carrito de compras
  Como usuario de una tienda en línea
  Quiero poder agregar un iPhone a mi carrito de compras
  Para verlo en mi carrito y eliminarlo si así lo deseo

  @Test
  Scenario: Agregar un iPhone al carrito de compras y eliminar la compra
    Given que estoy en la pagina de inicio de la tienda en linea http://opencart.abstracta.us/
    And escribo "iPhone" en el campo de busqueda
    When hago clic en el boton Buscar
    And selecciono el modelo iPhone
    Then se muestra la pagina del producto iPhone
    When hago clic en el boton Agregar al carrito
    Then se agrega iPhone al carrito de compras
    When accedo al carrito de compras
    Then veo iPhone en el carrito
    When hago clic en el boton Remover
    Then se elimina iPhone del carrito de compras


