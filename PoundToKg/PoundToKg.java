import javax.swing.JOptionPane;
//导入packet
public class PoundToKg{
	public static void main(String[] args){
	
		String PoundsString = JOptionPane.showInputDialog("Enter a number in pounds");
		
		double Pounds = Double.parseDouble(PoundsString);
		
		//输出英磅换算成的kg
		double Kilograms = Pounds * 0.454;
		//输出结果
		String output = Pounds +" "+" Pounds is" + Kilograms  +" "+ " kilograms ";
		JOptionPane.showMessageDialog(null,output);
		
		
	}
}
