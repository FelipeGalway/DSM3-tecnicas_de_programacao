/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.felipe.pedido;

/**
 *
 * @author Samsung
 */

public class Pedido {
                   
        private Integer codigo;
        
        private String cliente;
        
        private Double totalPedido;
        
        /**
         * Construtor sobrecarregado de pedido
         * @param codigo
         * @param cliente
         * @param totalPedido
         */
        
        public Pedido(Integer codigo, String cliente, Double totalPedido) {
            this.codigo = codigo;
            this.cliente = cliente;
            this.totalPedido = totalPedido;
        }
        
        public Integer getCodigo() {
            return codigo;
        }
        
        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }

        public String getCliente() {
            return cliente;
        }

        public void setCliente(String cliente) {
            this.cliente = cliente;
        }

        public Double getTotalPedido() {
            return totalPedido;
        }

        public void setTotalPedido(Double totalPedido) {
            this.totalPedido = totalPedido;
        }

        @Override
        public String toString() {
            return "Pedido{" + "codigo=" + codigo + ", cliente=" + cliente + ", totalPedido=" + totalPedido + '}';
        }
                
}

    
