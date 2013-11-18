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
//-----------------------------------
	/*
	//Transformation des colonnes en lignes
	// length - 1 parce qu'il faut enlever le joueur courant
    String col="";
    for (int j = 0; j < tableau.length - 1; j++) {
    	for (int i = 0; i < tableau.length - 1; i++) {
			col = col + tableau[i].substring(j,j+1);
		}
    	col = col + "//";
	} 
    System.out.println(col);
    System.out.println("\n");
    
    //afficher un tableau avec les colonnes transformées en ligne
    String[] tableauCol = col.split("//");
    for (int i = 0; i < tableauCol.length; i++) {
    	if(tableauCol[i].indexOf("B")<tableau[i].indexOf("W.") && tableauCol[i].indexOf("B")!=-1){
    		tableauCol[i] = tableauCol[i].replace("W.","W0");
    	}
    	if(tableau[i].indexOf("B")>tableauCol[i].indexOf("W.") && tableauCol[i].indexOf("B")!=-1){
    		tableauCol[i] = tableauCol[i].replace(".W","0W");
    	}
    	System.out.println(tableauCol[i]);	
	}
    System.out.println("\n");
    
    //Transformer colonne en ligne
    col="";
    for (int j = 0; j < tableauCol.length - 1; j++) {
    	for (int i = 0; i < tableauCol.length - 1; i++) {
			col = col + tableauCol[i].substring(j,j+1);
		}
    	col = col + "//";
	} 

    
    //afficher tableau final
    tableau = col.split("//");
    for (int i = 0; i < tableau.length; i++) {
		System.out.println(tableau[i]);
	}
    
    System.out.println("------------------------");
  //En ligne
	    for (int i = 0; i < tableau.length; i++) {
	    	if(tableau[i].indexOf("B")<tableau[i].indexOf("W.") && tableau[i].indexOf("B")!=-1){
	    		tableau[i] = tableau[i].replace("W.","W0");
	    	}
	    	if(tableau[i].indexOf("B")>tableau[i].indexOf(".W") && tableau[i].indexOf("B")!=-1){
	    		tableau[i] = tableau[i].replace(".W","0W");
	    	}
	    	System.out.println(tableau[i]);	    */	
}
