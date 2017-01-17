import javax.swing.JOptionPane;
	
public class EntradaJOptionPane{
	
	public static void main(String[] args)
	{
		String nome = JOptionPane.showInputDialog("Qual seu nome?");
		//System.out.println(nome);
		JOptionPane.showMessageDialog(null, nome);
		
	}
}
