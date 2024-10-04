    package TiendaDeport;

    import java.util.ArrayList;     
    import java.time.LocalDate;

    public class Venta {
        private int nroConsecutivo;
        private LocalDate fechaVenta;       //Se declara la fecha por medio de la clase local date, gracias a que se coloca la fecha actual
        private Cliente cliente;
        private ArrayList<Detalle> listaDetalle;
        private double totalVenta = 0;

        /**
         * @param nroConsecutivo
         * @param cliente
         */
        public Venta(int nroConsecutivo, Cliente cliente) {         //Constructor clase venta sin incluir totalVenta, fecha venta y el Array List que incluye los diferentes prodcutos
            this.nroConsecutivo = nroConsecutivo;
            this.cliente = cliente;
            this.fechaVenta = LocalDate.now();
            this.listaDetalle = new ArrayList<>();
        }

        public int getNroConsecutivo() {            //Get numero consecutivo
            return nroConsecutivo;
        }

        public void setNroConsecutivo(int nroConsecutivo) {             //Set numero consecutivo
            this.nroConsecutivo = nroConsecutivo;
        }

        public LocalDate getFechaVenta() {          //Get fecha de venta
            return fechaVenta;
        }

        public void setFechaVenta(LocalDate fechaVenta) {           // Set fecha de venta
            this.fechaVenta = fechaVenta;
        }

        public Cliente getCliente() {               //Get cliente 
            return cliente;
        }

        public void setCliente(Cliente cliente) {           // Set Cliente
            this.cliente = cliente;
        }        
        public void mostrarListaDetalles() {  //Funcion mostrar lista detalles
            totalVenta = 0;
            for (Detalle detalle : listaDetalle) {          //For each para recorrer todo el array y asi imprimir cada instancia de la clase detalle
                System.out.println(detalle);
                totalVenta += detalle.precioProducto();         //La variable totalVenta funciona como acumuladora para cada valor calculado en la clase detalle 
            }
            System.out.println("El valor total de la venta fue = " + totalVenta);       //Imprime el total de la venta incluyendo el precio del producto por la cantidad de productos llevados
        }
        public void adicionarDetalle(Detalle detalle){ //Metodo para adicionar detalles
            listaDetalle.add(detalle);
        }
        
        @Override
        public String toString() {          //To Strinf que retorna los datos de cada venda y datos del cliente 
            return "Numero de venta = " + nroConsecutivo + ", fecha de la venta =" + fechaVenta + ", cliente =" + cliente ;

        }
    }
