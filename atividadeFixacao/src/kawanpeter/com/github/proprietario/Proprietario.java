package kawanpeter.com.github.proprietario;

public class Proprietario 
{
	
	private String nome;
	private String CPF;
	private String RG;
	private String dataNasc;
	private Endereco endereco;

	public Proprietario(String nome, String CPF, String RG)
	{
		this.nome = nome;
		this.CPF = CPF;
		this.RG = RG;
	}
	
	public String getNome() {return nome;}
	public void setNome (String nome) {this.nome = nome;}
	
	public String getCPF() {return CPF;}
	public void setCPF (String CPF) {this.CPF = CPF;}
	
	public String getRG() {return RG;}
	public void setRG (String RG) {this.RG = RG;}
	
	public String getDataNasc() {return dataNasc;}
	public void setDataNasc(String dataNasc) {this.dataNasc = dataNasc;}
	
	public Endereco getEndereco() {return endereco;}
	public void setEndereco(Endereco endereco) {this.endereco = endereco;}	
	
}

	
