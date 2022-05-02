import java.util.List;

public class Receta {
	
	private String nombre;
	private List<Ingrediente> listaIngredientes;

    public Receta (String nombre, List<Ingrediente> listaIngredientes){
    	this.nombre = nombre;
    	this.listaIngredientes = listaIngredientes;
    }

	public Receta() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ingrediente> getListaIngredientes() {
		return listaIngredientes;
	}

	public void setListaIngredientes(List<Ingrediente> listaIngredientes) {
		this.listaIngredientes = listaIngredientes;
	}
}
