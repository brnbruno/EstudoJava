/**
*Apresentar os conceitos de Variável
*@author Bruno Henrique de Oliveira
*/
public class VariavelPrimitivo{
	
	public static void main(String[] args){

		int idade = 31;
		double preco = 12.45;
		char sex = 'M';
		
		byte b = 127;//Cem
		short s = 32767;//32 mil
		int i = 2_000_000_000;//2 bilhões
		long l = 9_000_000_000_000_000_000L;//9 quintilhões
		double d = 1.7976931348623157E+308D;// padrão IEEE 754
		float f= 123F;

		i = s;//Cast Implícito
		System.out.println(s);
		System.out.println(i);

		i = (int) l;//Cast Explícito
		System.out.println(l);
		System.out.println(i);

		byte bb = 0b01010101;//8 bits//Escrever falor em formato binario
		short ss = 0b0101010101010101;//16 bits/2 byte
		int ii = 0b01010101010101010101010101010101;//32 bits/4 Bytes

		System.out.println(bb);
		System.out.println(ss);
		System.out.println(ii);
	
	}
}