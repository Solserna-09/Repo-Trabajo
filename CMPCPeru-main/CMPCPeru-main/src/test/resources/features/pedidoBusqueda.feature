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
|"https://pe.cwgpxw02kj-empresasc1-s1-public.model-t.cc.commerce.ondemand.com/compraonline/login"|"73615ripley@fdhecommerce.com.pe"|"1234"|"75997"|"361666"|"20"|"360374"|"20"|"OC del cliente oc1 - no despachar"|"NO DESPACHAR TEST IT"|


