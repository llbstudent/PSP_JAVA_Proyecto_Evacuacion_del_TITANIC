package Enum;

public enum ZonaBarco {
	Proa(4, 9, 24), 
	Popa(3, 8, 23), 
	Babor(2, 7, 22), 
	Estribor(5, 10, 25);
	
	private int[] accesos;
	
	private ZonaBarco(int... accesos) {
		this.accesos = accesos;
	}
}
