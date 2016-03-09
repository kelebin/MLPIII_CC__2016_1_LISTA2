package br.unipe.mlpIII.data.modelo;

public class DataValidacao {
	private String dia;
	private String mes;
	private String ano;
	
	final String DATA_STR_REGEX = 
			"^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";
	
	public DataValidacao(String dia, String mes, String ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}	
	
	
	public String toString(){
		String data = String.format("%s/%s/%s", dia, mes, ano);
		if (data.matches(DATA_STR_REGEX)){
			return data;
		}
		return ("Entrada inválida.");
	}
}