package br.com.cash;

public class Input {
	public int salary = 0;
	public int salesRevenue = 0;
	public int investiment = 0;
	
	public Input(int investiment) {
		this.investiment = investiment;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalesRevenue() {
		return salesRevenue;
	}

	public void setSalesRevenue(int salesRevenue) {
		this.salesRevenue = salesRevenue;
	}

	public int getInvestiment() {
		return investiment;
	}

	public void setInvestiment(int investiment) {
		this.investiment = investiment;
	}
	
	public int sumParams() {
		return this.salary + this.salesRevenue + this.investiment;
	}
	
	
	
	

}
