public class Plateau {
    public static void main(String args[]) {
        // Implementieren Sie Ihre Loesung hier
        if (args.length >= 3) {
            System.out.println("ERROR: Bitte mindestens 3 Zahlen uebergeben");
        } else{
            int zahlen = new int[args.length];
            for(int i=0; i<args.length; i++) {
                zahlen[i] = Integer.parseInt(args[i]);
            }
            int N = Integer.parseInt(args[0]);
		    int [] array;
		    array = new int [N];
		//variable zur bestimmung der anzahl der arrays
		    int k = 0;
		//variable & array zur bestimmung der array länge
		    int l =0;
		    int [] laenge;
		    laenge = new int [N]; // <- N muss durch iwas noch ersetzt werden da dieses array ja kürzer sein muss als das haupt array
		// array zur bestimmung der position des arrays
		    int [] position;
		    position = new int [N];
            for(int j=1; j<args.length-1; j++) {
                int aktuelleZahl = zahlen;
                for (int i=0; i < N -1;i++) {
			     //zur bestimmung des 1st plateaus falls es am anfang liegt
			    if (array[i]== array[i+1]){
				    while (array[i]== array[i+1]){
					l++;
					position[i] = i; // <- nochmal überdenken da es überschrieben würde?
                        if (array[i]> array[i+1]){
						k++;
						laenge[i] = l;
						/**
						 * Ausgabe der einzelnen array längen */
						  System.out.println ("Länge des Arrays "+ k + "=" + l);

					    }
				    }
                        l=0;
			    }
                    //zur bestimmung jedes weiteren plateaus
			            if (array[i]< array[i+1]) {
				            while (array[i]==array[i+1]){
					            l++;
					position[i] = i;

					if (array [i]> array[i+1]){
						k++;
						laenge[i] = l;
						/**
						 * Ausgabe der einzelnen array längen */
						  System.out.println ("Länge des Arrays "+ k + "=" + l);

                    }
				}

				l = 0;
			}
            }

		// Bestimmung der maximalen länge
        double max = Double.NEGATIVE_INFINITY;
		for (int a = 0; a <= laenge.length-1; a++){
			if (laenge[a] > max)
			{
				max = laenge[a];
			}
		}

		System.out.println("Das laengste Plateau hat die Laenge " + max);


		/**
		//Test für ausgabe des arrays:
		for (int i=0; i>N-1;i++)
			System.out.println(array[i]);

		System.out.println(k); */



    }
}



  }

}
