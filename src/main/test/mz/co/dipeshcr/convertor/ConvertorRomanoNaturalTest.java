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
	
	@Test
	public void deveConverterNumeroRomano_III_paraNumeRoNatural_3() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(3, convertor.numeroRomanoParanumeroNatural("III"));

	}
	
	@Test
	public void deveConverterNumeroRomano_IV_paraNumeRoNatural_4() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(4, convertor.numeroRomanoParanumeroNatural("IV"));

	}
	
	@Test
	public void deveConverterNumeroRomano_V_paraNumeRoNatural_5() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(5, convertor.numeroRomanoParanumeroNatural("V"));

	}
	
	@Test
	public void deveConverterNumeroRomano_VI_paraNumeRoNatural_6() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(6, convertor.numeroRomanoParanumeroNatural("VI"));

	}
	
	@Test
	public void deveConverterNumeroRomano_VII_paraNumeRoNatural_7() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(6, convertor.numeroRomanoParanumeroNatural("VII"));

	}


}
