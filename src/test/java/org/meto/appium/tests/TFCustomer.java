package org.meto.appium.tests;

import org.testng.annotations.Test;
import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormContract;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFCustomer extends TestBase {
	FormPage formPage;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormContract formContract;
	
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formPage = new FormPage(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		formProposal = new FormProposal(driver);
		
	}
	

	@Test
	public void Customer() throws InterruptedException{
		FormCustomer formCustomer = new FormCustomer(driver);
		formCustomer.CustomerP();
		formCustomer.fotoExperian();
	//	formCustomer.validPhotoExperian(); // valida foto experian
		formCustomer.fotofrenteDni();
		formCustomer.fotoreversoDni();
		formCustomer.fotoCliente();
		formCustomer.saveCustomer();
		formCustomer.swipeScreenOneCustomer();
		//formCustomer.segundoNombre();
		formCustomer.gradoInstruccion();
		formCustomer.profesionN();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.estadoCivil("SOLTERO");
		formCustomer.iletrado(false);
		formCustomer.prePago();
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.codigoArea();
		formCustomer.saveCustomer();
		//	formCustomer.telefonoFijo("3827271");
		formCustomer.operadorTelef();
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.nexttwoCustomer();
	 /*
		formCustomer.tipodeComprobante();
		formCustomer.fotoComprobanteDomicilio();
		formCustomer.saveCustomer(); // nuevo
		formCustomer.swipeScreenOneCustomer();
		formCustomer.departamentos();
		formCustomer.provincias();
		formCustomer.urbanizacion("mi urbanizacion test");
		formCustomer.distritos();
		formCustomer.saveCustomer();
		formCustomer.nomDireccion("mi direccionx");
		formCustomer.tipoVia();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.numExterior("432");
		formCustomer.numInterior("6");
		formCustomer.permanenciaAnios();
		formCustomer.referenciaUbic("mi referencia ubic");
		formCustomer.personaenDomicilio();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.casaqueHabita();
		formCustomer.otrotipoDomicilio("choza");
		//formCustomer.fotoHeritage(); /// nuevo
	//	formCustomer.numeroDependient("1");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.tipoReferencia();
		formCustomer.nameReferenc("Test");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.lastNameRef("Test");
		formCustomer.cellReferenc("964636765");
		formCustomer.saveCustomer();
	//	formCustomer.nextCustomer();
		FormBusiness formBusiness = formCustomer.nextCustomer();
		*/
	}
	
	@Test
	public void Domicilio() throws InterruptedException{
		FormCustomer formCustomerd = new FormCustomer(driver);
		formCustomerd.tipodeComprobante();
		formCustomerd.fotoComprobanteDomicilio();
		formCustomerd.saveCustomer(); // nuevo
		formCustomerd.swipeScreenOneCustomer();
		formCustomerd.departamentos();
		formCustomerd.provincias();
		formCustomerd.urbanizacion("mi urbanizacion test");
		formCustomerd.distritos();
		formCustomerd.saveCustomer();
		formCustomerd.nomDireccion("mi direccionx");
		formCustomerd.tipoVia();
		formCustomerd.swipeScreenOneCustomer();
		formCustomerd.numExterior("432");
		formCustomerd.numInterior("6");
		formCustomerd.permanenciaAnios();
		formCustomerd.referenciaUbic("mi referencia ubic");
		formCustomerd.personaenDomicilio();
		formCustomerd.swipeScreenOneCustomer();
	//	FormBusiness formBusiness = formCustomer.nextCustomer();
		
	}

	@Test
	public void InfComplementaria() throws InterruptedException{
		FormCustomer formCustomeri = new FormCustomer(driver);
		formCustomeri.casaqueHabita();
		formCustomeri.otrotipoDomicilio("choza");
		//formCustomer.fotoHeritage(); /// nuevo
	//	formCustomer.numeroDependient("1");
		formCustomeri.swipeScreenOneCustomer();
		formCustomeri.tipoReferencia();
		formCustomeri.nameReferenc("Test");
		formCustomeri.swipeScreenOneCustomer();
		formCustomeri.lastNameRef("Test");
		formCustomeri.cellReferenc("964636765");
		formCustomeri.saveCustomer();
	//	formCustomer.nextCustomer();
		FormBusiness formBusiness = formCustomeri.nextCustomer();
		
	}



	
	/*
	 public void Customer() throws InterruptedException{
		FormCustomer formCustomer = new FormCustomer(driver);
		formCustomer.CustomerP();
		formCustomer.fotoExperian();
		formCustomer.fotofrenteDni();
		formCustomer.fotoreversoDni();
		formCustomer.fotoCliente();
		formCustomer.saveCustomer();
		formCustomer.swipeScreenOneCustomer();
		//formCustomer.segundoNombre();
		formCustomer.gradoInstruccion();
		formCustomer.profesionN();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.estadoCivil("SOLTERO");
		formCustomer.iletrado(false);
		formCustomer.prePago();
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.codigoArea();
		formCustomer.saveCustomer();
		//	formCustomer.telefonoFijo("3827271");
		formCustomer.operadorTelef();
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.nexttwoCustomer();
		formCustomer.tipodeComprobante();
		formCustomer.fotoComprobanteDomicilio();
		formCustomer.saveCustomer(); // nuevo
		formCustomer.swipeScreenOneCustomer();
		formCustomer.departamentos();
		formCustomer.provincias();
		formCustomer.urbanizacion("mi urbanizacion test");
		formCustomer.distritos();
		formCustomer.saveCustomer();
		formCustomer.nomDireccion("mi direccionx");
		formCustomer.tipoVia();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.numExterior("432");
		formCustomer.numInterior("6");
		formCustomer.permanenciaAnios();
		formCustomer.referenciaUbic("mi referencia ubic");
		formCustomer.personaenDomicilio();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.casaqueHabita();
		formCustomer.otrotipoDomicilio("choza");
		//formCustomer.fotoHeritage(); /// nuevo
	//	formCustomer.numeroDependient("1");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.tipoReferencia();
		formCustomer.nameReferenc("Test");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.lastNameRef("Test");
		formCustomer.cellReferenc("964636765");
		formCustomer.saveCustomer();
	//	formCustomer.nextCustomer();
		FormBusiness formBusiness = formCustomer.nextCustomer();
		
	}	  
	 */
	
}
