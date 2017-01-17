/**
*Apresentar os conceitos de Wrapper
*@author Bruno Henrique de Oliveira
*/
public class Wrapper{
	
	public static void main(String[] args){
		
		Integer idade = new Integer(25);
		Double preco = new Double("12.45");
		double d = preco.doubleValue();
		int i = preco.intValue();
		byte b = preco.byteValue();
		Boolean ligado = new Boolean("true");
		
		//Conversão Estática
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");

		int i2 = Integer.valueOf("101011", 2);
		System.out.println(i2);
	}
}