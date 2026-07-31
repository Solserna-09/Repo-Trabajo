#language: es


Característica: Fecha 16-02-2023-20:12 Pedido de producto sin stock


@PedidoSinStock
  Esquema del escenario:  Pedido de producto sin stock
    Dado que el usuario inicie sesion <url> <correo> <clave>
    Y  este la opcion mis productos <destinatario>
    Cuando seleccione los producto para revisar el carro de compras  <producto> <cantidad> <segundoProducto> <segundaCantidad> <numeroOrdenCompra> <ObservacionOrdenCompra>
    Entonces  el usuario visualizara un mensaje Ha seleccionado productos sin stock

    Ejemplos:
      | url | correo | clave | destinatario | producto | cantidad | segundoProducto | segundaCantidad | numeroOrdenCompra | ObservacionOrdenCompra |
  ##@externaldata@./Data/DataElite.xlsx@PedidoSinStock
|"https://pe.cwgpxw02kj-empresasc1-s1-public.model-t.cc.commerce.ondemand.com/compraonline/login"|"73615ripley@fdhecommerce.com.pe"|"1234"|"75997"|"360374"|"40"|"360442"|"45"|"OC del cliente oc1 - no despachar"|"NO DESPACHAR TEST IT"|

































