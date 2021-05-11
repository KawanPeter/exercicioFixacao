package kawanpeter.com.github.proprietario;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String CEP;
	private String complemento;
	
	public Endereco()
	{
		this.rua = "";
		this.bairro = "";
		this.cidade = "";
		this.estado = "";
		this.CEP = "";
		this.complemento = "";
	}
	
	@Override
	public String toString() 
	{
		return "Endereco: " + rua + ", " + bairro + ", " + cidade + "-" + estado + "," + CEP + ", " + complemento;              
	}
	
	//Getter e Setters 
	
	public String getRua() {return rua;}
	public void setRua(String rua) {this.rua = rua;}
	
	public String getBairro() {return bairro;}
	public void setBairro(String bairro) {this.bairro = bairro;}
	
	public String getCidade() {return cidade;}
	public void setCidade(String cidade) {this.cidade = cidade;}
	
	public String getEstado() {return estado;}
	public void setEstado(String estado) {this.estado = estado;}
	
	public String getCEP() {return CEP;}
	public void setCEP(String CEP) {this.CEP = CEP;}
	
	public String getComplemento() {return complemento;}
	public void setComplemento(String complemento) {this.complemento = complemento;}
}
