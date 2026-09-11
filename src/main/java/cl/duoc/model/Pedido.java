package cl.duoc.model;

import cl.duoc.EstadoPedido;

public class Pedido {
    private int id;
    private String direccionEntrega;
    private EstadoPedido estadoPedido;

    public Pedido(String direccionEntrega, int id, EstadoPedido estadoPedido) {
        this.direccionEntrega = direccionEntrega;
        this.id = id;
        this.estadoPedido = estadoPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public void setEstadoPedido(String nuevoEstado) {
        this.estadoPedido = EstadoPedido.valueOf(nuevoEstado);
    }

    @Override
    public String toString() {
        return
                "ID: " + id + '\n' +
                "Dirección de Entrega: " + direccionEntrega + '\n' +
                "Estado del Pedido: " + estadoPedido;
    }
}


