package mz.co.dipeshcr.modelo;

import mz.co.dipeshcr.convertor.ConvertorRomanoNatural;

public class NumeroRomano {
	
	private String numeroRomano;

	public NumeroRomano(String numeroRomano) {
		super();
		this.numeroRomano = numeroRomano;
	}

	public String getNumeroRomano() {
		return numeroRomano;
	}

	public int getNumeroNatural(String numeroRomano){
		ConvertorRomanoNatural convertor= new ConvertorRomanoNatural();
		return convertor.numeroRomanoParanumeroNatural(numeroRomano);
	}
	
	public String toString() {
		return "NumeroRomano [numeroRomano=" + numeroRomano + "]";
	}
}
