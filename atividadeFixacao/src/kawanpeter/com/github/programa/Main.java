package kawanpeter.com.github.programa;

import kawanpeter.com.github.proprietario.Proprietario;
import kawanpeter.com.github.proprietario.Endereco;
import kawanpeter.com.github.carro.Carro;

public class Main {

	public static void main(String[] args) {
		
		Proprietario prop = new Proprietario("Proprietario 1","12345678910","12345678");
		
		Endereco end = new Endereco();
		end.setRua("Rua Tucum");
		
		prop.setEndereco(end);
		
		Carro carro = new Carro(prop);
		
		System.out.println("Velocidade máxima: " + carro.getVelMaxima());
		carro.setVelMaxima(10);
		for (int i = 0; i < 8; i++)
		{
			carro.acelera();
			carro.trocaMarcha();
			if (i % 2 == 0)
			{
				carro.acelera();
			}
		System.out.println("Marcha: " + carro.getMarchaAtual());
		System.out.println("Velocidade: " + carro.getVelAtual());
	}
	for (int i = 0; i<8; i++)
	{
		if(carro.getVelAtual()-1 >= 0);
		carro.setVelAtual(carro.getVelAtual()-1);
		carro.reduzMarcha();
		if (i % 2 != 0 && carro.getVelAtual()-1 >=0)
		{
			carro.setVelAtual(carro.getVelAtual()-1);
		}
		System.out.println("Marcha: " + carro.getMarchaAtual());
		System.out.println("Velocidade: " + carro.getVelAtual());
	}
	System.out.println(prop.getEndereco().toString());
	}
}
