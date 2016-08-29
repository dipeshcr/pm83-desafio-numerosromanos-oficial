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
		Assert.assertEquals(7, convertor.numeroRomanoParanumeroNatural("VII"));

	}
	
	@Test
	public void deveConverterNumeroRomano_VIII_paraNumeRoNatural_8() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(8, convertor.numeroRomanoParanumeroNatural("VIII"));

	}
	
	@Test
	public void deveConverterNumeroRomano_IX_paraNumeRoNatural_9() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(9, convertor.numeroRomanoParanumeroNatural("IX"));

	}
	
	@Test
	public void deveConverterNumeroRomano_X_paraNumeRoNatural_10() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(10, convertor.numeroRomanoParanumeroNatural("X"));

	}
	
	@Test
	public void deveConverterNumeroRomano_XI_paraNumeRoNatural_11() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(11, convertor.numeroRomanoParanumeroNatural("XI"));

	}
	
	@Test
	public void deveConverterNumeroRomano_XIV_paraNumeRoNatural_14() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(14, convertor.numeroRomanoParanumeroNatural("XIV"));

	}
	
	@Test
	public void deveConverterNumeroRomano_XV_paraNumeRoNatural_15() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(15, convertor.numeroRomanoParanumeroNatural("XV"));

	}
	
	@Test
	public void deveConverterNumeroRomano_XVII_paraNumeRoNatural_17() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(17, convertor.numeroRomanoParanumeroNatural("XVII"));

	}
	
	@Test
	public void deveConverterNumeroRomano_XIX_paraNumeRoNatural_19() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(19, convertor.numeroRomanoParanumeroNatural("XIX"));

	}
	
	@Test
	public void deveConverterNumeroRomano_XX_paraNumeRoNatural_20() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(20, convertor.numeroRomanoParanumeroNatural("XX"));

	}
	
	@Test
	public void deveConverterNumeroRomano_L_paraNumeRoNatural_50() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(50, convertor.numeroRomanoParanumeroNatural("L"));

	}
	
	@Test
	public void deveConverterNumeroRomano_C_paraNumeRoNatural_100() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(100, convertor.numeroRomanoParanumeroNatural("C"));

	}
	
	@Test
	public void deveConverterNumeroRomano_D_paraNumeRoNatural_500() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(500, convertor.numeroRomanoParanumeroNatural("D"));

	}
	
	@Test
	public void deveConverterNumeroRomano_M_paraNumeRoNatural_1000() {
		ConvertorRomanoNatural convertor = new ConvertorRomanoNatural();
		Assert.assertEquals(1000, convertor.numeroRomanoParanumeroNatural("M"));

	}
	


}
