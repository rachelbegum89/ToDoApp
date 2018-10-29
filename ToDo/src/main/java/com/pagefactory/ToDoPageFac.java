package com.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ToDoPageFac {
	WebDriver driver;
	public ToDoPageFac(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getUrl() {
		driver.get("http://www.seleniumeasy.com/test/info-form-demo.html");
	}
	
	//Scenario 1
	@FindBy
	(xpath = "//*[contains (text(), 'Input Forms')][1]")
	private WebElement inputtab;
	@FindBy
	(xpath = "//*[contains (text(), 'Input Forms')][1]//following-sibling::uL/li[5]")
	private WebElement inputForm;
	@FindBy
	(xpath = "//*[contains (@class, 'btn btn-default')]")
	private WebElement Sendbtn;
	
	//Scenario 2
	private String myfname = "Rachel";
	private String mylname = "Begum";
	private String myemail = "rachelbegum89@gmail.com";
	private String myphone   = "6467504064";
	private String mycity    = "staten island";
	private String myaddress = "33 central ave";
	private String mycity1    =  "staten island";
	private String myzip     = "10301";
	private String mywebsite = "www.google.com";
	private String mydescription = "basic";
	
	
	@FindBy
	(xpath = ("//*[contains (text(), 'Table')])[1]"))
	private WebElement tabletab;

	@FindBy
	(xpath = "(//*[contains (text(), 'Table')])[1]//following-sibling::ul//li[4]")
	private WebElement tableSortSearch;
	
	@FindBy
	(xpath = "//*[@name = 'first_name']")
	private WebElement firstname;
	
	@FindBy
	(xpath = "//*[@name = 'last_name']")
	private WebElement lastname;
	
	@FindBy
	(xpath = "//*[@name = 'email']")
	private WebElement email;
	
	@FindBy
	(xpath = "//*[@name = 'phone']")
	private WebElement phone;
	
	@FindBy
	(xpath = "//*[@name = 'address']")
	private WebElement address;
	
	@FindBy
	(xpath = "//*[@name = 'city']")
	private WebElement city;
	
	@FindBy
	(xpath = "//*[@name = 'state']")
	private WebElement state;
	
	@FindBy
	(xpath = "//*[@name = 'zip']")
	private WebElement zip;
	
	@FindBy
	(xpath = "//*[@name = 'website']")
	private WebElement website;
	
	@FindBy
	(xpath = "//*[@name = 'hosting']")
	private WebElement hosting;
	
	@FindBy
	(xpath = "//*[@name = 'comment']")
	private WebElement desp;
	
//Scenario 3
	@FindBy
	(xpath = "//input[@class = '']")
	private WebElement searchbox;
	
	@FindBy
	(how = How.XPATH, using = "//tbody/tr")
	private List<WebElement> check1;
	
	@FindBy
	(how = How.XPATH, using = "//*[@id = 'example_info']")
	private WebElement verify1;
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void setInputtab() {
		inputtab.click();
	}

	public void setInputForm() {
		inputForm.click();
	}

	public void setSendbtn() {
		Sendbtn.click();
	}

	public void setMyfname(String myfname) {
		this.myfname = myfname;
	}

	public void setMylname(String mylname) {
		this.mylname = mylname;
	}

	public void setMyemail(String myemail) {
		this.myemail = myemail;
	}

	public void setMyphone(String myphone) {
		this.myphone = myphone;
	}

	public void setMycity(String mycity) {
		this.mycity = mycity;
	}

	public void setMyaddress(String myaddress) {
		this.myaddress = myaddress;
	}

	public void setMycity1(String mycity1) {
		this.mycity1 = mycity1;
	}

	public void setMyzip(String myzip) {
		this.myzip = myzip;
	}

	public void setMywebsite(String mywebsite) {
		this.mywebsite = mywebsite;
	}

	public void setMydescription(String mydescription) {
		this.mydescription = mydescription;
	}

	public void setTabletab() {
		tabletab.click();
	}

	public void setTableSortSearch() {
		tableSortSearch.click();
	}

	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
		firstname.sendKeys(myfname);
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
		lastname.sendKeys(mylname);
	}

	public void setEmail(WebElement email) {
		this.email = email;
		email.sendKeys(myemail);
	}

	public void setPhone(WebElement phone) {
		this.phone = phone;
		phone.sendKeys(myphone);
	}

	public void setAddress(WebElement address) {
		this.address = address;
		address.sendKeys(myaddress);
	}

	public void setCity(WebElement city) {
		this.city = city;
		city.sendKeys(mycity);
	}

	public void setState(WebElement state) {
		this.state = state;
		Select statechoose = new Select(state);
			statechoose.selectByVisibleText("New York");
		}
	

	public void setZip(WebElement zip) {
		this.zip = zip;
		zip.sendKeys(myzip);
	}

	public void setWebsite(WebElement website) {
		this.website = website;
		website.sendKeys(mywebsite);
	}

	public void setHosting(WebElement hosting) {
		this.hosting = hosting;
	}

	public void setDesp(WebElement desp) {
		this.desp = desp;
		desp.sendKeys(mydescription);
	}
	public void setSearchbox(WebElement searchbox) {
		this.searchbox = searchbox;
		searchbox.sendKeys("Vance");
	}
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getInputtab() {
		return inputtab;
	}

	public WebElement getInputForm() {
		return inputForm;
	}

	public WebElement getSendbtn() {
		return Sendbtn;
	}

	public String getMyfname() {
		return myfname;
	}

	public String getMylname() {
		return mylname;
	}

	public String getMyemail() {
		return myemail;
	}

	public String getMyphone() {
		return myphone;
	}

	public String getMycity() {
		return mycity;
	}

	public String getMyaddress() {
		return myaddress;
	}

	public String getMycity1() {
		return mycity1;
	}

	public String getMyzip() {
		return myzip;
	}

	public String getMywebsite() {
		return mywebsite;
	}

	public String getMydescription() {
		return mydescription;
	}

	public WebElement getTabletab() {
		return tabletab;
	}

	public WebElement getTableSortSearch() {
		return tableSortSearch;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZip() {
		return zip;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getHosting() {
		return hosting;
	}

	public WebElement getDesp() {
		return desp;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public List<WebElement> getCheck1() {
		return check1;
	}

	public WebElement getVerify1() {
		return verify1;
	}
	
	
	
}


	
	
	