package mz.co.dipeshcr.convertor;

public class ConvertorRomanoNatural {

	public int numeroRomanoParanumeroNatural(String numero) {
		int numeroAtual = 0;
		int ultimoNumero = 0;

		String numeroRomano = numero.toUpperCase();

		for (int i = numeroRomano.length() - 1; i >= 0; i--) {

			char numeroRomanoAtual = numeroRomano.charAt(i);

			switch (numeroRomanoAtual) {
			case 'I':
				numeroAtual = converterNumeroRomanoAtualParaNumeroNatural(1, ultimoNumero, numeroAtual);
				ultimoNumero = 1;
				break;

			case 'V':
				numeroAtual = converterNumeroRomanoAtualParaNumeroNatural(5, ultimoNumero, numeroAtual);
				ultimoNumero = 5;
				break;

			case 'X':
				numeroAtual = converterNumeroRomanoAtualParaNumeroNatural(10, ultimoNumero, numeroAtual);
				ultimoNumero = 10;
				break;

			case 'L':
				numeroAtual = converterNumeroRomanoAtualParaNumeroNatural(50, ultimoNumero, numeroAtual);
				ultimoNumero = 50;
				break;

			case 'C':
				numeroAtual = converterNumeroRomanoAtualParaNumeroNatural(100, ultimoNumero, numeroAtual);
				ultimoNumero = 100;
				break;

			case 'D':
				numeroAtual = converterNumeroRomanoAtualParaNumeroNatural(500, ultimoNumero, numeroAtual);
				ultimoNumero = 500;
				break;

			case 'M':
				numeroAtual = converterNumeroRomanoAtualParaNumeroNatural(1000, ultimoNumero, numeroAtual);
				ultimoNumero = 1000;
				break;

			}
		}

		return numeroAtual;
	}

	private int converterNumeroRomanoAtualParaNumeroNatural(int numeroAtual, int ultimoNumero, int ultimoNumeroAtual) {
		if (ultimoNumero > numeroAtual) {
			return ultimoNumeroAtual - numeroAtual;
		} else {
			return ultimoNumeroAtual + numeroAtual;
		}
	}

}
