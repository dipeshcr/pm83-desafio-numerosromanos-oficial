package mz.co.dipeshcr.convertor;

import org.junit.Assert;
import org.junit.Test;

public class ConvertorRomanoNaturalTest {

	@Test
	public void deveConverterNumeroRomano_I_paraNumeRoNatural_1() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(1, convertor.numeroRomanoParanumeroNatural("I"));

	}
	
	@Test
	public void deveConverterNumeroRomano_II_paraNumeRoNatural_2() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(2, convertor.numeroRomanoParanumeroNatural("II"));

	}


}
