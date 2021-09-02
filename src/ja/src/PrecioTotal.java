public class PrecioTotal {
    

    private double tProductosAlimentarios;
    private double tBebidas;
    private double tRefrigerados;

    private ProductosAlimentarios listatProductosAlimentarios[];

    public PrecioTotal(){
        this.tProductosAlimentarios = 0.0;
        this.tBebidas = 0.0;
        this.tRefrigerados = 0.0;
    }

    public PrecioTotal(ProductosAlimentarios listatProductosAlimentarios []){
        this.tProductosAlimentarios = 0.0;
        this.tBebidas = 0.0;
        this.tRefrigerados = 0.0;

        this.listatProductosAlimentarios = listatProductosAlimentarios;
    }


    public void mostrarTotal(){
        for (ProductosAlimentarios el: listatProductosAlimentarios){
            if(el instanceof ProductosAlimentarios){
                tProductosAlimentarios = tProductosAlimentarios + el.calcularPrecio();
            }
            if (el instanceof Bebidas){
                tBebidas = tBebidas + el.calcularPrecio();
            }
            if (el instanceof Refrigerados){
                tRefrigerados = tRefrigerados + el.calcularPrecio();
            }
        }
        System.out.println("El precio total de los Productos Alimentarios es de " + tProductosAlimentarios);
        System.out.println("La suma del precio de las Bebidas es de " + tBebidas);
        System.out.println("La suma del precio de los Refrigerados es de " + tRefrigerados);
    }
}
