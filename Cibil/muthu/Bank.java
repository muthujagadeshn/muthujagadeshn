package Cibil.muthu;


public class Bank extends Sbi implements Pnb,Cibil {
	public void nature() {
		System.out.println("hi nature");
	}

	@Override
	public void maximumLoan() {
		System.out.println("100");
		
	}

	@Override
	public void bankBalance() {
		System.out.println("500");
		
	}

	@Override
	public void maximumLoanAmount() {
		System.out.println("1000");

		
	}

	@Override
	public void cibilScore() {
		System.out.println("150");
		
	}
	public static void main(String[] args) {
		Bank mm=new Bank();
		mm.bankBalance();
		mm.cibilScore();
		mm.maximumLoan();
		mm.nature();
		mm.maximumLoanAmount();
	    mm.IdLoan();
	    
}

	@Override
	public void creditScore() {
		System.out.println("1500");
		
	}

	@Override
	public void minimumBalance() {
		System.out.println("222");
		
	}
}
