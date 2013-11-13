package Reversi;

public class Reversi {

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

	public String turnIsAt(String input) {
		return input.substring(input.length()-1);
	}

}
