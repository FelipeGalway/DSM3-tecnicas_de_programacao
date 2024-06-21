/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.exerciciosrevisao;

/**
 *
 * @author Samsung
 */
public class ExercicioPedido {
    /**
	 * Crie um classe chamada Pedido, que deverá conter os seguintes atributos:
	 *  - codigo;
	 *  - quantidade;
	 *  - valorUnitario;
	 *  
	 * Crie uma função que gere dados aleatório de um Pedido;
	 * 
	 * Crie uma lista (array ou list) e preencha com 30 pedidos;
	 * 
	 * Crie funcões que deverão determinar e retornar:
	 *   a. valor total dos pedidos
	 *   b. valor medio dos medido
	 *   c. quantidade media vendida
	 *   e. pedido com o maior valor de venda
	 * @param strings
	 */
	public static void main(String...strings) {
		
		Pedido listaPedidos[] = new Pedido[30];
				
		//preencher as 30 posicoes array com dados de pedidos gerados
		//pela funcao gerarpedido
		for(int i = 0; i < 30; i++) {
		
			listaPedidos[i] = gerarDadosPedido();
			
			//System.out.println("Codigo: " + listaPedidos[i].codigo + " Valor: " + listaPedidos[i].valorUnitario);
		}
		
		System.out.println("Valor total pedidos: " + calcularValorPedidos(listaPedidos));
		System.out.println("Valor medio pedidos: " + calcularValorMedio(listaPedidos));
		
		Pedido pedidoMaiorValor = procurarPedidoMaioValor(listaPedidos);
		System.out.println("Pedido maior valor: " + pedidoMaiorValor.codigo + " - " + pedidoMaiorValor.quantidade
				+ " - " + pedidoMaiorValor.valorUnitario);		
		
		Pedido pedidoMenor = procurarPedidoMenorValor(listaPedidos);
		System.out.println("Pedido menor valor: " + pedidoMenor.codigo + " - " + pedidoMenor.quantidade
				+ " - " + pedidoMenor.valorUnitario);		
		
		mostarPedidos(listaPedidos);
	}
	
	public static void mostarPedidos(Pedido pedidos[]) {
		
		System.out.println("###### LISTA DE PEDIDOS ##########");
		System.out.println("Cod  Qtd   Vl Unit   Total");
		
		for(Pedido p : pedidos) {
			
			System.out.printf("\n%2d   %2d    %.2f      %.2f", 
					p.codigo, p.quantidade, p.valorUnitario, p.calcularTotalDoPedido());
		}
	}
	
	public static Pedido procurarPedidoMaioValor(Pedido pedidos[]) {
		
		Pedido pedidoMaiorValor = pedidos[0];
		
		for(Pedido p : pedidos) {
			
			if( p.calcularTotalDoPedido() > pedidoMaiorValor.calcularTotalDoPedido()) {
				pedidoMaiorValor = p;
			}
		}
		
		return pedidoMaiorValor;
	}
	
	
	public static Pedido procurarPedidoMenorValor(Pedido pedidos[]) {
		
		Pedido pedidoMenorValor = pedidos[0];
		
			for(Pedido p : pedidos) {
			
			if( p.calcularTotalDoPedido() < pedidoMenorValor.calcularTotalDoPedido()) {
				pedidoMenorValor = p;
			}
		}
		
		return pedidoMenorValor;
	}
	
	public static Double calcularValorPedidos(Pedido pedidos[]) {
		
		Double total = 0.0;
		
		//  for(Tipo  variavel : lista)
		for(Pedido p : pedidos) {
			total += (p.valorUnitario * p.quantidade);
		}
		
		return total;
	}
	
	public static Double calcularValorMedio(Pedido pedidos[]) {
		
		Double media = calcularValorPedidos(pedidos) / pedidos.length;
		
		return media;
	}
	
	public static Pedido gerarDadosPedido() {
		
		//cria a instancia de um novo pedido
		Pedido novoPedido = new Pedido();
		
		//atribui as propriedades valore randomicos
		novoPedido.codigo = (int) (Math.random() * 100);
		novoPedido.valorUnitario = Math.random() * 1000;
		novoPedido.quantidade = (int) (Math.random() * 10);		
		
		//retorna o pedido com os dados gerados
		return novoPedido;		
	}
}
