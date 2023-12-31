package tema6.ejercicio1;

public class Producto{
	
	private int codigo;
	private String descripcion;
	private float precio;
	private int cantidad; //cantidad de productos en la tienda
	private int minimo; //cantidad minima a tener almacenada

	/**
	 * 
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 * @param cantidad
	 * @param minimo
	 */
	public Producto(int codigo, String descripcion, float precio, int cantidad, int minimo) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.minimo = minimo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	@Override
	public String toString() {
		return "\nProducto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad="
				+ cantidad + ", minimo=" + minimo + "]";
	}
	
}
