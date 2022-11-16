
public class ExempleIfLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		
		j++;
		
		if (i == j) {
			System.out.println(" i = j");
		} else {
			System.out.println(" i != j");
		}

		if (i == j) {
			System.out.println(" i = j");
		} else if (i > j){
			System.out.println(" i > j");
		} else if (i <j) {
			System.out.println(" i < j");
		}

		switch (i) {
		case 1:
			// cas i = 1
			break;
		case 2:
			// cas i = 2
			break;

		default:
			// si on n'est pas entre dans un
			// case
			break;
		}
		
		
		for(int z = 0; z < 100; z++) {
			if (z == 50) {
				break;
			}
		}
		 
		while (i < 10) {
			i++;
		}
		
		do {
			i++;
		} while (i != 10);
		
		for(int z = 0; z < 100; z++) {
			if (z == 50) {
				continue;
			}
			System.out.println(z);
		}
		
		
		// on commence le programme
		int k = 1; // on initialise k 
		
		/* Ce programme va effectuer une boucle 
		 * de 1 à 100
		 */
		for(int t = 1; t <100; t++) {
			/* on augmente t */
			t++;
		}
	}

}
