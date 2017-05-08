import javax.swing.JOptionPane;
//导入packet
public class TipCalcuator{
	public static void main(String[] args){

		String CapitalString = JOptionPane.showInputDialog("Please enter the capital , for example 10");
		//capital
		double Capital = Double.parseDouble(CapitalString);
		
		String RateString = JOptionPane.showInputDialog("Please enter the rate , for example 0.15");
		//String to double
		double Rate = Double.parseDouble(RateString);
		
		double Tip = Capital * Rate ;
		double Sum = Tip + Capital;
		//输出结果
		String output = "The gratuity is " + Tip + "and total is " + Sum;
		JOptionPane.showMessageDialog(null,output);
		
		
	}
}
