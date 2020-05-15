package br.com.cash;

import java.util.ArrayList;

public class CashFlow {
	ArrayList<Input> inputs = new ArrayList<Input>();
	ArrayList<Output> outputs = new ArrayList<Output>();
	
	public CashFlow(ArrayList<Input> inputs, ArrayList<Output> outputs) {
		this.inputs = inputs;
		this.outputs = outputs;
	}

	public ArrayList<Input> getInputs() {
		return inputs;
	}

	public void setInputs(ArrayList<Input> inputs) {
		this.inputs = inputs;
	}

	public ArrayList<Output> getOutputs() {
		return outputs;
	}

	public void setOutputs(ArrayList<Output> outputs) {
		this.outputs = outputs;
	}
	
}
