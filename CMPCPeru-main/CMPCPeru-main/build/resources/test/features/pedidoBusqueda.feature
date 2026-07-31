#language: es


Característica: Fecha 16-02-2023-18:53 Pedido por busqueda

@PedidoBarraBusqueda
  Esquema del escenario: : Pedido por busqueda
    Dado que el usuario se encuentra logueado en la pagina <url> <correo> <clave> <destinatario>
    Cuando el usuario busque los productos por codigo para agregarlos al carro de compras <producto> <cantidad> <segundoProducto> <segundaCantidad> <numeroOrdenCompra> <ObservacionOrdenCompra>
    Y lo consulte el pedido para cancelarlo
    Entonces  el podra visualizara un mensaje de Cancelado por cliente

    Ejemplos:
      | url                                                                    | correo                         | clave  | destinatario | producto | cantidad | segundoProducto | segundaCantidad | numeroOrdenCompra                   | ObservacionOrdenCompra |
    ##@externaldata@./Data/DataElite.xlsx@PedidoBarraBusqueda
|"https://hybris-stag.eliteprofessional.cmpc.com.pe/compraonline/login"|"pruebas2022@pruebaccv2.com.pe"|"1234"|"75992"|"1550"|"20"|"360484"|"20"|"OC del cliente oc1 - no despachar"|"NO DESPACHAR TEST IT"|


