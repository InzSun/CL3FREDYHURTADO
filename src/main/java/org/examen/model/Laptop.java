package org.examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	
	@Id
	@Column(name = "cod_laptop")
	private String codigo;
	
	@Column(name = "des_laptop")
	private String descripcion;
	
	@Column(name = "pre_laptop")
	private double precio;
	@Column(name = "sto_laptop")
	private int stock;

	private String cod_marca;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCod_marca() {
		return cod_marca;
	}

	public void setCod_marca(String cod_marca) {
		this.cod_marca = cod_marca;
	}


}
