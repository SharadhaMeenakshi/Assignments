package week3.day1assignments;

public class AxisBank extends BankInfo {
	@Override
    public void deposit() {
        System.out.println("Override deposit method in AxisBank");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AxisBank axisBank = new AxisBank();
	      axisBank.deposit();
	      
	}
/*
 *   Class     :BankInfo
    Methods :saving(),fixed(),deposit()

     Class     :AxisBank
     Methods :deposit()

Description:
You have to override the method deposit in AxisBank.
 */
 
}
