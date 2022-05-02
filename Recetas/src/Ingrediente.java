
public class Ingrediente {
	
	private String nombre;
	private Long codigo;
	private float cantidad;

    public Ingrediente (String nombre, Long codigo, float cantidad){
    	this.nombre = nombre;
    	this.codigo = codigo;
    	this.cantidad = cantidad;
    }

	public Ingrediente() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
}
