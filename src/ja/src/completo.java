public class completo {

    public static void main (String [ ] args) {
        ProductosAlimentarios listaProductosAlimentarios1[] = new ProductosAlimentarios[5];
        listaProductosAlimentarios1[0] = new ProductosAlimentarios();
        listaProductosAlimentarios1[1] = new Bebidas(200.0,10,'n');
        listaProductosAlimentarios1[2] = new Refrigerados(140.0,20);
        listaProductosAlimentarios1[3] = new Bebidas(120.0,10,'I');
        listaProductosAlimentarios1[4] = new Refrigerados(110.0,7);
        PrecioTotal solucion1 = new PrecioTotal(listaProductosAlimentarios1);
        solucion1.mostrarTotal();
    }

}