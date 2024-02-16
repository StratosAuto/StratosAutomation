package Stratos_testBase;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testBase extends PageBase {
	
	public static String TestCaseName;
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	
	public static void waitForElement(By locator, long ltime) throws Exception {
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(ltime));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "Element not available");
		}
	}
	
	public static void typeinTextBox(By locator , String data,String elementName) throws Exception {
		try {
			if(driver.findElement(locator).isDisplayed()) {
//				driver.findElement(locator).click();
				driver.findElement(locator).clear();
				driver.findElement(locator).sendKeys(data);
				Logs.info("Text Entered into "+elementName);
			}else {
				Logs.info("Unable to enter text into "+elementName);
			}
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "Unable to Identify text field ");
		}
	}
	
	public static void clickonElement(By locator, String elementName) throws Exception {
		boolean bflag=false;
		try {
			if(driver.findElement(locator).isDisplayed()) {
				driver.findElement(locator).click();
				bflag=true;
				Logs.info("Clicked on "+elementName);
			}
			else {
				Logs.info("Unable to click on  "+elementName);
			}
			
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "Unable to click on element "+elementName);
		}
	}
	
	public static void JsclickonElement(By locator, String elementName) throws Exception {
		boolean bflag=false;
		try {
			if(driver.findElement(locator).isDisplayed()) {
				bflag=true;
				JavascriptExecutor executor=(JavascriptExecutor) driver;
				executor.executeAsyncScript("arguments[0].click();", driver.findElement(locator));
				Logs.info("Click on  "+elementName);
			}
			else {
				Logs.info("Unable to click on  "+elementName);
			}
			
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "Unable to click on element "+elementName);
		}
	}
	
	public static String getElementText(By locator, String elementName) throws Exception {
		String sText="";
		try {
			if(driver.findElement(locator).isDisplayed()) {
				sText=driver.findElement(locator).getText();
				Logs.info("Text got from "+elementName);
			}else
			{
				Logs.info("Unable to get Text from "+elementName);
			}
			
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "Unable to get text from element"+elementName);
		}
		return sText;
	}
	
	public static void NavigateToNewTab(int Tabnumber,String elementName) throws Exception {
		boolean bflag=false;
		
		try {
			PageBase.driver.switchTo().newWindow(WindowType.TAB);
			Logs.info("Navigated to New tab");
			}catch(Exception e) {
				ExceptionHandling.HandleExecption(e, "Unable to move new Tab"+elementName);
			}
	}
	public static List windowHandles(int TabNumber,String elementName) throws Exception {
		try {
			Set<String> windowHandle=PageBase.driver.getWindowHandles();
			List<String> windowHandleList= new ArrayList<>(windowHandle);
			
			PageBase.driver.switchTo().window(windowHandleList.get(TabNumber));
			Logs.info("Using Window Handles");
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "Unable to move given window"+elementName);
		}
		
		return null;
		
	}
	public static void NeavigateToNewWindow(int Window,String elementName) throws Exception {
		boolean bflag=false;
		
		try {
			PageBase.driver.switchTo().newWindow(WindowType.WINDOW);
			Logs.info("Navigated to New tab");
			}catch(Exception e) {
				ExceptionHandling.HandleExecption(e, "Unable to move new Window"+elementName);
			}
	}
	
	public static void clearTextbox(By object,String elementName) throws Exception {
        try {
            if(driver.findElements(object).size() > 0) {
                driver.findElement(object).clear();
            } else ExceptionHandling.HandleAssertion("Unable to find Element");
        }
        catch (Exception e) {
        	ExceptionHandling.HandleExecption(e,"Failed to clear text from " + elementName);
        }
    }
	
	public static void doubleClick(By object, String elementName) throws Exception {
		try {
			if (driver.findElement(object).isDisplayed()) {
				WebElement mo = driver.findElement(object);
				new Actions(driver).moveToElement(mo).doubleClick().build().perform();
			} else {
				ExceptionHandling.HandleAssertion("Failed to click on " + elementName);
			}
		} catch (Exception e) {
			ExceptionHandling.HandleExecption(e, "Failed to click on " + elementName);
		}
	}
	
	public static void RefreshPage() {
		driver.navigate().refresh();
	}
	
	public static boolean isElementVisible(By object,String elementName) throws Exception {
		boolean bFlag = false;
		try {
			if(driver.findElements(object).size() > 0) {
				bFlag= true;
			}
		} catch (Exception e) {
			ExceptionHandling.HandleExecption(e, "Unable to check if the " + elementName +" element is visible or not");
		}
		return bFlag;
	}
	public static List<WebElement> getElements(By Obj) throws Throwable {
		List<WebElement> webele = null;
		try {
			Thread.sleep(1000);
			webele = driver.findElements(Obj);
		} catch (Exception e) {
			ExceptionHandling.HandleExecption(e, e.toString());
		}
		return webele;
	}
	
	public static WebElement getListElementsText(By object) throws Exception {
		try {
			List<WebElement> listofele = driver.findElements(object);
			for(WebElement i : listofele) {
				return i;
			}
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "Fail to locate Elements");

		}
		
		return null;
		}
	
	public static WebElement getListElementsTextList(By object) throws Exception {
		List<String> elements = new ArrayList<>();
		try {
			List<WebElement> listofele = driver.findElements(object);
			for(WebElement i : listofele) {
				String text = i.getText();
				elements.add(text);
			}
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "Fail to locate Elements");

		}
		
		return null;
		}
	
	public static boolean isDisplayed(By profileName) throws Exception {
		boolean flag = false;
		
		try {
			flag = driver.findElement(profileName).isDisplayed();
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "incorrect profile name");

		}
		return false;	
	}
	
	public static void dropdownSelectElement(By objLocator, String status) throws Throwable {
		try {
			Select s = new Select(driver.findElement(objLocator));
			s.selectByVisibleText(status);
		} catch (Exception e) {
			ExceptionHandling.HandleExecption(e, "Option not selected");
		}
	}
	
	public static void ClickWithActions(By object, String elementName) throws Exception {
		try {
			if (driver.findElement(object).isDisplayed()) {
				WebElement mo = driver.findElement(object);
				new Actions(driver).moveToElement(mo).click().build().perform();
			} else {
				ExceptionHandling.HandleAssertion("Failed to click on " + elementName);
			}
		} catch (Exception e) {
			ExceptionHandling.HandleExecption(e, "Failed to click on " + elementName);
		}
	}
	
	public static void mouseOver(By ele) throws Exception {
		try {
			Actions action = new Actions(PageBase.driver);
			action.moveToElement(driver.findElement(ele)).build().perform();
		}catch (Exception e) {
			ExceptionHandling.HandleExecption(e, "Failed to click on ");
		}
	}
	public static void ClickViaMouse(By object,String elementName) throws Exception {
		try {
			if(driver.findElements(object).size() > 0) {
				WebElement mo = driver.findElement(object);
				new Actions(driver).moveToElement(mo).click().build().perform();
			}
			else {
				ExceptionHandling.HandleAssertion("Unable to click on element " + elementName);
			}
		} catch (Exception e) {
			ExceptionHandling.HandleExecption(e, "Failed to click on " + elementName );
		}
	}
	public static void ClickWithActions(By Nearobj,By targetobj,String eleName) throws Exception {
		try {
			WebElement nearEle = driver.findElement(Nearobj);
			WebElement targetEle = driver.findElement(targetobj);
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",targetEle);
			if(driver.findElement(targetobj).isDisplayed()) {
				new Actions(driver).moveToElement(nearEle).click(targetEle).build().perform();
			}else {
				ExceptionHandling.HandleAssertion("Element"+eleName+" not Displayed");
			}
		}catch (Exception e) {
			ExceptionHandling.HandleExecption(e, "Unable to click on "+eleName);
		}
	}
	
	public static String getCurrentDateTime(String timeZone, String elementName) {
		String getCurrentDateandTime = null;
		try {
			TimeZone.setDefault(TimeZone.getTimeZone(timeZone));
			SimpleDateFormat dateformat = new SimpleDateFormat("ddMMyyyyhhmmss");
			Date date = new Date();
			getCurrentDateandTime = dateformat.format(date);
		}catch(Exception e) {
			Logs.info("Unable to get the time and date of "+timeZone+" timezone");
		}
		
		return getCurrentDateandTime;
		
	}
	public static boolean waitForElementToBevisible(By Locator, long lTime) throws Exception {
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));	
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
			return true;
		} catch (Exception e) {
			ExceptionHandling.HandleExecption(e, "Failed to wait for element to be visible");
			return true;
		}
	}
	public static void ScrollDownBottom() throws Throwable {
		
			try {

				JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.scrollBy(0,300);");

	        } catch (Exception e) {

	        	ExceptionHandling.HandleExecption(e, "unable to scroll down");

	        }
	}
	public static void ScrollUp() throws Throwable {
		
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(300,0);");

        } catch (Exception e) {

        	ExceptionHandling.HandleExecption(e, "unable to scroll Up");

        }
}
	
	
	public static String getTextFromPropertis(By object) throws Exception {
		String text = null;
		try {
			text = (String) ((JavascriptExecutor) PageBase.driver).executeScript("return arguments[0].value;", PageBase.driver.findElement(object));	
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "unable to get text from properties");
		}
		
		return text;
		
	}
	
	public static String getElementAttribute(By object, String AttributeName, String elementName) throws Exception {
		String sText = "";
		try {
			if(driver.findElement(object).isDisplayed()) {
				sText = driver.findElement(object).getAttribute(AttributeName);
			}else {
				Logs.info("failed to get Text from the "+ elementName + "Element");
			}
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "Element Text not available");
		}
		return sText;
		
	}
	public static String randomNumeric(int stringLength) {
		 
		 String randomString = null;

		 try {

		 String num = "0123456789";

		 StringBuilder sb = new StringBuilder();

		 Random random = new Random();

		 int length = stringLength;

		 for (int i = 0; i < length; i++) {

		 int index = random.nextInt(num.length());

		 char randomChar = num.charAt(index);

		 sb.append(randomChar);

		 }

		 String randomstring = sb.toString();

		 randomString = randomstring;
		 Logs.info("Generates Random Numbers");
		 } catch (Exception e) {

		 Logs.info("Unable to generate the Random Numbers value");

		 }

		 return randomString;

		}

		public static String randomAplhabet(int stringLength) {

		 String randomString = null;

		 try {

		 String smallalpha = "abcdefghijklmnopqrstuvwxyz";

		 StringBuilder sb = new StringBuilder();

		 Random random = new Random();

		 int length = stringLength;

		 for (int i = 0; i < length; i++) {

		 int index = random.nextInt(smallalpha.length());

		 char randomChar = smallalpha.charAt(index);

		 sb.append(randomChar);

		 }

		 String randomstring = sb.toString();

		 randomString = randomstring;
		 Logs.info("Generates Random Alphabets");

		 } catch (Exception e) {

		 Logs.info("Unable to generate the Random Alphabets value");

		 }

		 return randomString;

		}


		public static String randomAlphanumeric(int stringLength) {

		 String randomString = null;

		 try {

		 String smallalpha = "abcdefghijklmnopqrstuvwxyz";

		 String captialAplha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		 String number = "0123456789";

		 String alphaNumeric = smallalpha + captialAplha + number;


		 StringBuilder sb = new StringBuilder();

		 Random random = new Random();

		 int length = stringLength;

		 for (int i = 0; i < length; i++) {

		 int index = random.nextInt(alphaNumeric.length());

		 char randomChar = alphaNumeric.charAt(index);

		 sb.append(randomChar);

		 }

		 String randomstring = sb.toString();

		 randomString = randomstring;

		 Logs.info("Generated Alphanumeric values");

		 } catch (Exception e) {

		 Logs.info("Unable to generate the Random AlphaNumeric value");

		 }

		 return randomString;

		}
		public static void takeScreenshot(String filename) {
	        try {
	        	LocalDateTime now = LocalDateTime.now();
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy HH:mm:ss");
	            String timestamp = now.format(formatter);
	            timestamp = timestamp.replace(" ", "_").replace(":", "_");
	            String fullFilename = filename + "_" + timestamp + ".png";
	            File screenshot = ((TakesScreenshot) PageBase.driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(screenshot, new File("./Screenshots/" + fullFilename));
	        } catch (Exception e) {
	            // Handle exceptions, for example, log them or display an error message
	            e.printStackTrace();
	        }
		}
	        public static void FileUpload(By object,String filepath) throws Exception
	    	{
	           try {
	    			Thread.sleep(3000);
	    	        String absoluteFilePath = System.getProperty("user.dir") + "/" + filepath;
	    	        PageBase.driver.findElement(object).sendKeys(absoluteFilePath);
	    	        Logs.info("File is uploaded Sucessfully");
	    	        
	           }catch (Exception e){
	    			ExceptionHandling.HandleExecption(e, "Unable to upload file");
	           }
	    	}
}