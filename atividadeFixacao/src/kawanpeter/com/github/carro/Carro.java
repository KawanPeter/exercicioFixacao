package kawanpeter.com.github.carro;

import kawanpeter.com.github.proprietario.Proprietario;

public class Carro 
{
	private Proprietario proprietario;
	private String marca;
	private String modelo;
	private String cor;
	private String cambioAuto;
	private String chassi;
	private Boolean tetoSolar;
	private int ano;
	private int velMaxima;
	private int velAtual;
	private int numPortas;
	private int marchaAtual;
	private int numMarchas;
	private int volCombustivel;
	
	public Carro (Proprietario prop)
	{
		this.proprietario = prop;
		this.marca = "0";
		this.modelo = "0";
		this.cor = "0";
		this.cambioAuto = "S";
		this.chassi = "0";
		this.tetoSolar = false;
		this.ano = 0;
		this.velMaxima = 200;
		this.velAtual = 0;
		this.numPortas = 4;
		this.marchaAtual = 0;
		this.numMarchas = 6;
		this.volCombustivel = 0;
	}
	
	public void acelera()
	{
		if (this.velAtual + 1 <= this.velMaxima)
			this.velAtual +=1;
	}
	
	public void freia ()
	{
		this.velAtual = 0;
	}
	
	public void trocaMarcha()
	{
		if (this.marchaAtual + 1 <= this.numMarchas)
			this.marchaAtual += 1;
	}
	
	public void reduzMarcha()
	{
		if ((this.marchaAtual == 1 && this.velAtual == 0) || this.marchaAtual -1 >= 1)
			this.marchaAtual -=1;
	}
	
	//Getters e Setters 
	
	
	public Integer getAno() {return ano;}
	public void setAno(Integer ano) {this.ano = ano;}
	
	public String getCambioAuto() {return cambioAuto;}
	public void setCambioAuto(String cambioAuto) {this.cambioAuto = cambioAuto;}
	
	public String getChassi() {return chassi;}
	public void setChassi(String chassi) {this.chassi = chassi;}
	
	public String getCor() {return cor;}
	public void setCor(String cor) {this.cor = cor;}
	
	public String getMarca() {return marca;}
	public void setMarca(String marca) {this.marca = marca;}
	
	public Integer getNumMarchas() {return numMarchas;}
	public void setNumMarchas(Integer numMarchar) {this.numMarchas = numMarchar;}
	
	public String getModelo() {return modelo;}
	public void setModelo(String modelo) {this.modelo = modelo;}
	
	public Integer getNumPortas() {return numPortas;}
	public void setNumPortas(Integer numPortas) {this.numPortas = numPortas;}
	
	public Proprietario getProprietario () {return proprietario;}
	public void setProprietario(Proprietario proprietario) {this.proprietario = proprietario;}
	
	public Boolean getTetoSolar() {return tetoSolar;}
	public void setTetoSolar(Boolean tetoSolar) {this.tetoSolar = tetoSolar;}
	
	public Integer getVelAtual() {return velAtual;}
	public void setVelAtual(Integer velAtual) {this.velAtual = velAtual;}
	
	public Integer getVelMaxima() {return velMaxima;}
	public void setVelMaxima (Integer velMaxima) {this.velMaxima = velMaxima;}
	
	public Integer getVolCombustivel() {return volCombustivel;}
	public void setVolCombustivel(Integer volCombustivel) {this.volCombustivel = volCombustivel;}
	
	public Integer getMarchaAtual() {return marchaAtual;}
	public void setMarchaAtual(Integer marchaAtual) {this.marchaAtual = marchaAtual;}
}
