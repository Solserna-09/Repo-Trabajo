#language: es


Característica: Fecha 16-02-2023-17:32 Pedido por categoria

  @PedidoCategoria
  Esquema del escenario: :  Pedido de productos por Catalogo
    Dado que este logueado <url> <correo> <clave>
    Y que el usuario se encuentre en la opcion Catalogo <destinatario>
    Cuando  el adicione los productos por categoria al carro para completar la informacion de pago <categoria> <producto> <cantidad> <segundoProducto> <segundaCantidad> <numeroOrdenCompra> <ordenCompra>
    Y el consulte el pedido para cancelarlo
    Entonces  el usuario visualizara un mensaje de Cancelado por cliente

    Ejemplos:
      | url | correo | clave | destinatario | categoria | producto | cantidad | segundoProducto | segundaCantidad | numeroOrdenCompra | ordenCompra |
 ##@externaldata@./Data/DataElite.xlsx@PedidoCatalogo
|"https://hybris-stag.eliteprofessional.cmpc.com.pe/compraonline/login"|"pruebas2022@pruebaccv2.com.pe"|"1234"|"75992"|"Papel Higiénico"|"360586"|"50"|"370049"|"30"|"OC del cliente oc1 - no despachar"|"NO DESPACHAR TEST IT"|






























