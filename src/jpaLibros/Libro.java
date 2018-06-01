package jpaLibros;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the libros database table.
 * 
 */
@Entity
@Table(name="libros")
@NamedQuery(name="Libro.findAll", query="SELECT l FROM Libro l")
public class Libro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=50)
	private String autor;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date fecha;

	@Column(nullable=false, precision=10)
	private double precio;

	@Column(nullable=false, length=50)
	private String título;

	public Libro() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTítulo() {
		return this.título;
	}

	public void setTítulo(String título) {
		this.título = título;
	}

}