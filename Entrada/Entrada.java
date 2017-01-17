import java.util.Scanner;
	
public class Entrada{
	
	public static void main(String[] args)
	{
		//Chamada do Programa
		//System.out.println(args[0]);
		
		//Interadindo com o Usuário
		Scanner s = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = s.nextLine();
		System.out.println("Bem vindo "+nome);
	}
}
