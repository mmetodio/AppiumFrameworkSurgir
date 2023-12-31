package org.meto.appium.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class FormProspect extends AndroidActions{
	
	AndroidDriver driver;
	String segmentobasedata;
	
	public FormProspect(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}

	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/rlPropuesta")
	private WebElement propuesta;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/icon_return_home")
	private WebElement returnH;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnNuevaPropuesta")
	private WebElement btnPropuest;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnPropuestaHome")
	private WebElement propuestaHome;
	
	
	
	//Prospecto
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Número de documento']")
	private WebElement numDoc;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Verificar']")
	private WebElement nVerifica;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/component_datetime_input")
	private WebElement fecCaducidad;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement firstName;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement secondName;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement firstSurname;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement secondSurname;
	
	@AndroidFindBy(xpath="	/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement FecNa;
		
	//Teléfono
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement nMobile;	
	
	//Correo
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement  nMail;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_submit_prospect")
	private WebElement btnContinuarProspect;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/positive_radio_button")
	private WebElement checkData;
		
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/audp_button_continue")
	//@AndroidFindBy(xpath="//android.widget.Button[@text='Continuar']")
	private WebElement btnContinuarData;
	
	//segmento en prospecto
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/id_segment")
	private WebElement segmentito;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Continuar'][@enabled = 'true']")
	//@AndroidFindBy(xpath="//android.widget.Button[@text='Continuar']")
	private WebElement btnContinuarValid;
	
	public FormProspect PropuestaButton() {
		propuesta.click();
		return this;

	}
	
	public FormProspect ReturnButton() {
		returnH.click();
		return this;
		
	}
	
	@Test
	public FormProspect btnPropuesta () {
		btnPropuest.click();
		return this;
	}
	
	@Test
	public FormProspect PropuestaHome() {
		propuestaHome.click();
		return this;
		
	}
	
	@Test
	public FormProspect setNumDoc(String numdoc) {
		numDoc.sendKeys(numdoc);
		return this;
		
	}
		
	public FormProspect Verificando() {
		WebElement nverifica = (WebElement) driver.findElement(By.xpath("//android.widget.Button[@text='Verificar']"));
		nverifica.click();

		//con tiempo explicito
		By byElement = By.id("pe.com.surgir.surgirapp:id/component_datetime_input");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(nverifica));
		return this;
		
	}
	
	
	public FormProspect setFecCaducidad(String feccaducidad) {
		fecCaducidad.sendKeys(feccaducidad);
		return this;
		
	}
	
	public FormProspect setFirstName(String firstname) {
		firstName.clear();
		firstName.sendKeys(firstname);
		return this;
		
	}
	
	public FormProspect setSecondName(String secondname) {
		secondName.clear();
		secondName.sendKeys(secondname);
		return this;
	}
	
	public FormProspect setSurName(String firstsurname) {
		firstSurname.clear();
		firstSurname.sendKeys(firstsurname);
		return this;

	}
	
	@SuppressWarnings("deprecation")
	public FormProspect pdown() {
	 //   driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"PERÚ\").instance(0))"));
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(540, 1315))
	               .moveTo(PointOption.point(540, 380))//540, 375
	               .release()
	               .perform();	
		return this;
		
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public FormProspect avance() {
	//	long noOfSeconds = 50;
	//	Duration duration = Duration.ofSeconds(noOfSeconds);
		/*
		TouchAction action = new TouchAction(driver); 
        action.press(PointOption.point(560, 1190)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(50))) //560, 789
                        .moveTo(PointOption.point(560, 714)).release().perform();  //560, 260
        */
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(560, 1110))
	               .moveTo(PointOption.point(560, 790))
	               .release()
	               .perform();
	    return this;
	    
	}
	
	public FormProspect setSecondSureName(String secondsurname) {
		secondSurname.clear();
		secondSurname.sendKeys(secondsurname);
		return this;
		
	}
	
	public FormProspect setFecNa(String fecna) {
		FecNa.clear();
		FecNa.sendKeys(fecna);
		return this;
		
	}
	
	public FormProspect setnMobile(String nmobile) {
		nMobile.clear();
		nMobile.sendKeys(nmobile);
		return this;
		
	}
	
	
	public FormProspect setnMail(String mail) {
		nMail.clear();
		nMail.sendKeys(mail);
		return this;
		
	}

	public FormProspect continuarProspect() {
		btnContinuarProspect.click();
		return this;
		
	}
	
	@Test
	
	public FormProspect scrollData() throws InterruptedException {
		scrolluseData();
		Thread.sleep(1000);
		checkData.click();
		return this;
		
	}
	
	public FormProspect continuarData() {
		btnContinuarData.click();
		return this;
		
	}
	
	public FormProspect continuaValid() throws InterruptedException {
	//	String segmento = driver.findElement(By.id("pe.com.surgir.surgirapp:id/id_segment")).getText();
	//	System.out.println(segmento);
		btnContinuarValid.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
	//	Thread.sleep(15000);
	//	metod();
		return this;
		
	}
		
	public FormCustomer bcontinuarValid() throws InterruptedException {
	//	Thread.sleep(3000);
		//String segmento = driver.findElement(By.id("pe.com.surgir.surgirapp:id/id_segment")).getText();
		//System.out.println(segmento);
	//	btnContinuarValid.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		Thread.sleep(5000);
		metod();
		return new FormCustomer(driver);
		
	}
	
	

	
	
}
