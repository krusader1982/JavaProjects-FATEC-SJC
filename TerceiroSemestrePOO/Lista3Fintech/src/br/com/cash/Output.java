package br.com.cash;

public class Output {
	public int eletricity;
	public int gas;
	public int food;
	public int fuel;
	public int others;
	
	public Output(int eletricity, int gas, int food, int fuel, int others) {
		this.eletricity = eletricity;
		this.gas = gas;
		this.food = food;
		this.fuel = fuel;
		this.others = others;
	}

	public int getEletricity() {
		return eletricity;
	}

	public void setEletricity(int eletricity) {
		this.eletricity = eletricity;
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getOthers() {
		return others;
	}

	public void setOthers(int others) {
		this.others = others;
	}
	
	public int sumParams() {
		return this.eletricity + this.gas + this.food + this.fuel + this.others;
	}

	
}
