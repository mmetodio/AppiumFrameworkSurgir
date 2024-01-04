package org.meto.appium.tests;

import org.testng.annotations.Test;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.HashMap;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormContract;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.testng.annotations.BeforeMethod;

public class TFProspect extends TestBase {
	FormPage formPage;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormContract formContract;
	
	@BeforeMethod
/*	public void preSetup() {
		Activity activity = new Activity("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
		driver.startActivity(activity);
		
	}*/
	
	public void beforeMethod(Method method) {

		formPage = new FormPage(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		formProposal = new FormProposal(driver);
		formContract = new FormContract (driver);
		
	}
	
	@Test
	public static void Prospect() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormProspect formProspect = new FormProspect(driver);
		formProspect.PropuestaButton();
	//	formProspect.ReturnButton();
		formProspect.btnPropuesta();
		formProspect.PropuestaHome();
		formProspect.setNumDoc("40257461");  //48208831 C  74883197 D    08163942
	//	formProspect.setNumDoc(input.get("number"));
		formProspect.Verificando();
		formProspect.setFecCaducidad("01/01/2030");
		formProspect.setFirstName("TestAutomat");
		formProspect.setSecondName("SegmentoD");
		formProspect.setSurName("cacuarentay");
		formProspect.pdown();
		formProspect.setSecondSureName("ocho");
		formProspect.setFecNa("01/03/1991");
		formProspect.avance();
		formProspect.setnMobile("990493838");
		formProspect.setnMail("metodicosys@gmail.com");
		formProspect.continuarProspect();
		
	}
	
	@Test
	public static void UsoDatos() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormProspect formProspectm = new FormProspect(driver);
		formProspectm.scrollData();
		formProspectm.continuarData();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		formProspectm.continuaValid();
		formProspectm.politics();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//formProspect.politics();
		//formProspect.segmentos();

		FormCustomer formCustomer = formProspectm.bcontinuarValid();
	//	FormCustomer formCustomer = formProspectm.continuaValid();
		
	}
	
}
