package org.meto.appium.pages;

import java.time.Duration;
import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;

public class FormPage extends AndroidActions{
	
	AndroidDriver driver;
	
	public FormPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")
	private WebElement sourcex;
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	private WebElement sourcextwo;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Usuario']")
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement nameUser;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Contraseña']")
	private WebElement namePass;
	
//	@AndroidFindBy(xpath="//android.widget.EditText[@text='gender']")
	//private WebElement maleOption;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnLogin")
	public WebElement loginButton;
	
	// Sesion Local
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Agencia']")
	private WebElement agencySelection;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Rol']")
	private WebElement rolSelection;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnLoginRol")
	public WebElement rolButton;
	
	//Login local
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Nueva contraseña local']")
	public WebElement claveLocal1;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Confirmación de contraseña local']")
	public WebElement claveConfLocal;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnIngresar")
	public WebElement localButton;
		
	public FormPage setMessageinit()
	{
		WebElement msgge = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"));
		System.out.println(msgge);
		
		return this;
				
	}
	
	public FormPage setMessageinittwo()
	{
	//	System.setProperty("illegal-access", "deny");
	//	sourcex.click();
	//	sourcex.click();


		return this;
				
	}
	
	
	public FormPage setNameUser(String name) {
		nameUser.sendKeys(name);
		//driver.hideKeyboard();
		return this;
		
	}

	public FormPage setNamePass(String pass) {
		namePass.sendKeys(pass);
		return this;
	}

	/*
	public void setGender(String gender) {
		if (gender.contains("female"))
			femaleOption.click;
		else
			maleOption.click;
	}*/
		
	public FormPage setSubmitLogin() {
		loginButton.click();
		return this;
	}
		
	public FormPage setAgencySelection() {
		agencySelection.click();
		touchAgencia();
		return this;
	
	}
	
	public FormPage setRolSelection(String role) {
		rolSelection.click();
		touchRol(role);
		return this;
		
	}
	
	public FormPage setSubmitRol() {
		rolButton.click();
		return this;
		
	}
	
	public FormPage setClaveLocal1(String passloc1) {
		claveLocal1.sendKeys(passloc1);
		return this;
		
	}
	
	public FormPage setClaveConfLocal(String passConfirm) {
		claveConfLocal.sendKeys(passConfirm);;
		return this;
		
	}
	
	public FormProspect localButtom(){
		localButton.click();
		return new FormProspect(driver);
		
	}
	
	
	
}
