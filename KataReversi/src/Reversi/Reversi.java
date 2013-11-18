package Reversi;

public class Reversi {

/*-----------------------Mouvements sur les lignes-----------------------------*/

	public String printLegalMoves(String input) {
		
		String[] lignes = input.split("\n");	
		String output="";
		if ("B".equals(this.turnIsAt(input)))
		{
			for(int i = 0; i < lignes.length; i++)
			{
				if(lignes[i].indexOf("BW.")!=-1)
				{
					lignes[i] = lignes[i].replace("BW.", "BW0");
					output = output + lignes[i] + "\n";
				}
				else if(lignes[i].indexOf(".WB")!=-1)
				{
					lignes[i] = lignes[i].replace(".WB", "0WB");
					output = output + lignes[i] + "\n";
				}
				else
				{
					if(i==8){
						output = output + lignes[i];
					}
					else{
						output = output + lignes[i] + "\n";
					}
				}
			}
		}
		
		else if ("W".equals(this.turnIsAt(input)))
		{
			for(int i = 0; i < lignes.length; i++)
			{
				if(lignes[i].indexOf(".BW")!=-1)
				{
					lignes[i] = lignes[i].replace(".BW", "0BW");
					output = output + lignes[i] + "\n";
				}
				else if(lignes[i].indexOf("WB.")!=-1)
				{
					lignes[i] = lignes[i].replace("WB.", "WB0");
					output = output + lignes[i] + "\n";
				}
				else
				{
					if(i==8){
						output = output + lignes[i];
					}
					else{
						output = output + lignes[i] + "\n";
					}
				}
			}
		}

		return output;

		//En ligne
		  /*  for (int i = 0; i < tableau.length; i++) {
		    	if(tableau[i].indexOf("B")<tableau[i].indexOf("W.") && tableau[i].indexOf("B")!=-1){
		    		tableau[i] = tableau[i].replace("W.","W0");
		    	}
		    	if(tableau[i].indexOf("B")>tableau[i].indexOf(".W") && tableau[i].indexOf("B")!=-1){
		    		tableau[i] = tableau[i].replace(".W","0W");
		    	}
		    	System.out.println(tableau[i]);	    	
			}*/
	}

	
	/*-----------------------Mouvements sur les colonnes-----------------------------*/

	public String printLegalMoves2(String input){
		String[] lignes = input.split("\n");	
		String output="";
		int e=0;
		
		if ("B".equals(this.turnIsAt(input)))
		{
			for(int i = 0; i < lignes.length; i++)
			{
				if(lignes[i].indexOf("B")!=-1)
				{
					lignes[i] = lignes[i].replace("BW.", "BW0");
					output = output + lignes[i] + "\n";
				}
				else if(lignes[i].indexOf(".WB")!=-1)
				{
					lignes[i] = lignes[i].replace(".WB", "0WB");
					output = output + lignes[i] + "\n";
				}
				else
				{
					if(i==8){
						output = output + lignes[i];
					}
					else{
						output = output + lignes[i] + "\n";
					}
				}
			}
		}
		
		else if ("W".equals(this.turnIsAt(input)))
		{
			for(int i = 0; i < lignes.length; i++)
			{
				if(lignes[i].indexOf(".BW")!=-1)
				{
					lignes[i] = lignes[i].replace(".BW", "0BW");
					output = output + lignes[i] + "\n";
				}
				else if(lignes[i].indexOf("WB.")!=-1)
				{
					lignes[i] = lignes[i].replace("WB.", "WB0");
					output = output + lignes[i] + "\n";
				}
				else
				{
					if(i==8){
						output = output + lignes[i];
					}
					else{
						output = output + lignes[i] + "\n";
					}
				}
			}
		}

		return output;

	}
	
	
	
	
	
	

	/*public static void main(String[] args){
		String input=""+
				"........\n"
				+ "........\n"
				+ "........\n"
				+ "...BW...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "B";

		String[] lignes = input.split("\n");
		System.out.println(lignes[3].indexOf("BW."));
		lignes[4] = lignes[4].replace("WB.", "WB0");
		for(int i = 0; i < lignes.length; i++){
			System.out.println(lignes[i]);
		}
	}*/	
/*-----------------------Savoir si le dernier carctère est B ou W-----------------------------*/
	public String turnIsAt(String input) {
		return input.substring(input.length()-1);
	}

}
