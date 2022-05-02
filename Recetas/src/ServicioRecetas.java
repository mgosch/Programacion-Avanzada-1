import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioRecetas {

	public static void main(String[] args) {
		String nombreArchivo = "receta_nuevo.txt";
		
		File file = new File(nombreArchivo);
		try {
			PrintWriter pw = new PrintWriter(file);
			pw.println("Tarta de atún");
			pw.println("1-tapa de tarta");
			pw.println("1/2-cebolla");
			pw.println("1-tomate");
			pw.println("1/2-morrón");
			pw.println("1-lata atún");
			pw.println("2-huevos");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Scanner sc = new Scanner(file);
			Receta receta = new Receta();
			receta.setNombre(sc.nextLine());
			List<Ingrediente> listaIngredientes = new ArrayList<>();
			while(sc.hasNext()) {
				Ingrediente ingrediente = new Ingrediente();
				String[] array = sc.nextLine().split("-");
				ingrediente.setCantidad(Float.parseFloat(array[0]));
				ingrediente.setNombre(array[1]);
				listaIngredientes.add(ingrediente);
			}
			receta.setListaIngredientes(listaIngredientes);
			System.out.println(receta.getNombre());
			System.out.println(receta.getListaIngredientes().get(0).getNombre());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
