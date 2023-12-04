public class MaquinaDeRefrescos
{
   
    private int costo;
    private int cantidad;
    private int caja;
    
    public MaquinaDeRefrescos()
    {
        this.costo = 0;
        this.cantidad = 0;
        this.caja = 0;
    }
    
    public MaquinaDeRefrescos(int costo, int cantidad, int caja)
    {
        this.costo = costo;
        this.cantidad = cantidad;
        this.caja = caja;
    }
    
    public int getCosto()
    {
        return this.costo;
    }
    
    public void setCosto(int costo)
    {
        this.costo = costo;
    }
    
    public int getCantidad()
    {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }
    
    public int getCaja()
    {
        return this.caja;
    }
    
    public void setCaja(int caja)
    {
        this.caja = caja;
    }
    
    public void solicitarRefresco(int dinero)
    {
        if (dinero == this.getCosto() ){
            //entrega del refresco previa verificacion
            if (this.getCantidad() > 0) {
                //entregar el refresco
                this.setCantidad(this.getCantidad() - 1);
                this.setCaja(this.getCaja() + dinero);
                System.out.println("---------------------------");
                System.out.println("Recoje  tu refresco");
                System.out.println("Gracias por tu compra");
                System.out.println("---------------------------");
            }
            else{
                System.out.println("---------------------------");
                System.out.println("Lo siento ya no hay refrescos");
                System.out.println("---------------------------");
            }
        }
        else{
            System.out.println("---------------------------");
            System.out.println("El costo del refresco es: "+this.getCosto());
            System.out.println("Puedes intentar con otra moneda");
            System.out.println("---------------------------");
        }
    }
        
        public void actualizarPrecio(int nuevoCosto)
        {
          this.setCosto(nuevoCosto);  
          System.out.println("---------------------------");
          System.out.println("El costo se actualizo a $ "+ this.getCosto());
          System.out.println("---------------------------");
            
        }
        
        public void llenarMaquina(int cantidad)
        {
            this.setCantidad(this.getCantidad() + cantidad);
            System.out.println("---------------------------");
            System.out.println("La maquina tiene "+ this.getCantidad() + " refrescos" );
            System.out.println("---------------------------");
        }
        
        public void mostrarEstado()
        {
           System.out.println("---------------------------");
           System.out.println("Estado de la maquina ");
           System.out.println("Costo del refresco:" + this.getCosto());
           System.out.println("Cantidad de Refrescos: " + this.getCantidad());
           System.out.println("Monto en Caja: " + this.getCaja());
           System.out.println("---------------------------");
        }
    }

