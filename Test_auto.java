package TESTING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Test_auto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath = "F:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.1.190:9004/agroweb/login_execute");
//		
//		String ActualREsult="Search";
//		WebElement AA= driver.findElement(By.xpath("//input[@name='q']")); 
//		String actualResult =AA.getAttribute("title");
////		Assert.assertEquals(ActualREsult,actualResult,"TestCase");
////		System.out.println("Sucess");
//		Assert.assertNotEquals(ActualREsult, actualResult, "failed");
//		System.out.println("failed");
		
		//Login Page
		WebElement usernameElement = driver.findElement(By.name("j_username")); 
		WebElement passwordElement = driver.findElement(By.name("j_password"));
		
		usernameElement.sendKeys("naveen");
		passwordElement.sendKeys("12345678");
		
		WebElement agreebutton=driver.findElement(By.xpath("//ins[@class='iCheck-helper']"));
		agreebutton.click();
		
		WebElement loginbutton= driver.findElement(By.xpath("//button[@id='btnLogin']"));
		loginbutton.click();
		
		WebElement profFarmer= driver.findElement(By.xpath("//body/div[@class='wrapper']/ul[@class='navmenu']/li[@class='profile']/a[1]"));
		profFarmer.click();
		
		WebElement Farmer= driver.findElement(By.xpath("//a[contains(text(),'Farmer')]"));
//		
		
		
		
		
		
//		WebElement tracenetcheckBox = driver.findElement(By.className("icheckbox_minimal-grey"));
//		tracenetcheckBox.click();
//		
//		WebElement clickNext = driver.findElement(By.name("login"));
//		clickNext.click();
//		
//		
//		//Profile 
//		WebElement clickProfile = driver.findElement(By.className("profile"));
//		clickProfile.click();
//		
//		//Buyer
//		WebElement clickBuyer=driver.findElement(By.xpath("//a[contains(text(),'Buyer')]"));
//		clickBuyer.click();
//		
//		WebElement buyerAdd= driver.findElement(By.xpath("//input[@id='add']"));
//		buyerAdd.click();
//		
//		WebDriverWait buyertype = new WebDriverWait(driver,60);
//		WebElement buyerType=buyertype.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-customer_create_customer_customerType-container")));
//		buyerType.click();
//		buyertype.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='Domestic']"))).click();
//		
//		
//		
//		WebElement clickProfileFarmer = driver.findElement(By.linkText("Farmer"));
//		clickProfileFarmer.click();
//		
////		WebElement clickProfsdfdfileFarmer = driver.findElement(By.xpath("//td[contains(text(),'Ramesh')]"));
////		clickProfsdfdfileFarmer.click();
//		
//		//Add Farmer
//        WebElement clickAddFarmer = driver.findElement(By.id("add")); //
//        clickAddFarmer.click();
//	
//        //Enrollment place
//		WebDriverWait enrollmentplace = new WebDriverWait(driver, 120);
//		WebElement enrollmentelement=enrollmentplace.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-enrollmentPlace-container")));
//		enrollmentelement.click();
//		enrollmentplace.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='At Warehouse']"))).click();
//		
//		//Farmer certified or not
//		WebElement clickCertfarmer = driver.findElement(By.id("farmerCertified1"));
//		clickCertfarmer.click();
//		
//		//Certification type
//		WebDriverWait certifType = new WebDriverWait(driver,60);
//		WebElement certificationType=certifType.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-certificationType-container")));
//		certificationType.click();
//		certifType.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='Individual']"))).click();
//		
//		Select icsTracenet =new Select (driver.findElement(By.id("regNotra")));
//		icsTracenet.selectByVisibleText("12345");
//	
//		WebElement firstname = driver.findElement(By.name("farmer.firstName")); 
//		firstname.sendKeys("Ramesh");
//		
//		WebElement lastname = driver.findElement(By.name("farmer.lastName")); 
//		lastname.sendKeys("bala");
//        
//		WebElement gendercheckBox = driver.findElement(By.id("target_farmer_genderMALE"));
//		gendercheckBox.click();
//		
//		WebElement genderchec5424kBox = driver.findElement(By.xpath("//input[@id='calendar']"));
//		genderchec5424kBox.click();
//		WebElement sdfsa = driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']//tr[1]//td[2]"));
//		sdfsa.click();
//		 
//		//WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='calendar']"));
//		 //dateBox.click();
////		driver.findElement(By.id("calendar")).click();
////		
////		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
////		
////		for(WebElement ele:allDates)
////		{
////			
////			String date=ele.getText();
////			
////			if(date.equalsIgnoreCase("28"))
////			{
////				ele.click();
////				break;
////			}
////			
////		}
////		
//		WebDriverWait education = new WebDriverWait(driver,60);
//		WebElement educationType=education.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='flexform-item education']//span[@class='select2-selection select2-selection--single']")));
//		educationType.click();
//		education.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='College']"))).click();
//		
//		WebDriverWait martialStatus = new WebDriverWait(driver,60);
//		WebElement marstatType=martialStatus.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-target_farmer_maritalSatus-container")));
//		marstatType.click();
//		martialStatus.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='Married']"))).click();
//		
////		WebDriverWait idProof = new WebDriverWait(driver,60);
////		WebElement idproofType=certifType.until(ExpectedConditions.presenceOfElementLocated(By.id("idProof")));
////		idproofType.click();
////		idProof.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='Philhealth ID']"))).click();
//		
//		Select dropdown = new Select(driver.findElement(By.id("idProof")));
//
//		dropdown.selectByVisibleText("Philhealth ID");
//		
//		WebElement proofNo = driver.findElement(By.id("proofNoInputVal")); 
//		proofNo.sendKeys("12342134");
//		
//		WebElement farmerAddress = driver.findElement(By.id("target_farmer_address")); 
//		farmerAddress.sendKeys("Gopalapuram");
//		
//		WebElement farmerMob = driver.findElement(By.id("target_farmer_mobileNumber")); 
//		farmerMob.sendKeys("9347883483");
//		
//		WebElement farmerEmail = driver.findElement(By.id("target_farmer_email")); 
//		farmerEmail.sendKeys("test@gmail.com");
//		
//		WebDriverWait country = new WebDriverWait(driver,60);
//		WebElement countryType=country.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-country-container")));
//		countryType.click();
//		country.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='C00001-Philippines']"))).click();
//		
//		Thread.sleep(2000);
//		WebDriverWait state = new WebDriverWait(driver,60);
//		WebElement stateType=state.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-state-container")));
//		stateType.click();
//		state.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='S00001-Northern Mindanao']"))).click();
//		
//		Thread.sleep(2000);
//		WebDriverWait district = new WebDriverWait(driver,60);
//		WebElement districtType=district.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-localities-container")));
//		districtType.click();
//		district.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='D00001-Misamis Oriental']"))).click();
//		
//		Thread.sleep(2000);
//		WebDriverWait city = new WebDriverWait(driver,60);
//		WebElement cityType=city.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-city-container")));	
//		cityType.click();
//		city.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='M00002-Magkarila']"))).click();
//		
//		Thread.sleep(2000);
//		WebDriverWait village = new WebDriverWait(driver,60);
//		WebElement villageType=village.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-village-container")));
//		villageType.click();
//		village.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='V000002-Talisayan']"))).click();
//		
//		WebDriverWait group = new WebDriverWait(driver,60);
//		WebElement groupType=group.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-samithii-container")));
//		groupType.click();
//		group.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='Group1']"))).click();
//		
//		WebDriverWait farmerStatus = new WebDriverWait(driver,60);
//		WebElement farmerStatusType=farmerStatus.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-farmerStatus-container")));
//		farmerStatusType.click();
//		farmerStatus.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='Active']"))).click();
//		
////		Thread.sleep(1000);
////		WebDriverWait familyInfo = new WebDriverWait(driver,60);
////		WebElement familyInfoType=familyInfo.until(ExpectedConditions.presenceOfElementLocated(By.id("familyInfo")));	
////		familyInfoType.click();
////		driver.findElement(By.xpath("//input[contains(@href,'#familyinfo']")).click();
//		WebElement familyInformation = driver.findElement(By.linkText("Family Information"));
//		familyInformation.click();
//		
//		
//		WebElement familyMembers = driver.findElement(By.id("familyMembers")); 
//		familyMembers.sendKeys("5");
//		
//		WebElement houseHold = driver.findElement(By.id("houseHold")); 
//		houseHold.sendKeys("5");
//		
//		WebElement target_farmer_headOfFamily1 = driver.findElement(By.id("target_farmer_headOfFamily1")); 
//		target_farmer_headOfFamily1.click();
//		
//		WebElement adultMale = driver.findElement(By.id("adultMale")); 
//		adultMale.sendKeys("1");
//		
//		WebElement adultFemale = driver.findElement(By.id("adultFemale")); 
//		adultFemale.sendKeys("1");
//		
//		WebElement childMale = driver.findElement(By.id("childMale")); 
//		childMale.sendKeys("1");
//		
//		WebElement childFemale = driver.findElement(By.id("childFemale")); 
//		childFemale.sendKeys("1");
//		
//		WebElement childCountonSiteMale = driver.findElement(By.id("childCountonSiteMale")); 
//		childCountonSiteMale.sendKeys("1");
//		
//		WebElement childCountonSiteFemale = driver.findElement(By.id("childCountonSiteFemale")); 
//		childCountonSiteFemale.sendKeys("1");
//		
//		//Asset Ownership*******************************
////		WebElement assetOwnership = driver.findElement(By.linkText("Asset Ownership"));
////		assetOwnership.click();
////		 
//		
//		WebDriverWait consumerElectronics = new WebDriverWait(driver,60);
//		WebElement consumerElectronicsType=consumerElectronics.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@aria-owns='select2-consumerElectronics-results']")));	
//		consumerElectronicsType.click();
//		consumerElectronics.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='Refrigerator']"))).click();
//		
////		WebDriverWait cellPhone = new WebDriverWait(driver,60);
////		WebElement cellPhoneType=farmerStatus.until(ExpectedConditions.presenceOfElementLocated(By.id("cellPhone")));
////		cellPhoneType.click();
////		cellPhone.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space(.)='Yes']"))).click();
//		Select cellPhonedropdown = new Select(driver.findElement(By.id("cellPhone")));
//		cellPhonedropdown.selectByVisibleText("Yes");
//		
//
//		WebElement loanDetails = driver.findElement(By.linkText("Loan Details"));
//		loanDetails.click();
//		
//		WebElement LoanTakencheckBox = driver.findElement(By.id("LoanTakenLastYear2"));
//		LoanTakencheckBox.click();
//		
////		WebElement saveButton = driver.findElement(By.id("buttonAdd1"));
////		saveButton.click();
//		
//		//To click the saved farmer in grid.
////		WebElement exixtingFarme = driver.findElement(By.id("50"));
////		exixtingFarme.click();
//	

	}

}

