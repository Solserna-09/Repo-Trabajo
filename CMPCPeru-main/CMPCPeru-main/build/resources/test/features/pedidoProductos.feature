#language: es


Característica: Fecha 16-02-2023-16:44 Pedido por mis productos

  @PedidoProducto
  Esquema del escenario: : Pedido por mis productos
    Dado que el usuario se encuentra logueado <url> <correo> <clave>
    Y  en la opcion mis productos <destinatario>
    Cuando  el adicione los productos al carro para completar la informacion de pago <producto> <cantidad> <segundoProducto> <segundaCantidad> <numeroOrdenCompra> <ObservacionOrdenCompra>
    Y consulte el pedido para cancelarlo
    Entonces  el visualizara un mensaje de Cancelado por cliente


    Ejemplos:
      | url                                                                    | correo                         | clave  | destinatario | producto | cantidad | segundoProducto | segundaCantidad | numeroOrdenCompra                   | ObservacionOrdenCompra |
    ##@externaldata@./Data/DataElite.xlsx@PedidoMisProductos
|"https://pe.cwgpxw02kj-empresasc1-s1-public.model-t.cc.commerce.ondemand.com/compraonline/login"|"73615ripley@fdhecommerce.com.pe"|"1234"|"75997"|"360374"|"20"|"361666"|"20"|"OC del cliente oc1 - no despachar"|"NO DESPACHAR TEST IT"|
