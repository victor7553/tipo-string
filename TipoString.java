package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		//System.out.println(s + "!!!"); outra forma de concat
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Victor";
		var sobrenome = "Trindade";
		var idade = 25;
		var salario = 1700.00;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " 
		+ sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}

}
