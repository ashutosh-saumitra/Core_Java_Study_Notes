package Encapsulation;

public class ProtectedDemo2 {
	private int eyes;
	public int nose;
	
	private void body(){
		System.out.println("My Body.");
	}
	protected int getEyes() {
		return eyes;
	}

	protected void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getNose() {
		return nose;
	}

	public void setNose(int nose) {
		this.nose = nose;
	}
	
}
