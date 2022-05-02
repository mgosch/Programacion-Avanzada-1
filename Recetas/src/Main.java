public class Main {

	public static void main(String[] args) {
		
		//receta
		String ing1 = "queso";
		String ing2 = "huevo";
		String ing3 = "papa";

		String[] recetaTortilla = new String[3];
		recetaTortilla[0] = ing1;
		recetaTortilla[1] = ing2;
		recetaTortilla[2] = ing3;
		
		System.out.println("Receta");
		for (int i = 0; i < recetaTortilla.length; i++) {
			System.out.println(i + "- " + recetaTortilla[i]);
		}
		
		//heladera
		String ingHel1 = "queso";
		String ingHel2 = "huevo";
		
		String[] ingredientesDisponibles = new String[2];
		ingredientesDisponibles[0] = ingHel1;
		ingredientesDisponibles[1] = ingHel2;

        System.out.println("Heladera");
		for (int i = 0; i < ingredientesDisponibles.length; i++) {
			System.out.println(i + "- " + ingredientesDisponibles[i]);
		}
		
		boolean recetaHeladera = buscarRecetaEnHeladera(recetaTortilla, ingredientesDisponibles); 
		
		if (recetaHeladera) {
			System.out.println("Están todos los ingredientes en la heladera");
		} else {
			System.out.println("No todos los ingredientes se encuentran en la heladera");
		};
		
	}

	private static boolean buscarRecetaEnHeladera(String[] recetaTortilla, String[] ingredientesDisponibles) {
		for (int i = 0; i < recetaTortilla.length; i++) {
			// recorrer el array de ingredientes
			if (buscarEnHeladera(recetaTortilla[i], ingredientesDisponibles) == false) {
				return false;
			} 
		}
		return true;
	}

	private static boolean buscarEnHeladera(String recetaTortilla, String[] ingredientesDisponibles) {
		for (int j = 0; j < ingredientesDisponibles.length; j++) {
			if (recetaTortilla.equals(ingredientesDisponibles[j])) {
				return true;
			}
		}
		return false;
	}

}
