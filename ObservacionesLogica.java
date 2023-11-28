    package com.login;

    import java.util.List;

    public class ObservacionesLogica {
        private String tipoOservacion, detalleObservacion;

        public ObservacionesLogica(String tipoOservacion, String detalleObservacion) {
            this.tipoOservacion = tipoOservacion;
            this.detalleObservacion = detalleObservacion;
        }

        public String getTipoOservacion() {
            return tipoOservacion;
        }

        public void setTipoOservacion(String tipoOservacion) {
            this.tipoOservacion = tipoOservacion;
        }

        public String getDetalleObservacion() {
            return detalleObservacion;
        }

        public void setDetalleObservacion(String detalleObservacion) {
            this.detalleObservacion = detalleObservacion;
        }

        public void verPaquetes(List<Paquete> paquetes) {
        for (Paquete paquete : paquetes) {
            String estadoEnvio = paquete.getEstadoEnvio();
            System.out.println(paquete.getID() + " - (estado de envío: " + estadoEnvio + ")");
            }
        }

        private void reportarIncidente(){

        }

        public void verGastosAnuales(List<Paquete> paquetes) {
        double totalGastos = 0.0;

        System.out.println("Lista de Paquetes:");
        for (Paquete paquete : paquetes) {
            String estadoEnvio = paquete.getEstadoEnvio();
            System.out.println(paquete.getID() + " - Estado de Envío: " + estadoEnvio + " - Precio: " + paquete.getPrecio());
            totalGastos += paquete.getPrecio();
            }

        System.out.println("\nTotal de Gastos Anuales: " + totalGastos);
        }

        private void solicitarReembolos(){

        }
    }
