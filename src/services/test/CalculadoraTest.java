/**
 * 
 */
package services.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import services.Calculadora;

/**
 * @author luis.matos
 *
 */
public class CalculadoraTest {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calculadora calc; 
	
	@Before
	public void setUp() throws Exception {
		calc = new Calculadora();
	}


	@Test
	public void testValorTotal() throws ParseException {
		Date data1 = sdf.parse("16/05/2021"); 
		Date data2 = sdf.parse("16/05/2021"); 
		Assert.assertEquals(10.0, calc.valorTotal(10.0, data1, data2));
	}
	
	@Test
	public void testMaxViews() throws ParseException {
		Assert.assertEquals(864.0, calc.maxViews(10.0));
	}
	
	
	@Test
	public void testMaxClicks() throws ParseException {
		Assert.assertEquals(94.0, calc.maxClicks(10.0));
	}
	
	@Test
	public void testMaxSharing() throws ParseException {
		Assert.assertEquals(14.0, calc.maxSharing(10.0));
	}
	
	
	@Test
	public void testValidaData() throws ParseException {
		Date dataInicio = DataAleatoria.dataAleatoria();
		Date dataFim = DataAleatoria.dataAleatoria(); 
		if (dataFim.before(dataInicio)) { 
			Assert.assertEquals(true, calc.validaData(dataInicio, dataFim));
		} else { 
			Assert.assertEquals(false, calc.validaData(dataInicio, dataFim));
		}
		
	}

	

}
